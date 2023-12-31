package com.mycompany.supermecardo.persistencia;

import com.mycompany.supermecardo.entidades.Venta;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class VentaJpaController implements Serializable {

    public VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public VentaJpaController() {
        emf = Persistence.createEntityManagerFactory("Supermercado");
    }

    public void create(Venta venta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Venta venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            venta = em.merge(venta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = venta.getId();
                if (findVenta(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta venta;
            try {
                venta = em.getReference(Venta.class, id);
                venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Venta> findVentaEntities() {
        return findVentaEntities(true, -1, -1);
    }

    public List<Venta> findVentaEntities(int maxResults, int firstResult) {
        return findVentaEntities(false, maxResults, firstResult);
    }

    private List<Venta> findVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Venta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Venta findVenta(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Venta> rt = cq.from(Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public List<Venta> listaVentasVendedor(String nombre) {
        EntityManager em = getEntityManager();
        List<Venta> listaVentas
                = (List<Venta>) em.createQuery("SELECT v FROM Venta v WHERE v.vendedor.nombreUsuario LIKE :nombre").
                        setParameter("nombre", nombre).getResultList();
        return listaVentas;
    }

    public List<Venta> buscarTodo(String vendedor, String anio, String mes, String dia, String formaDePago) {
        EntityManager em = getEntityManager();
        Date fechaInicio = null;
        Date fechaFin = null;

        // Construir la consulta
        String consulta = "SELECT v FROM Venta v WHERE 1 = 1";

        if (vendedor != null && !vendedor.isEmpty()) {
            consulta += " AND v.vendedor.nombreUsuario = :vendedor";
        }

        if (anio != null && !anio.isEmpty() && mes != null && !mes.isEmpty() && dia != null && !dia.isEmpty()) {
            LocalDate fechaBusqueda = LocalDate.of(Integer.parseInt(anio), Integer.parseInt(mes), Integer.parseInt(dia));
            fechaInicio = Date.from(fechaBusqueda.atStartOfDay(ZoneId.systemDefault()).toInstant());
             fechaFin = Date.from(fechaBusqueda.atTime(LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant());

            consulta += " AND v.fecha BETWEEN :fechaInicio AND :fechaFin";
        }

        if (formaDePago != null && !formaDePago.isEmpty()) {
            consulta += " AND v.formpago = :formaDePago";
        }

        // Crear la consulta
        TypedQuery<Venta> query = em.createQuery(consulta, Venta.class);

        // Establecer los parámetros
        if (vendedor != null && !vendedor.isEmpty()) {
            query.setParameter("vendedor", vendedor);
        }

        if (anio != null && !anio.isEmpty() && mes != null && !mes.isEmpty() && dia != null && !dia.isEmpty()) {
            query.setParameter("fechaInicio", fechaInicio);
            query.setParameter("fechaFin", fechaFin);
        }

        if (formaDePago != null && !formaDePago.isEmpty()) {
            query.setParameter("formaDePago", formaDePago);
        }

        // Ejecutar la consulta y devolver los resultados
        return query.getResultList();

    }
}
