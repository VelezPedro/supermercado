package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Usuario;

public class PanelVendedor extends javax.swing.JFrame {

    Controladora control;
    Usuario user;

    public PanelVendedor(Controladora control, Usuario user) {
        initComponents();
        this.user = user;
        this.control = control;
        lblUsuario.setText(user.getNombreUsuario());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnCerrarCaja = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SUPERMERCADO M&M");

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-bolsas-de-compra-48.png"))); // NOI18N
        btnVenta.setText("VENTA");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-cerrar-sesión-48.png"))); // NOI18N
        btnCerrar.setText("CERRAR SESION");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnCerrarCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-dinero-64.png"))); // NOI18N
        btnCerrarCaja.setText("CERRAR CAJA");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        lblUsuario.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)
                        .addContainerGap(407, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(lblUsuario)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(lblUsuario)
                .addGap(158, 158, 158)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        VentaVista venta = new VentaVista(user);
        venta.setVisible(true);
        venta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
        CierreDeCaja cierreDeCaja = new CierreDeCaja(user);
        cierreDeCaja.setVisible(true);
        cierreDeCaja.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarCajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarCaja;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
