package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Ticket;
import com.mycompany.supermecardo.entidades.Venta;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentaDeUna extends javax.swing.JFrame {

    private VentasTotales ventasTotales;
    private Venta venta;
    private DefaultTableModel modeloTabla;
    private Controladora control;

    public VentaDeUna(Venta venta, VentasTotales ventasTotales) {
        initComponents();
        this.venta = venta;
        this.ventasTotales = ventasTotales;
        control = new Controladora();
        String titulos[] = {"Producto", "Unidades", "Precio por Unidad", "Total"};
        modeloTabla = new DefaultTableModel(titulos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
//                return column == 1;      CON ESTO PERMITE EDITAR LA COLUMNA QUE SE DESEE
                return false;
            }
        };
        cargarVenta(venta);
        cargarLbl(venta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreVendedor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JToggleButton();
        lblAnio = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblDia = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblFormaDePago = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        lblDescuento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblNombre.setText("Venta + Id ");

        jLabel1.setText("Vendedor :");

        lblNombreVendedor.setText("jLabel2");

        jLabel2.setText("Año : ");

        jLabel3.setText("Mes : ");

        jLabel4.setText("Dia : ");

        jLabel5.setText("Hora :");

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        jLabel6.setText("Total: $");

        jLabel7.setText("Forma de Pago :");

        btnVolver.setText("<-Volver<-");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblAnio.setText("jLabel8");

        lblMes.setText("jLabel8");

        lblDia.setText("jLabel8");

        lblHora.setText("jLabel8");

        lblTotal.setText("jLabel8");

        lblFormaDePago.setText("jLabel8");

        btnEliminar.setText("XEliminarX");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblDescuento.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombreVendedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFormaDePago)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombre)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAnio)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMes)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addComponent(lblDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblHora))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lblDescuento)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblNombre)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNombreVendedor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lblAnio)
                    .addComponent(lblMes)
                    .addComponent(lblDia)
                    .addComponent(lblHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDescuento)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(btnVolver)
                    .addComponent(lblTotal)
                    .addComponent(lblFormaDePago)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String idTicket=venta.getTicket().getId();
            control.borrarVenta(venta.getId());
            control.borrarTicket(idTicket);
            ventasTotales.limpiarTabla();
            ventasTotales.cargarTabla();
            this.dispose();
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(VentaDeUna.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblFormaDePago;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreVendedor;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblProducto;
    // End of variables declaration//GEN-END:variables

    private void cargarVenta(Venta venta) {
        
        if (venta != null) {
            Ticket ticket =control.buscarTicket(venta.getTicket().getId());
            List<Object> info= ticket.getListaDeInfo();
            for (Object objetos : info) {
                modeloTabla.addRow((Object[]) objetos);
            }
            tblProducto.setModel(modeloTabla);
        }
    }

    private void cargarLbl(Venta venta) {
        lblNombre.setText("Numero de venta #"+venta.getId());
        lblNombreVendedor.setText(venta.getVendedor().getNombreUsuario());
        lblAnio.setText(String.valueOf(venta.getFecha().getYear()+1900));
        lblMes.setText(String.valueOf(venta.getFecha().getMonth()+1));
        lblDia.setText(String.valueOf(venta.getFecha().getDate()));
        lblHora.setText(String.valueOf(venta.getHorario()));
        lblTotal.setText(String.valueOf(venta.getPrecio()));
        lblDescuento.setText("Descuento % "+venta.getDescuentoPorPorcentaje() + " $ " + venta.getDescuentoPorPrecio());
        lblFormaDePago.setText(String.valueOf(venta.getFormpago()));
    }
}
