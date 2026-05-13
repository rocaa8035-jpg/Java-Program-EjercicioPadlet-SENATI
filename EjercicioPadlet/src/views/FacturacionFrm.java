package views;
// Clase para representar imágenes con íconos
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Cliente;
import models.Producto;
import models.Factura;

public class FacturacionFrm extends javax.swing.JFrame {
    
    public FacturacionFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        panelPrincipal = new javax.swing.JPanel();
        etiClienteTitulo = new javax.swing.JLabel();
        etiCodCliente = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        etiProdTitulo = new javax.swing.JLabel();
        etiCodProducto = new javax.swing.JLabel();
        btnCliente = new javax.swing.JButton();
        txtCodProducto = new javax.swing.JTextField();
        btnProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        etiCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnFacturacion = new javax.swing.JButton();
        etiSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        etiDescuento = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        etiIgv = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        etiTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        etiImagen = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        etiClienteTitulo.setText("DATOS DEL CLIENTE");

        etiCodCliente.setText("Código:");

        txtCodCliente.addActionListener(this::txtCodClienteActionPerformed);

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "codigo", "nombre", "tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCliente);
        if (tablaCliente.getColumnModel().getColumnCount() > 0) {
            tablaCliente.getColumnModel().getColumn(0).setMinWidth(50);
            tablaCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaCliente.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaCliente.getColumnModel().getColumn(1).setMinWidth(50);
            tablaCliente.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaCliente.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaCliente.getColumnModel().getColumn(2).setMinWidth(50);
            tablaCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaCliente.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        etiProdTitulo.setText("DATOS DEL PRODUCTO");

        etiCodProducto.setText("Código:");

        btnCliente.setText("Buscar");
        btnCliente.addActionListener(this::btnClienteActionPerformed);

        btnProducto.setText("Buscar");
        btnProducto.addActionListener(this::btnProductoActionPerformed);

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "codigo", "descripcion", "precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaProducto);
        if (tablaProducto.getColumnModel().getColumnCount() > 0) {
            tablaProducto.getColumnModel().getColumn(0).setMinWidth(50);
            tablaProducto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(0).setMaxWidth(100);
            tablaProducto.getColumnModel().getColumn(1).setMinWidth(50);
            tablaProducto.getColumnModel().getColumn(1).setPreferredWidth(70);
            tablaProducto.getColumnModel().getColumn(1).setMaxWidth(100);
            tablaProducto.getColumnModel().getColumn(2).setMinWidth(50);
            tablaProducto.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        etiCantidad.setText("Cantidad:");

        btnFacturacion.setText("Facturar");
        btnFacturacion.addActionListener(this::btnFacturacionActionPerformed);

        etiSubtotal.setText("Subtotal:         S/.");

        txtSubtotal.addActionListener(this::txtSubtotalActionPerformed);

        etiDescuento.setText("Descuento:     S/.");

        txtDescuento.addActionListener(this::txtDescuentoActionPerformed);

        etiIgv.setText("IGV:                  S/.");

        etiTotal.setText("Total:               S/.");

        etiImagen.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                etiImagenAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiClienteTitulo)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(etiCodCliente)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(etiCodProducto)
                                .addGap(27, 27, 27)
                                .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(etiProdTitulo)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(etiCantidad)
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelPrincipalLayout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(etiSubtotal)
                                        .addComponent(etiTotal)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(etiIgv)))
                            .addComponent(etiDescuento, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiClienteTitulo)
                    .addComponent(etiProdTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiCodCliente)
                    .addComponent(etiCodProducto)
                    .addComponent(btnCliente)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducto))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacturacion))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiSubtotal)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiDescuento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiIgv)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTotal)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void btnFacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturacionActionPerformed
        // 1. Obtener y buscar el Cliente por el código ingresado en el campo de texto
        String codCliente = txtCodCliente.getText().trim();
        Cliente clienteActual = Cliente.getBuscarPorCodigo(codCliente);

        // Validación: Si el cliente no existe, avisa al usuario
        if (clienteActual == null) {
            JOptionPane.showMessageDialog(this, "Busque un cliente primero.");
            // Nota: Faltaría un 'return;' aquí para evitar que el código siga si falla
        }

        // 2. Obtener y buscar el Producto por el código ingresado
        String codProducto = txtCodProducto.getText().trim();
        Producto productoActual = Producto.getBuscarPorCodigo(codProducto);

        // Validación: Si el producto no existe, avisa al usuario
        if (productoActual == null) {
            JOptionPane.showMessageDialog(this, "Busque un producto primero.");
            // Nota: Faltaría un 'return;' aquí también
        }

        // 3. Captura y validación de la Cantidad
        int cantidad;
        try {
            // Intenta convertir el texto a número entero
            cantidad = Integer.parseInt(txtCantidad.getText().trim());

            // Si el número es 0 o negativo, lanza manualmente una excepción
            if (cantidad <= 0) throw new NumberFormatException();

        } catch (NumberFormatException ex) {
            // Se ejecuta si el usuario ingresó letras o números inválidos
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número entero mayor a 0.");
            return; // Detiene el proceso porque no hay una cantidad válida
        }
        // 1. Instancia de la clase Factura:
        // Se crea el objeto 'f' pasando el cliente, el producto y la cantidad seleccionada.
        Factura f = new Factura(clienteActual, productoActual, cantidad);

        // 2. Actualización de la Interfaz de Usuario (UI):
        // Se utiliza String.format para mostrar los valores con dos decimales.

        // Muestra el subtotal (monto antes de impuestos y descuentos)
        txtSubtotal.setText(String.format("%.2f", f.getSubtotal()));

        // Muestra el monto descontado aplicado a la factura
        txtDescuento.setText(String.format("%.2f", f.getDescuento()));

        // Muestra el cálculo del IGV (Impuesto General a las Ventas)
        txtIgv.setText(String.format("%.2f", f.getIgv()));

        // Muestra el monto final a pagar por el cliente
        txtTotal.setText(String.format("%.2f", f.getTotal()));
    }//GEN-LAST:event_btnFacturacionActionPerformed

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        //ENTRADA
        String codCliente = txtCodCliente.getText().trim();
        //PROCESO
        if (codCliente.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Ingrese un código de cliente.");
        }
        Cliente clienteActual = Cliente.getBuscarPorCodigo(codCliente);
        //SALIDA
        if (clienteActual != null) {
            DefaultTableModel modelo = (DefaultTableModel) tablaCliente.getModel();
            // Asignar el codigo del cliente
            String codigo = clienteActual.getCodigo();
            modelo.setValueAt(codigo, 0, 0);
            // Asignar el nombre del cliente actual en la fila 0, columna 1
            String nombre = clienteActual.getNombre();
            modelo.setValueAt(nombre, 0, 1);
            // Asignar el tipo del cliente
            String tipo = clienteActual.getTipo();
            modelo.setValueAt(tipo, 0, 2);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        }
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        // ENTRADA
        String codProducto = txtCodProducto.getText().trim();
        // PROCESO
        if (codProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un codigo de producto.");
        }
        Producto productoActual = Producto.getBuscarPorCodigo(codProducto);
        // SALIDA
        if (productoActual != null) {
            DefaultTableModel modelo = (DefaultTableModel) tablaProducto.getModel();
            // Asignar el codigo del producto
            String codigo = productoActual.getCodigo();
            modelo.setValueAt(codigo, 0, 0);
            // Asignar la descripcion del producto
            String descripcion = productoActual.getDescripcion();
            modelo.setValueAt(descripcion, 0, 1);
            // Asignar el precio del producto
            double precio = productoActual.getPrecio();
            modelo.setValueAt(precio, 0, 2);
        } else {
            JOptionPane.showMessageDialog(this, "Producto no encontrado.");
        }
        //MOSTRAR IMAGEN DEL PRODUCTO ---
        //Crear la Ruta de la Imagen: [formato linux]
        String rutaImg = "/img/" + productoActual.getDescripcion() + ".jpg";
        //Crear un objeto ImageIcon para cargar la Imagen
        ImageIcon img = new ImageIcon(getClass().getResource(rutaImg));
        //Colocar la imagen cargada en la etiqueta
        etiImagen.setIcon(img);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void txtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuentoActionPerformed

    private void etiImagenAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_etiImagenAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_etiImagenAncestorAdded

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFacturacion;
    private javax.swing.JButton btnProducto;
    private javax.swing.JLabel etiCantidad;
    private javax.swing.JLabel etiClienteTitulo;
    private javax.swing.JLabel etiCodCliente;
    private javax.swing.JLabel etiCodProducto;
    private javax.swing.JLabel etiDescuento;
    private javax.swing.JLabel etiIgv;
    private javax.swing.JLabel etiImagen;
    private javax.swing.JLabel etiProdTitulo;
    private javax.swing.JLabel etiSubtotal;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
