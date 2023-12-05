package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Producto;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerProductos extends javax.swing.JFrame {

    Controladora control = null;

    public VerProductos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Lista de Productos");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(eliminar)
                .addGap(50, 50, 50)
                .addComponent(editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(editar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(257, 257, 257))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
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
                System.out.println(codigoId);
                
                ModificarProducto pantallModf= new ModificarProducto(codigoId);
                pantallModf.setVisible(true);
                pantallModf.setLocationRelativeTo(null);
                
                
                
//                control.borrarProducto(codigoId);
//                mensaje("Producto eliminado correctamente", "Info", "Borrado de Produtos");
                cargarTabla();
            } else {
                mensaje("No se selecciono ningun producto", "Error", "Borrado de Productos");
            }
        } else {
            mensaje("No hay elementos cargados", "Error", "Error de Tabla");
        }
        
    }//GEN-LAST:event_editarActionPerformed

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
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
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

        List<Producto> listaProductos = control.traerProductos();

        if (listaProductos != null) {
            for (Producto productos : listaProductos) {
                Object[] objeto = {productos.getCodigoId(), productos.getNombre(),
                    productos.getStock(), productos.getCosto(),
                    productos.getPrecio(), productos.getCategoria(),
                    productos.getFromVenta()};

                modeloTabla.addRow(objeto);
            }
        }
        tablaProductos.setModel(modeloTabla);
    }
}
