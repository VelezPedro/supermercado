package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class CrearProducto extends javax.swing.JFrame {

    Controladora control=new Controladora();
    //quiza lo tenga que hacer como arriba
    Usuario user;
    
    public CrearProducto(Usuario user) {
        initComponents();
        this.user=user;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nbrProducto = new javax.swing.JTextField();
        codigoId = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        precioVenta = new javax.swing.JTextField();
        formVenta = new javax.swing.JComboBox<>();
        categoria = new javax.swing.JComboBox<>();
        limpiar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        stock = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear Producto");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        nbrProducto.setForeground(new java.awt.Color(102, 153, 255));
        nbrProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrProducto.setText("Nombre del producto");
        nbrProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        codigoId.setForeground(new java.awt.Color(102, 153, 255));
        codigoId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigoId.setText("Codigo(Numeros)");
        codigoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoIdActionPerformed(evt);
            }
        });

        costo.setForeground(new java.awt.Color(102, 153, 255));
        costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costo.setText("Costo");
        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        precioVenta.setForeground(new java.awt.Color(102, 153, 255));
        precioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precioVenta.setText("Precio de Venta");
        precioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaActionPerformed(evt);
            }
        });

        formVenta.setForeground(new java.awt.Color(102, 153, 255));
        formVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Unidad", "Gramo" }));

        categoria.setForeground(new java.awt.Color(51, 153, 255));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Panaderia", "Fiambreria", "Carniceria", "Bebida", "Almacen", "Limpieza", "Lacteos" }));

        limpiar.setBackground(java.awt.SystemColor.activeCaption);
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 221, 14));
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        volver.setText("<-Volver<-");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        stock.setForeground(new java.awt.Color(102, 153, 255));
        stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock.setText("Stock");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(precioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(costo, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(codigoId, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                            .addComponent(nbrProducto)
                            .addComponent(formVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stock, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(limpiar)
                        .addGap(142, 142, 142)
                        .addComponent(guardar)))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(volver)
                .addGap(357, 357, 357))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(nbrProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codigoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(formVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(volver)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(292, 292, 292))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void codigoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoIdActionPerformed

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        nbrProducto.setText("");
        codigoId.setText("");
        costo.setText("");
        precioVenta.setText("");
        formVenta.setSelectedIndex(0);
        categoria.setSelectedIndex(0);
        stock.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        Principal principal=new Principal(control,user);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
        String catego= (String) categoria.getSelectedItem();
        String formaDeVenta= (String) formVenta.getSelectedItem();
            control.guardar(codigoId,nbrProducto,stock,costo,precioVenta,catego,formaDeVenta,0);
            JOptionPane optionPane=new JOptionPane("Extito en guardar = " + nbrProducto.getText());
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog=optionPane.createDialog("Guarda Productos");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(CrearProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_guardarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField codigoId;
    private javax.swing.JTextField costo;
    private javax.swing.JComboBox<String> formVenta;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nbrProducto;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JTextField stock;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
