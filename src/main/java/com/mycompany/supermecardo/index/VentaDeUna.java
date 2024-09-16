package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Ticket;
import com.mycompany.supermecardo.entidades.Usuario;
import com.mycompany.supermecardo.entidades.Venta;
import com.mycompany.supermecardo.persistencia.exceptions.NonexistentEntityException;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class VentaDeUna extends javax.swing.JFrame {

    private VentasTotales ventasTotales;
    private Venta venta;
    private DefaultTableModel modeloTabla;
    private Controladora control;
    private Producto producto;
    private Usuario user;

    public VentaDeUna(Venta venta, VentasTotales ventasTotales) {
        initComponents();
        this.venta = venta;
        this.ventasTotales = ventasTotales;
        ajustarAlTamañoDeLaPantalla();
        setLocationRelativeTo(null);
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

    VentaDeUna(Venta venta) {
        initComponents();
        this.venta = venta;
        ajustarAlTamañoDeLaPantalla();
        setLocationRelativeTo(null);
        control = new Controladora();
        String titulos[] = {"Producto", "Unidades", "Precio por Unidad", "Total"};
        modeloTabla = new DefaultTableModel(titulos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
//                return column == 1;      CON ESTO PERMITE EDITAR LA COLUMNA QUE SE DESEE
                return false;
            }
        };
        btnEliminar.setEnabled(false);
        cargarVenta(venta);
        cargarLbl(venta);
     }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
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
        btnCambiarForma = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Venta + Id ");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("Vendedor :");

        lblNombreVendedor.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblNombreVendedor.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Año : ");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setText("Mes : ");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Dia : ");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setText("Total: ");

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setText("Forma de Pago :");

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-volver-48.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lblAnio.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblAnio.setText("jLabel8");

        lblMes.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblMes.setText("jLabel8");

        lblDia.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblDia.setText("jLabel8");

        lblHora.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblHora.setText("jLabel8");

        lblTotal.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblTotal.setText("jLabel8");

        lblFormaDePago.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblFormaDePago.setText("jLabel8");

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eliminar-64.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblDescuento.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblDescuento.setText("jLabel8");

        btnCambiarForma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCambiarForma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-editar-64.png"))); // NOI18N
        btnCambiarForma.setText("Cambiar Forma de Pago");
        btnCambiarForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFormaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAnio)
                                .addGap(31, 31, 31))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(lblTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMes)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDia)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHora)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreVendedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFormaDePago)
                                .addGap(111, 111, 111)
                                .addComponent(lblDescuento)
                                .addGap(97, 97, 97))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(44, 44, 44)
                        .addComponent(btnCambiarForma, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblNombre)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAnio)
                    .addComponent(jLabel3)
                    .addComponent(lblMes)
                    .addComponent(jLabel4)
                    .addComponent(lblDia)
                    .addComponent(jLabel5)
                    .addComponent(lblHora)
                    .addComponent(jLabel1)
                    .addComponent(lblNombreVendedor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTotal)
                    .addComponent(jLabel7)
                    .addComponent(lblFormaDePago)
                    .addComponent(lblDescuento))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarForma)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String idTicket = venta.getTicket().getId();
            control.borrarVenta(venta.getId());
            control.borrarTicket(idTicket);
            ventasTotales.limpiarTabla();
            ventasTotales.cargarTabla();
            devolverStockDeVentaEliminada(venta);
            this.dispose();
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(VentaDeUna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCambiarFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFormaActionPerformed
        EditarFormaDePago editarFormaDePago = new EditarFormaDePago(control, user, venta);
        editarFormaDePago.setVisible(true);
        editarFormaDePago.setLocationRelativeTo(null);


    }//GEN-LAST:event_btnCambiarFormaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarForma;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JToggleButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
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
            Ticket ticket = control.buscarTicket(venta.getTicket().getId());
            List<Object> info = ticket.getListaDeInfo();
            for (Object objetos : info) {
                modeloTabla.addRow((Object[]) objetos);
            }
            tblProducto.setModel(modeloTabla);
        }
    }

    private void cargarLbl(Venta venta) {
        lblNombre.setText("Numero de venta #" + venta.getId());
        lblNombreVendedor.setText(venta.getVendedor().getNombreUsuario());
        lblAnio.setText(String.valueOf(venta.getFecha().getYear() + 1900));
        lblMes.setText(String.valueOf(venta.getFecha().getMonth() + 1));
        lblDia.setText(String.valueOf(venta.getFecha().getDate()));
        lblHora.setText(String.valueOf(venta.getHorario()));
        //lblTotal.setText(String.valueOf(venta.getPrecio()));
        String formattedOutput = formatCurrency(String.valueOf(venta.getPrecio()));
        lblTotal.setText(formattedOutput);
        lblDescuento.setText("Descuento % " + venta.getDescuentoPorPorcentaje() + " $ " + venta.getDescuentoPorPrecio());
        lblFormaDePago.setText(String.valueOf(venta.getFormpago()));
    }

    private void devolverStockDeVentaEliminada(Venta venta) {
        // Obtén la información de la venta antes de eliminarla
        //String idTicket = venta.getTicket().getId();
        List<Producto> productosVendidos = venta.getListaProductos();

        if (productosVendidos != null) {
            // Itera sobre la lista de productos vendidos
            int contador = 0;
            for (Producto productoVendido : productosVendidos) {
                // Verifica si el producto no es nulo
                if (productoVendido != null) {
                    // Incrementa el stock del producto en base a las unidades vendidas de la venta eliminada
                    String codigoProducto = productoVendido.getCodigoId();
                    producto = control.traerProducto(codigoProducto);

                    if (producto != null) {
                        String unidadesVendidasStr = tblProducto.getValueAt(contador, 1).toString();
                        Double unidadesVendidas = Double.parseDouble(unidadesVendidasStr);
                        Double nuevoStock = producto.getStock() + unidadesVendidas;
                        control.agregarStock(producto, nuevoStock);
                        contador++;
                    }
                }
            }
        }
        // Actualiza la tabla de ventas totales
        ventasTotales.limpiarTabla();
        ventasTotales.cargarTabla();
        this.dispose();
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
