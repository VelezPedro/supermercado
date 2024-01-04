package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Usuario;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ModificarProducto extends javax.swing.JFrame {

    Controladora control = null;
    String codigoId;
    Producto producto;
    Usuario user;

    public ModificarProducto(String codigoId, Usuario user) {
        control = new Controladora();
        initComponents();
        //se cargan los datos cuando se inicia el modificar productos
        cargarDatos(codigoId);
        this.user = user;
        ajustarAlTamañoDeLaPantalla();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nbrProducto = new javax.swing.JTextField();
        costo = new javax.swing.JTextField();
        precioVenta = new javax.swing.JTextField();
        formVenta = new javax.swing.JComboBox<>();
        categoria = new javax.swing.JComboBox<>();
        limpiar = new javax.swing.JButton();
        guardarCambios = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        stock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Producto");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        nbrProducto.setForeground(new java.awt.Color(102, 153, 255));
        nbrProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrProducto.setText("Nombre del producto");
        nbrProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        formVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formVentaActionPerformed(evt);
            }
        });

        categoria.setForeground(new java.awt.Color(51, 153, 255));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Panaderia", "Fiambreria", "Carniceria", "Bebida", "Almacen", "Limpieza", "Lacteos" }));

        limpiar.setBackground(java.awt.SystemColor.activeCaption);
        limpiar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-escoba-50.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        guardarCambios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        guardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-guardar-48.png"))); // NOI18N
        guardarCambios.setText("Guardar Cambios");
        guardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCambiosActionPerformed(evt);
            }
        });

        volver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-volver-48.png"))); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        stock.setForeground(new java.awt.Color(102, 153, 255));
        stock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stock.setText("Stock");

        jLabel2.setText("Nombre del producto");

        jLabel3.setText("Costo $");

        jLabel4.setText("Stock");

        jLabel5.setText("Precio de Venta $");

        jLabel6.setText("Unidad de Medida");

        jLabel7.setText("Categoría");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(costo, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(nbrProducto)
                    .addComponent(formVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stock, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiar)
                .addGap(119, 119, 119)
                .addComponent(guardarCambios)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbrProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(volver)
                    .addComponent(guardarCambios))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(263, 263, 263))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        nbrProducto.setText("");
        costo.setText("");
        precioVenta.setText("");
        formVenta.setSelectedIndex(0);
        categoria.setSelectedIndex(0);
        stock.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        VerProductos verProductos = new VerProductos(user);
        verProductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void guardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCambiosActionPerformed
        try {
            String catego = (String) categoria.getSelectedItem();
            String formaDeVenta = (String) formVenta.getSelectedItem();

            control.modificarProducto(producto, nbrProducto, stock, costo, precioVenta, catego, formaDeVenta);

            mensaje("Edicion correcta", "Info", "Edicion Correcta");
            VerProductos pantalla = new VerProductos(user);
            pantalla.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            mensaje("Edicion incorrecta", "Error", "Edicion Incorrecta");
            Logger.getLogger(ModificarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_guardarCambiosActionPerformed

    private void formVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JTextField costo;
    private javax.swing.JComboBox<String> formVenta;
    private javax.swing.JButton guardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nbrProducto;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JTextField stock;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(String codigoId) {
        this.producto = control.traerProducto(codigoId);
        nbrProducto.setText(producto.getNombre());
        costo.setText(String.valueOf(producto.getCosto()));
        precioVenta.setText(String.valueOf(producto.getPrecio()));
        stock.setText(String.valueOf(producto.getStock()));

        //Set de combox forma de venta!
        if (producto.getFromVenta().equalsIgnoreCase("unidad")) {
            formVenta.setSelectedIndex(1);
        } else {
            formVenta.setSelectedIndex(2);
        }
        //Set de combox categoria
        if (producto.getCategoria().equalsIgnoreCase("panaderia")) {
            categoria.setSelectedIndex(1);
        } else if (producto.getCategoria().equalsIgnoreCase("fiambreria")) {
            categoria.setSelectedIndex(2);
        } else if (producto.getCategoria().equalsIgnoreCase("carniceria")) {
            categoria.setSelectedIndex(3);
        } else if (producto.getCategoria().equalsIgnoreCase("bebida")) {
            categoria.setSelectedIndex(4);
        } else if (producto.getCategoria().equalsIgnoreCase("almacen")) {
            categoria.setSelectedIndex(5);
        } else if (producto.getCategoria().equalsIgnoreCase("limpieza")) {
            categoria.setSelectedIndex(6);
        } else if (producto.getCategoria().equalsIgnoreCase("lacteos")) {
            categoria.setSelectedIndex(7);
        } else {
            categoria.setSelectedIndex(0);
        }
    }

    public void mensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog("titulo");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void ajustarAlTamañoDeLaPantalla() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);

        // Establece el layout manager del JFrame como GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);

        // Configura las restricciones para centrar y expandir automáticamente los componentes
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;

        // Agrega un panel vacío para ocupar todo el espacio disponible
        JPanel emptyPanel = new JPanel();
        this.add(emptyPanel, gbc);
    }

}
