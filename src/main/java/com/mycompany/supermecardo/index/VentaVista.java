package com.mycompany.supermecardo.index;

import com.mycompany.supermecardo.entidades.Controladora;
import com.mycompany.supermecardo.entidades.Producto;
import com.mycompany.supermecardo.entidades.Ticket;
import com.mycompany.supermecardo.entidades.Usuario;
import com.mycompany.supermecardo.entidades.Venta;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentaVista extends javax.swing.JFrame {

    private Controladora control;
    private Usuario user;
    private DefaultTableModel modeloTabla;
    private Double totalVentas = 0.0;
    private List<Producto> listProducto;
    private List<Object> listaDeInfo;

    private Map<Producto, Double> unidadesVendidasPorProducto = new HashMap<>();

    public VentaVista(Usuario user) {
        initComponents();
        control = new Controladora();
        listProducto = new ArrayList();
        this.user = user;
        this.listaDeInfo = new ArrayList();
        lblUsuario.setText(user.getNombreUsuario());

        String titulos[] = {"Nombre", "Unidades", "Precio Unitario", "Total"};
        modeloTabla = new DefaultTableModel(titulos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
//                return column == 1;      CON ESTO PERMITE EDITAR LA COLUMNA QUE SE DESEE
                return false;
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codigoProducto = new javax.swing.JTextField();
        unidadesVendidas = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtCantidadXNombre = new javax.swing.JTextField();
        btnBuscarXNombre = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        precioMostrar = new javax.swing.JLabel();
        formVenta = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        terminarVenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        descPorcentaje = new javax.swing.JTextField();
        descPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDescuento = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Realiza tu venta");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaProducto);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-volver-48.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eliminar-64.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Por Codigo"));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Producto:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad:");

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lupa-64.png"))); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidadesVendidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(Buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(codigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(unidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Por Nombre"));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Producto:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Cantidad:");

        btnBuscarXNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lupa-64.png"))); // NOI18N
        btnBuscarXNombre.setText("Buscar");
        btnBuscarXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarXNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadXNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarXNombre)
                .addGap(109, 109, 109))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(btnBuscarXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("TOTAL");

        precioMostrar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        precioMostrar.setText("$");

        formVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Débito", "Transferencia", "Crédito" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Forma de Pago");

        terminarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-de-acuerdo-48.png"))); // NOI18N
        terminarVenta.setText("Listo!");
        terminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarVentaActionPerformed(evt);
            }
        });

        jLabel7.setText("Descuento %");

        jLabel8.setText("Descuento $");

        descPorcentaje.setText("0");

        descPrecio.setText("0");

        jLabel9.setText("%");

        jLabel10.setText("$");

        btnDescuento.setText("Aplicar");
        btnDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescuentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(precioMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(descPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(formVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnDescuento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(terminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(precioMostrar)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnDescuento)
                .addGap(102, 102, 102)
                .addComponent(terminarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        lblUsuario.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarVentaActionPerformed
        Date dia = new Date();
        SimpleDateFormat horaSdf = new SimpleDateFormat("HH:mm");
        String horario = horaSdf.format(dia);
        String formaDeVenta = (String) formVenta.getSelectedItem();

        try {

            control.actualizarStock(unidadesVendidasPorProducto);
            Ticket tic = cargarTicket();
            control.crearTicket(tic);

            control.crearVenta(listProducto, totalVentas, descPorcentaje, descPrecio, user, formaDeVenta, dia, horario, tic);
        } catch (ParseException ex) {
            Logger.getLogger(VentaVista.class.getName()).log(Level.SEVERE, null, ex);
        }

        String titulos[] = {"Nombre", "Unidades", "Precio Unitario", "Total"};
        modeloTabla = new DefaultTableModel(titulos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaProducto.setModel(modeloTabla);

        precioMostrar.setText("$ ");
        listProducto.clear();
        totalVentas = 0.0;

        descPorcentaje.setText("0");
        descPrecio.setText("0");
        VentaVista ventaNueva=new VentaVista(user);
        ventaNueva.setVisible(true);
        ventaNueva.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_terminarVentaActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        String codigoId = codigoProducto.getText();
        Double unidades = Double.valueOf(unidadesVendidas.getText());
        cargarTablaPorProducto(codigoId, unidades);
        limpiarImput();
        precioMostrar.setText("$ " + totalVentas);

    }//GEN-LAST:event_BuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        String rol = user.getRol();
        if (user != null) {
            if (rol.equals("admin")) {
                Principal principal = new Principal(control, user);
                principal.setVisible(true);
                principal.setLocationRelativeTo(null);
                this.dispose();
            } else if (rol.equals("user")) {
//                System.out.println("entra a vendedor");
                PanelVendedor panelVendedor = new PanelVendedor(control, user);
                panelVendedor.setVisible(true);
                panelVendedor.setLocationRelativeTo(null);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // conotrolo que la tabla tenga porlomenos un registro
        if (tablaProducto.getRowCount() > 0) {
            //controlo que haya algo seleccionado
            if (tablaProducto.getSelectedRow() != -1) {
                String nombre = (String) tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 0);
                Double precioProd = (Double) (tablaProducto.getValueAt(tablaProducto.getSelectedRow(), 3));
                if (nombre.contains("Descuento")) {

                    modeloTabla.removeRow(tablaProducto.getSelectedRow());
                    totalVentas -= precioProd;
                    precioMostrar.setText("$ " + totalVentas);
                } else {
                    unidadesVendidasPorProducto.remove(listProducto.get(tablaProducto.getSelectedRow()));
                    listProducto.remove(tablaProducto.getSelectedRow());
                    modeloTabla.removeRow(tablaProducto.getSelectedRow());
                    totalVentas -= precioProd;
                    precioMostrar.setText("$ " + totalVentas);
                }
            } else {
                mensaje("No se selecciono ningun producto", "Error", "Borrado de Productos");
            }
        } else {
            mensaje("No hay elementos cargados", "Error", "Error de Tabla");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarXNombreActionPerformed
        String nombreP = txtNombreProducto.getText();
        Double unidades = Double.valueOf(txtCantidadXNombre.getText());
        cargarTablaPorProductoXNombre(nombreP, unidades);
        limpiarImput();
        precioMostrar.setText("$ " + totalVentas);

    }//GEN-LAST:event_btnBuscarXNombreActionPerformed

    private void btnDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescuentoActionPerformed
        String nombre = null;
        Double descuento = null;
        if (Integer.parseInt(descPorcentaje.getText()) > 0) {
            descuento = (Double.valueOf(descPorcentaje.getText()) * totalVentas) / 100;
            nombre = "%" + descPorcentaje.getText();
        } else if (Integer.parseInt(descPrecio.getText()) > 0) {
            descuento = (Double.valueOf(descPrecio.getText()));
            nombre = "$" + descPrecio.getText();
        }

        precioMostrar.setText("$ " + String.valueOf(formatearDoubleConDosDecimales(totalVentas)));
        Object[] desct = {"Descuento " + nombre, "1", "1", (-descuento)};
        cargarDescuento(desct);
    }//GEN-LAST:event_btnDescuentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton btnBuscarXNombre;
    private javax.swing.JButton btnDescuento;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField codigoProducto;
    private javax.swing.JTextField descPorcentaje;
    private javax.swing.JTextField descPrecio;
    private javax.swing.JComboBox<String> formVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel precioMostrar;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JButton terminarVenta;
    private javax.swing.JTextField txtCantidadXNombre;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField unidadesVendidas;
    // End of variables declaration//GEN-END:variables

    //Para llenar la tabla
    private void cargarTablaPorProducto(String codigoId, Double unidades) {
        Producto producto = control.traerProducto(codigoId);

        if (producto != null) {
            if (producto.getFromVenta().equalsIgnoreCase("unidad")) {
            }
            Object[] objeto = {producto.getNombre(),
                unidades,
                producto.getPrecio(),
                producto.getPrecio() * unidades};

            modeloTabla.addRow(objeto);
            formatearDoubleConDosDecimales(totalVentas += (Double) objeto[3]);
            producto.setUnidadesVendidas(unidades);
            listProducto.add(producto);
            unidadesVendidasPorProducto.put(producto, unidades);
        }
        tablaProducto.setModel(modeloTabla);

    }

    private void limpiarImput() {
        codigoProducto.setText("");
        unidadesVendidas.setText("");
        txtCantidadXNombre.setText("");
        txtNombreProducto.setText("");
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

    private void cargarTablaPorProductoXNombre(String nombre, Double unidades) {
        Producto producto = control.traerProductoXNombre(nombre);
        if (producto != null) {

            Object[] objeto = {producto.getNombre(),
                unidades,
                producto.getPrecio(),
                formatearDoubleConDosDecimales(producto.getPrecio() * unidades)};

            modeloTabla.addRow(objeto);
            formatearDoubleConDosDecimales(totalVentas += (Double) objeto[3]);
            producto.setUnidadesVendidas(unidades);
            listProducto.add(producto);
            unidadesVendidasPorProducto.put(producto, unidades);
        }
        tablaProducto.setModel(modeloTabla);
    }

    private void cargarDescuento(Object[] descuento) {

        if (descuento != null) {
            modeloTabla.addRow(descuento);
            totalVentas += (Double) descuento[3];
            precioMostrar.setText("$ " + (totalVentas));

        }
        tablaProducto.setModel(modeloTabla);

    }

    private Ticket cargarTicket() {
        Ticket ticket = new Ticket();
        for (Map.Entry<Producto, Double> entry : unidadesVendidasPorProducto.entrySet()) {
            Producto key = entry.getKey();
            Double value = entry.getValue();
            Object[] objeto = {key.getNombre(), value.toString(), key.getPrecio(), formatearDoubleConDosDecimales(value * key.getPrecio())};
            System.out.println("Nombre =" + objeto[0].toString() + " Unidades " + objeto[1].toString() + " Precio: " + objeto[2].toString());
            this.listaDeInfo.add(objeto);
        }

        ticket.setListaDeInfo(listaDeInfo);
        return ticket;
    }

    public static Double formatearDoubleConDosDecimales(double numero) {
        DecimalFormat formato = new DecimalFormat("#.##");
        String numeroFormateadoStr = formato.format(numero);
        return Double.valueOf(numeroFormateadoStr);
    }
}
