package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.CajaTotal;
import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Usuario;
import com.mycompany.supermecardo.entidades.Venta;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CierreDeCaja extends javax.swing.JFrame {

    private Controladora control;
    private DefaultTableModel modeloTabla;
    private Usuario user;
    private String horaCierre;
    private String observacion;
    private List<Venta> ventaPorCaja;

    public CierreDeCaja(Usuario user) {
        initComponents();
        this.user = user;
        this.control = new Controladora();
        Date horaCierre = new Date();
        SimpleDateFormat horaSdf = new SimpleDateFormat("HH:mm");
        this.horaCierre = horaSdf.format(horaCierre);
        this.ventaPorCaja = new ArrayList<>();
        this.observacion = "";
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        lblTotalCaja = new javax.swing.JLabel();
        lblEfete = new javax.swing.JLabel();
        lblTrans = new javax.swing.JLabel();
        lblCred = new javax.swing.JLabel();
        lblDebit = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnObservacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-de-acuerdo-48.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cierre de caja");

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblVentas);

        lblTotalCaja.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTotalCaja.setText("Total");

        lblEfete.setText("Efectivo");

        lblTrans.setText("Transferencia");

        lblCred.setText("Credito");

        lblDebit.setText("Debito");

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-volver-48.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnObservacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-agregar-propiedad-48.png"))); // NOI18N
        btnObservacion.setText("Observación");
        btnObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObservacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(386, 386, 386))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObservacion)
                        .addGap(206, 206, 206)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDebit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTrans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEfete, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObservacion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEfete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTrans)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCred)
                        .addGap(18, 18, 18)
                        .addComponent(lblDebit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnAceptar))
                .addGap(23, 23, 23))
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

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        CajaTotal caja = new CajaTotal();
        caja.setListaDeVentas(ventaPorCaja);
        caja.setFecha(new Date());
        caja.setHoraCierre(horaCierre);
        caja.setObservacion(observacion);
        control.cerrarCaja(caja);
        ventaPorCaja.clear();
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObservacionActionPerformed
        Observacion obs = new Observacion(this);
        obs.setVisible(true);
        obs.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnObservacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnObservacion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCred;
    private javax.swing.JLabel lblDebit;
    private javax.swing.JLabel lblEfete;
    private javax.swing.JLabel lblTotalCaja;
    private javax.swing.JLabel lblTrans;
    private javax.swing.JTable tblVentas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        String titulos[] = {"Nombre/Vendedor", "Año", "Mes", "Dia", "Hora", "Monto $", "Forma de pago"};
        modeloTabla = new DefaultTableModel(titulos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        List<Venta> ventasUsuario = control.traerVentasVendedor(user.getNombreUsuario());

        String hora = hora(horaCierre);
        String minutos = minutos(horaCierre);
        Double totalCaja = 0.0;
        Double totalTransferencia = 0.0;
        Double totalEfectivo = 0.0;
        Double totalDebito = 0.0;
        Double totalCredito = 0.0;

        if (!ventasUsuario.isEmpty()) {
            for (Venta venta : ventasUsuario) {

                String horaVenta = hora(venta.getHorario());
                String minutosVenta = minutos(venta.getHorario());

                if (venta.getFecha().getDate() == (new Date().getDate())) {
                    if (Integer.parseInt(horaVenta) <= Integer.parseInt(hora) && Integer.parseInt(minutosVenta) <= Integer.parseInt(minutos)) {
                        Object[] objeto = {venta.getVendedor().getNombreUsuario(), venta.getFecha().getYear() + 1900,
                            venta.getFecha().getMonth() + 1, venta.getFecha().getDate(),
                            venta.getHorario(), "$ " + venta.getPrecio(),
                            venta.getFormpago()};
                        ventaPorCaja.add(venta);
                        totalCaja += venta.getPrecio();

                        if (venta.getFormpago().equalsIgnoreCase("transferencia")) {
                            totalTransferencia += venta.getPrecio();
                        } else if (venta.getFormpago().equalsIgnoreCase("débito")) {
                            totalDebito += venta.getPrecio();
                        } else if (venta.getFormpago().equalsIgnoreCase("crédito")) {
                            totalCredito += venta.getPrecio();
                        } else if (venta.getFormpago().equalsIgnoreCase("efectivo")) {
                            totalEfectivo += venta.getPrecio();
                        }

                        modeloTabla.addRow(objeto);
                    }
                }

            }
        }
        lblTotalCaja.setText("Total caja: $" + totalCaja);
        lblCred.setText("Total Crédito: $" + totalCredito);
        lblDebit.setText("Total Debito: $" + totalDebito);
        lblEfete.setText("Total Efectivo: $" + totalEfectivo);
        lblTrans.setText("Total Transferencia: $" + totalTransferencia);
        tblVentas.setModel(modeloTabla);
    }

    private String hora(String horaModificar) {
        String hora = "";

        for (int i = 0; i <= 1; i++) {
            hora += horaModificar.charAt(i);
        }

        return hora;
    }

    private String minutos(String horaModificar) {
        String minutos = "";

        for (int i = 3; i <= 4; i++) {
            minutos += horaModificar.charAt(i);
        }

        return minutos;
    }

    public void observacionVenta(String obs) {
        this.observacion = obs;
    }

}
