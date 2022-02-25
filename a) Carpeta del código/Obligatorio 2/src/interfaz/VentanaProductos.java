package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaProductos extends javax.swing.JFrame implements Observer{

    private Sistema modelo;
    private ArrayList<Categoria> catNoEleAL;
    private ArrayList<Categoria> catAsocAL;
    
    public VentanaProductos(Sistema modelo) {
        initComponents();
        this.setTitle("Agregar Producto");
        this.modelo = modelo;
        
        modelo.addObserver(this);
        
        catNoEleAL = new ArrayList<>();
        catNoEleAL = modelo.getListaCategoriasCopias();
        lstTodasCategorias.setListData(catNoEleAL.toArray());
        
        catAsocAL = new ArrayList<>();
        lstCategoriasAsociadas.setListData(catAsocAL.toArray());
        
        lstProdAgregados.setListData(modelo.getListaProductos().toArray());
        cbBuscarPorCateg.setModel(new DefaultComboBoxModel<>(modelo.getListaCategorias().toArray()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreProd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCategoriasAsociadas = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTodasCategorias = new javax.swing.JList();
        btnAddCategoria = new javax.swing.JButton();
        btnDelCategoria = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProdAgregados = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        cbBuscarPorCateg = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton2.setText("\\u27A4");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Precio           $");

        txtPrecioProd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecioProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Categorias");

        lstCategoriasAsociadas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstCategoriasAsociadas);

        lstTodasCategorias.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstTodasCategorias);

        btnAddCategoria.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnAddCategoria.setText("->");
        btnAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoriaActionPerformed(evt);
            }
        });

        btnDelCategoria.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        btnDelCategoria.setText("<-");
        btnDelCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCategoriaActionPerformed(evt);
            }
        });

        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        lstProdAgregados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstProdAgregados);

        jLabel4.setText("Ordenar por categoria");

        cbBuscarPorCateg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBuscarPorCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarPorCategActionPerformed(evt);
            }
        });

        jLabel5.setText("Productos Creados");

        jButton1.setText("Mostrar todos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreProd)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar1)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbBuscarPorCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddCategoria)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelCategoria)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar1)
                        .addComponent(btnCancelar1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbBuscarPorCateg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoriaActionPerformed
        try{
            Object[] cats = lstTodasCategorias.getSelectedValues();
            if(cats.length > 0){
                for (int i = 0; i < cats.length; i++) {
                    catAsocAL.add((Categoria) cats[i]);
                    catNoEleAL.remove((Categoria) cats[i]);
                    lstCategoriasAsociadas.setListData(catAsocAL.toArray());
                    lstTodasCategorias.setListData(catNoEleAL.toArray());
                }
            }
        }
        catch(IndexOutOfBoundsException e){}
    }//GEN-LAST:event_btnAddCategoriaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDelCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCategoriaActionPerformed
        try{
            Object[] cats = lstCategoriasAsociadas.getSelectedValues();
            if(cats != null){
                for (int i = 0; i < cats.length; i++) {
                    catNoEleAL.add((Categoria) cats[i]);
                    catAsocAL.remove((Categoria) cats[i]);
                    lstCategoriasAsociadas.setListData(catAsocAL.toArray());
                    lstTodasCategorias.setListData(catNoEleAL.toArray());
                }
            }
        }
        catch(IndexOutOfBoundsException e){}
    }//GEN-LAST:event_btnDelCategoriaActionPerformed

    private void txtPrecioProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProdActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        try{
            String nom = txtNombreProd.getText();
            int pre = Integer.parseInt(txtPrecioProd.getText().replaceAll(" ", ""));

            if(!nom.replaceAll(" ", "").equals("") && !catAsocAL.isEmpty()){
                Producto producto = new Producto (catAsocAL, nom, pre);

                if(modelo.comprobarExisteProducto(producto)){
                    modelo.addProducto(producto);

                    txtNombreProd.setText("");
                    txtPrecioProd.setText("");

                    catNoEleAL = modelo.getListaCategoriasCopias();
                    lstTodasCategorias.setListData(catNoEleAL.toArray());

                    catAsocAL = new ArrayList<>();
                    lstCategoriasAsociadas.setListData(catAsocAL.toArray());

                    JOptionPane.showMessageDialog(this, "El producto se ha ingresado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    modelo.imprimirProductos();
                    lstProdAgregados.setListData(modelo.getListaProductos().toArray());
                }
                else{
                    JOptionPane.showMessageDialog(this, "El producto YA EXISTE,\nNO se ha podido ingresar", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "El producto NO se ha podido ingresar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El producto NO se ha podido ingresar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void cbBuscarPorCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarPorCategActionPerformed
        lstProdAgregados.setListData(modelo.buscarProductosPorCategoria((Categoria)cbBuscarPorCateg.getSelectedItem()).toArray());
    }//GEN-LAST:event_cbBuscarPorCategActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lstProdAgregados.setListData(modelo.getListaProductos().toArray());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategoria;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnDelCategoria;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JComboBox cbBuscarPorCateg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lstCategoriasAsociadas;
    private javax.swing.JList lstProdAgregados;
    private javax.swing.JList lstTodasCategorias;
    private javax.swing.JTextField txtNombreProd;
    private javax.swing.JTextField txtPrecioProd;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        catNoEleAL = modelo.getListaCategoriasCopias();
        lstTodasCategorias.setListData(catNoEleAL.toArray());
        
        catAsocAL = new ArrayList<>();
        lstCategoriasAsociadas.setListData(catAsocAL.toArray());
        
        cbBuscarPorCateg.setModel(new DefaultComboBoxModel<>(modelo.getListaCategorias().toArray()));
    }
}
