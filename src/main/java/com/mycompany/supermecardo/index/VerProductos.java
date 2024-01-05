package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VerProductos extends javax.swing.JFrame {

    Controladora control;
    Usuario user;
    List<Producto> listaProductos;

    public VerProductos(Usuario user) {
        control = new Controladora();
        this.user = user;
        listaProductos = null;
        initComponents();
        PlaceholderExample();
        ajustarAlTamañoDeLaPantalla();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnAgregarStock = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbStock = new javax.swing.JComboBox<>();
        cmbCategorias = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaProductos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eliminar-64.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-editar-64.png"))); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-volver-48.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-agregar-propiedad-48.png"))); // NOI18N
        btnAgregarStock.setText("Agregar Stock");
        btnAgregarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnVolver)
                        .addGap(48, 48, 48)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editar)
                        .addGap(26, 26, 26)
                        .addComponent(btnAgregarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregarStock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editar)
                            .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Buscar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel2.setText("CODIGO");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("CATEGORIA");

        jLabel5.setText("STOCK");

        cmbStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "De mayor a menor", "De menor a mayor" }));

        cmbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ver-archivo-48.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-escoba-50.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbStock, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addComponent(btnLimpiar)
                .addGap(31, 31, 31)
                .addComponent(btnBuscar)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnLimpiar))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Lista de Productos");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(297, 297, 297))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        rellenarCategoria();
    }//GEN-LAST:event_formWindowOpened

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // conotrolo que la tabla tenga porlomenos un registro
        if (tablaProductos.getRowCount() > 0) {
            //controlo que haya algo seleccionado
            if (tablaProductos.getSelectedRow() != -1) {
                String codigoId = (String) (tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
                System.out.println(codigoId);
                control.borrarProducto(codigoId);
                mensaje("Producto eliminado correctamente", "Info", "Borrado de Produtos");
                cargarTabla();
            } else {
                mensaje("No se selecciono ningun producto", "Error", "Borrado de Productos");
            }
        } else {
            mensaje("No hay elementos cargados", "Error", "Error de Tabla");
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        if (tablaProductos.getRowCount() > 0) {
            //controlo que haya algo seleccionado
            if (tablaProductos.getSelectedRow() != -1) {
                String codigoId = (String) (tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));

                ModificarProducto pantallModf = new ModificarProducto(codigoId, user);
                pantallModf.setVisible(true);

                cargarTabla();
                this.dispose();
            } else {
                mensaje("No se selecciono ningun producto", "Error", "Borrado de Productos");
            }
        } else {
            mensaje("No hay elementos cargados", "Error", "Error de Tabla");
        }

    }//GEN-LAST:event_editarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        Principal principal = new Principal(control, user);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarStockActionPerformed

        if (tablaProductos.getRowCount() > 0) {

            if (tablaProductos.getSelectedRow() != -1) {
                Producto producto = control.traerProducto((String) tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0));
                AgregarStock agregarStock = new AgregarStock(producto, control, user);
                agregarStock.setVisible(true);
                agregarStock.setLocationRelativeTo(null);

            } else {
                mensaje("No se selecciono ningun producto", "Error", "Borrado de Productos");
            }
        } else {
            mensaje("No hay elementos cargados", "Error", "Error de Tabla");
        }


    }//GEN-LAST:event_btnAgregarStockActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        List<Producto> productoBusqueda = new ArrayList<>();
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        String categoria = (String) cmbCategorias.getSelectedItem();
        int stock = cmbStock.getSelectedIndex();

        if (!codigo.equalsIgnoreCase("CODIGO # 00")) {
            productoBusqueda.add(control.traerProducto(codigo));
            cargarTabla(productoBusqueda);
        } else if (!nombre.equals("NOMBRE")) {
            for (Producto produ : listaProductos) {
                if (produ.getNombre().contains(nombre)) {
                    productoBusqueda.add(produ);
                }
            }
            cargarTabla(productoBusqueda);
        } else if (!categoria.equals("-")) {
            for (Producto listaProducto : listaProductos) {
                if (listaProducto.getCategoria().contains(categoria)) {
                    productoBusqueda.add(listaProducto);
                }

                cargarTabla(productoBusqueda);
            }
            System.out.println("Stock " + stock);
            if (stock != 0) {
                if (stock == 1) {
                    Collections.sort(productoBusqueda, new StockComparator().reversed());
                    cargarTabla(productoBusqueda);
                }
                if (stock == 2) {
                    Collections.sort(productoBusqueda, new StockComparator());
                    cargarTabla(productoBusqueda);
                }
            }

            PlaceholderExample();
        } else {
            if (stock != 0) {
                productoBusqueda = control.traerProductos();
                if (stock == 1) {
                    Collections.sort(productoBusqueda, new StockComparator().reversed());
                    cargarTabla(productoBusqueda);
                }
                if (stock == 2) {
                    Collections.sort(productoBusqueda, new StockComparator());
                    cargarTabla(productoBusqueda);
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        PlaceholderExample();
        cmbCategorias.setSelectedIndex(0);
        cmbStock.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarStock;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCategorias;
    private javax.swing.JComboBox<String> cmbStock;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Codigo ID", "Nombre", "Stock", "Costo", "Precio", "Categoria", "Forma de Venta"};
        modeloTabla.setColumnIdentifiers(titulos);

        this.listaProductos = control.traerProductos();

        if (listaProductos != null) {
            for (Producto productos : listaProductos) {
                String precio= formatCurrency(String.valueOf(productos.getPrecio()));
                String costo= formatCurrency(String.valueOf(productos.getCosto()));
                Object[] objeto = {
                    productos.getCodigoId(),
                    productos.getNombre(),
                    productos.getStock(), 
                    costo,
                    precio, 
                    productos.getCategoria(),
                    productos.getFromVenta()};

                modeloTabla.addRow(objeto);
            }
        }
        tablaProductos.setModel(modeloTabla);
        tablaProductos.setRowHeight(30);
    }

    public void rellenarCategoria() {
        Set<String> categorias = new HashSet<>();
        for (Producto producto : listaProductos) {
            categorias.add(producto.getCategoria());
        }
        List<String> categoriasLista = new ArrayList<>(categorias);
        for (String string : categoriasLista) {
            cmbCategorias.addItem(string);
        }
    }

    public void PlaceholderExample() {
        txtCodigo.addFocusListener((FocusListener) new PlaceholderFocusListener("CODIGO # 00", txtCodigo));
        txtNombre.addFocusListener(new PlaceholderFocusListener("NOMBRE", txtNombre));

    }

    private class PlaceholderFocusListener implements FocusListener {

        private String placeholder;
        private JTextField textField;

        public PlaceholderFocusListener(String placeholder, JTextField textField) {
            this.placeholder = placeholder;
            this.textField = textField;
            mostrarPlaceholder();
        }

        private void mostrarPlaceholder() {
            textField.setForeground(Color.GRAY);
            textField.setText(placeholder);
        }

        private void ocultarPlaceholder() {
            textField.setForeground(Color.BLACK);
            textField.setText("");
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (textField.getText().equals(placeholder)) {
                ocultarPlaceholder();
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (textField.getText().isEmpty()) {
                mostrarPlaceholder();
            }
        }
    }

    private void cargarTabla(List<Producto> productos) {

        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Codigo ID", "Nombre", "Stock", "Costo", "Precio", "Categoria", "Forma de Venta"};
        modeloTabla.setColumnIdentifiers(titulos);

        //this.listaProductos = control.traerProductos();
        if (productos != null) {
            
            for (Producto producto : productos) {
                String precio= formatCurrency(String.valueOf(producto.getPrecio()));
                String costo= formatCurrency(String.valueOf(producto.getCosto()));
                Object[] objeto = {
                    producto.getCodigoId(),
                    producto.getNombre(),
                    producto.getStock(),
                    costo,
                    precio,
                    producto.getCategoria(),
                    producto.getFromVenta()};

                modeloTabla.addRow(objeto);
            }
        }
        tablaProductos.setModel(modeloTabla);
        tablaProductos.setRowHeight(30);

    }

    ////////////////////////////////////////////PARA ORDENAR EL STOCK///////////////////////////////////////////
    class StockComparator implements Comparator<Producto> {

        @Override
        public int compare(Producto producto1, Producto producto2) {
            // Comparar por stock de menor a mayor
            return Double.compare(producto1.getStock(), producto2.getStock());
        }
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

    //Para que escriba bien el monto final
    public static String formatCurrency(String input) {
        // Verificar si la cadena es nula o vacía
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Quitar cualquier caracter no numérico excepto el punto decimal
        String numericString = input.replaceAll("[^\\d.]", "");

        // Verificar si el resultado es un número válido
        try {
            double number = Double.parseDouble(numericString);

            // Formatear el número con comas y dos decimales
            DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
            return "$ " + decimalFormat.format(number);
        } catch (NumberFormatException e) {
            // Manejar la excepción si la cadena no es un número válido
            return "Formato inválido";
        }
    }
}
