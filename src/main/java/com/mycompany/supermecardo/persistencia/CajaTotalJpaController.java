package com.mycompany.supermecardo.persistencia;

import com.mycompany.supermecardo.entidades.CajaTotal;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class CajaTotalJpaController implements Serializable {

    public CajaTotalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public CajaTotalJpaController() {
        emf = Persistence.createEntityManagerFactory("Supermercado");
    }
    
    

    public void create(CajaTotal cajaTotal) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cajaTotal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(CajaTotal cajaTotal) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cajaTotal = em.merge(cajaTotal);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = cajaTotal.getIdCaja();
                if (findCajaTotal(id) == null) {
                    throw new NonexistentEntityException("The cajaTotal with id " + id + " no longer exists.");
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
            CajaTotal cajaTotal;
            try {
                cajaTotal = em.getReference(CajaTotal.class, id);
                cajaTotal.getIdCaja();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cajaTotal with id " + id + " no longer exists.", enfe);
            }
            em.remove(cajaTotal);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<CajaTotal> findCajaTotalEntities() {
        return findCajaTotalEntities(true, -1, -1);
    }

    public List<CajaTotal> findCajaTotalEntities(int maxResults, int firstResult) {
        return findCajaTotalEntities(false, maxResults, firstResult);
    }

    private List<CajaTotal> findCajaTotalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CajaTotal.class));
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

    public CajaTotal findCajaTotal(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(CajaTotal.class, id);
        } finally {
            em.close();
        }
    }

    public int getCajaTotalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CajaTotal> rt = cq.from(CajaTotal.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
