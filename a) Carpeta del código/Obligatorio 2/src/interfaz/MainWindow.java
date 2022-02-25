package interfaz;

import dominio.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

public class MainWindow extends javax.swing.JFrame implements Observer{

    private Sistema modelo;
    private Pedido pedido;
    
    public MainWindow(Sistema modelo) {
        initComponents();
        this.setTitle("Sistema");
        this.setSize(850,450);
        
        pedido = new Pedido();
        this.modelo = modelo;
        
        modelo.addObserver(this);
        pedido.addObserver(this);
        
        optCategoriasPorOrdenAlfabetico.setSelected(true);
        cBCategoriasMain.setModel(new DefaultComboBoxModel<>(modelo.ordenarCategoriaPorOrdenAlfabetico().toArray()));
        
        ponerBotones();
        
        pedido.setNumero(modelo.getListaPedidos().size());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnElegirCliente = new javax.swing.JButton();
        lblClienteElegido = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextPane();
        optCategoriasPorOrdenAlfabetico = new javax.swing.JRadioButton();
        optCategoriasPorOrdenPrioridad = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnVerPedidos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cBCategoriasMain = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        btnReiniciarPedido = new javax.swing.JButton();
        txtNumTotalDelPedido = new javax.swing.JTextField();
        jPanelProductos = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductosDelPedido = new javax.swing.JList();
        btnEliminarItem = new javax.swing.JButton();
        btnGrabarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(3, 2));

        jPanel1.setLayout(new java.awt.GridLayout(3, 2));

        btnElegirCliente.setText("Elegir Cliente");
        btnElegirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnElegirCliente);

        lblClienteElegido.setBackground(new java.awt.Color(204, 255, 204));
        lblClienteElegido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblClienteElegido.setFocusable(false);
        jPanel1.add(lblClienteElegido);

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Observaciones:");
        jTextField1.setFocusable(false);
        jPanel1.add(jTextField1);

        jScrollPane2.setViewportView(txtObservaciones);

        jPanel1.add(jScrollPane2);

        buttonGroup1.add(optCategoriasPorOrdenAlfabetico);
        optCategoriasPorOrdenAlfabetico.setText("Categorías por orden Alfabético");
        optCategoriasPorOrdenAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCategoriasPorOrdenAlfabeticoActionPerformed(evt);
            }
        });
        jPanel1.add(optCategoriasPorOrdenAlfabetico);

        buttonGroup1.add(optCategoriasPorOrdenPrioridad);
        optCategoriasPorOrdenPrioridad.setText("Categorías por orden Prioridad");
        optCategoriasPorOrdenPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCategoriasPorOrdenPrioridadActionPerformed(evt);
            }
        });
        jPanel1.add(optCategoriasPorOrdenPrioridad);

        getContentPane().add(jPanel1);

        jPanel4.setLayout(new java.awt.GridLayout(1, 4));

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel4.add(btnClientes);

        btnCategorias.setText("Categorías");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        jPanel4.add(btnCategorias);

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel4.add(btnProductos);

        btnVerPedidos.setText("Ver Pedidos");
        btnVerPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPedidosActionPerformed(evt);
            }
        });
        jPanel4.add(btnVerPedidos);

        getContentPane().add(jPanel4);

        cBCategoriasMain.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cBCategoriasMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBCategoriasMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cBCategoriasMain, 0, 465, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cBCategoriasMain, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);

        jPanel6.setLayout(new java.awt.GridLayout(2, 1));

        btnReiniciarPedido.setText("Reiniciar Pedido");
        btnReiniciarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarPedidoActionPerformed(evt);
            }
        });
        jPanel6.add(btnReiniciarPedido);

        txtNumTotalDelPedido.setBackground(new java.awt.Color(204, 255, 204));
        txtNumTotalDelPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumTotalDelPedido.setFocusable(false);
        jPanel6.add(txtNumTotalDelPedido);

        getContentPane().add(jPanel6);

        jPanelProductos.setLayout(new java.awt.GridLayout(3, 0));
        getContentPane().add(jPanelProductos);

        jPanel5.setLayout(new java.awt.GridLayout(1, 3));

        jScrollPane1.setViewportView(lstProductosDelPedido);

        jPanel5.add(jScrollPane1);

        btnEliminarItem.setText("Eliminar Item");
        btnEliminarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarItemActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminarItem);

        btnGrabarPedido.setText("Grabar Pedido");
        btnGrabarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarPedidoActionPerformed(evt);
            }
        });
        jPanel5.add(btnGrabarPedido);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        VentanaCategorias vent = new VentanaCategorias(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        VentanaProductos vent = new VentanaProductos(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VentanaClientes vent = new VentanaClientes(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVerPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPedidosActionPerformed
        VentanaPedidos vent = new VentanaPedidos(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnVerPedidosActionPerformed

    private void btnElegirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirClienteActionPerformed
        VentanaElegirCliente vent = new VentanaElegirCliente(modelo, pedido);
        vent.setVisible(true);
    }//GEN-LAST:event_btnElegirClienteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try{
            FileOutputStream archivo = new FileOutputStream("DATOS");
            ObjectOutputStream out = new ObjectOutputStream(archivo);
            out.writeObject(modelo);
            out.close();
        }
        catch(IOException e){System.err.println("Error al crear el archivo");}
    }//GEN-LAST:event_formWindowClosing

    private void cBCategoriasMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBCategoriasMainActionPerformed
        ponerBotones();
    }//GEN-LAST:event_cBCategoriasMainActionPerformed

    private void btnEliminarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarItemActionPerformed
        Object[] prodsPorEliminar = lstProductosDelPedido.getSelectedValues(); 
        for (int i = 0; i < prodsPorEliminar.length; i++) {
            pedido.deleteProductoAlPedido((Producto)prodsPorEliminar[i]);
        }
        pedido.setTotal(pedido.calcularTotal(pedido.getProductosPedidos()));
    }//GEN-LAST:event_btnEliminarItemActionPerformed

    private void btnGrabarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarPedidoActionPerformed
        if(pedido.getCliente() != null){
            if(!pedido.getProductosPedidos().isEmpty()){
                String observaciones = txtObservaciones.getText();
                pedido.setObservaciones(observaciones);
                
                modelo.addPedido(pedido);
                modelo.imprimirPedido();
                nuevoPedido();
            }
            else{
                JOptionPane.showMessageDialog(this, "El pedido NO se ha podido ingresar (Debe haber al menos un producto)", "Error", JOptionPane.ERROR_MESSAGE);    
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "El pedido NO se ha podido ingresar (Falta elegir un cliente)", "Error", JOptionPane.ERROR_MESSAGE);    
        }
    }//GEN-LAST:event_btnGrabarPedidoActionPerformed

    private void btnReiniciarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarPedidoActionPerformed
        nuevoPedido();
    }//GEN-LAST:event_btnReiniciarPedidoActionPerformed

    private void optCategoriasPorOrdenAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCategoriasPorOrdenAlfabeticoActionPerformed
        cBCategoriasMain.setModel(new DefaultComboBoxModel<>(modelo.ordenarCategoriaPorOrdenAlfabetico().toArray()));
    }//GEN-LAST:event_optCategoriasPorOrdenAlfabeticoActionPerformed

    private void optCategoriasPorOrdenPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCategoriasPorOrdenPrioridadActionPerformed
        cBCategoriasMain.setModel(new DefaultComboBoxModel<>(modelo.ordenarCategoriaPorPrioridad().toArray()));
    }//GEN-LAST:event_optCategoriasPorOrdenPrioridadActionPerformed
    
    private void ponerBotones(){
        jPanelProductos.removeAll();
        
        Categoria cat = (Categoria)cBCategoriasMain.getSelectedItem();
        ArrayList<Producto> lstProductos = modelo.buscarProductosPorCategoria(cat);
        
        for (int i = 0; i < lstProductos.size(); i++) {
            JButton nuevo = new JButton(" ");   
            nuevo.setMargin(new Insets(-5, -5, -5, -5));
            nuevo.setBackground(Color.BLACK);
            nuevo.setForeground(Color.WHITE);
            nuevo.setText(lstProductos.get(i).getNombre() + "\u2000($" + lstProductos.get(i).getPrecio() + ")"); 
            nuevo.addActionListener(new ProductoListener());
            jPanelProductos.add(nuevo);
        }
        
        jPanelProductos.revalidate();
        jPanelProductos.repaint();
    }
    
    private class ProductoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
       // este código se ejecutará al presionar el botón, obtengo cuál botón
            JButton cual = ((JButton) e.getSource());
            // código a completar según el botón presionado
            String[] prod = cual.getText().split("\u2000");
            Producto producto = modelo.buscarProductoPorNombre(prod[0]);
            pedido.addProductoAlPedido(producto);
            pedido.setTotal(pedido.calcularTotal(pedido.getProductosPedidos()));
        }
    }
    
    private void nuevoPedido(){
        pedido = new Pedido();
        pedido.addObserver(this);
        lblClienteElegido.setText("");
        lstProductosDelPedido.setListData(new String[0]);
        txtObservaciones.setText("");
        pedido.setNumero(modelo.getListaPedidos().size());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnElegirCliente;
    private javax.swing.JButton btnEliminarItem;
    private javax.swing.JButton btnGrabarPedido;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReiniciarPedido;
    private javax.swing.JButton btnVerPedidos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cBCategoriasMain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lblClienteElegido;
    private javax.swing.JList lstProductosDelPedido;
    private javax.swing.JRadioButton optCategoriasPorOrdenAlfabetico;
    private javax.swing.JRadioButton optCategoriasPorOrdenPrioridad;
    private javax.swing.JTextField txtNumTotalDelPedido;
    private javax.swing.JTextPane txtObservaciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        try{
            lblClienteElegido.setText(pedido.getCliente().toString());
        }catch(NullPointerException e){}
        
        try{
            lstProductosDelPedido.setListData(pedido.getProductosPedidos().toArray());
        }catch(NullPointerException e){}
        
        if(optCategoriasPorOrdenAlfabetico.isSelected()){
            cBCategoriasMain.setModel(new DefaultComboBoxModel<>(modelo.ordenarCategoriaPorOrdenAlfabetico().toArray()));
        }
        else{
            cBCategoriasMain.setModel(new DefaultComboBoxModel<>(modelo.ordenarCategoriaPorPrioridad().toArray()));
        }
        
        
        ponerBotones();
        
        txtNumTotalDelPedido.setText("Pedido " + pedido.getNumero() + ": $" + pedido.getTotal());
    }
}
