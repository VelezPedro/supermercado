package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Usuario;
import com.mycompany.supermecardo.entidades.Venta;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CierreDeCaja extends javax.swing.JFrame {

    private Controladora control;
    private DefaultTableModel modeloTabla;
    private Usuario user;
    private String horaCierre;

    public CierreDeCaja(Usuario user) {
        initComponents();
        this.user = user;
        this.control = new Controladora();
        Date horaCierre = new Date();
        SimpleDateFormat horaSdf = new SimpleDateFormat("HH:mm");
        this.horaCierre = horaSdf.format(horaCierre);
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        lblTotalCaja.setText("Total");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAceptar))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTotalCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalCaja)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(24, 24, 24))
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
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalCaja;
    private javax.swing.JTable tblVentas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        String titulos[] = {"Nombre/Vendedor", "Año", "Mes", "Dia", "Hora", "Monto $"};
        modeloTabla = new DefaultTableModel(titulos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        List<Venta> ventasUsuario = control.traerVentasVendedor(user.getNombreUsuario());
        String minutos = "";
        String hora = "";

        for (int i = 3; i <= 4; i++) {
            minutos += horaCierre.charAt(i);
        }

        for (int i = 0; i <= 1; i++) {
            hora += horaCierre.charAt(i);
        }

        if (!ventasUsuario.isEmpty()) {
            for (Venta venta : ventasUsuario) {
                String minutosVenta = "";
                String horaVenta = "";

                for (int i = 3; i <= 4; i++) {
                    minutosVenta += venta.getHorario().charAt(i);
                }

                for (int i = 0; i <= 1; i++) {
                    horaVenta += venta.getHorario().charAt(i);
                }

                if ( venta.getFecha().getDate() == (new Date().getDate()) ) {
                    if (Integer.parseInt(horaVenta) <= Integer.parseInt(hora) && Integer.parseInt(minutosVenta) <= Integer.parseInt(minutos)) {
                        Object[] objeto = {venta.getVendedor().getNombreUsuario(), venta.getFecha().getYear() + 1900,
                            venta.getFecha().getMonth() + 1, venta.getFecha().getDate(),
                            venta.getHorario(), "$ " + venta.getPrecio()};

                        modeloTabla.addRow(objeto);
                        continue;
                    }
                } else {
                }
            }
        }

        tblVentas.setModel(modeloTabla);
    }
}
