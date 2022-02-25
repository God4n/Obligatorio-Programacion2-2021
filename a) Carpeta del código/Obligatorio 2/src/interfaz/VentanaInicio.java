// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).
package interfaz;
import dominio.*;
import persistencia.ArchivoLectura;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaInicio extends javax.swing.JFrame {

    public VentanaInicio(Sistema unSistema) {
        
        initComponents();
        optDatosPrecargados.setSelected(true);
        modelo = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        optDatosDeArchivo = new javax.swing.JRadioButton();
        optDatosPrecargados = new javax.swing.JRadioButton();
        optSistemaVacio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnElegirArchivo = new javax.swing.JButton();
        btnAceptarInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(optDatosDeArchivo);
        optDatosDeArchivo.setText("Comenzar con los datos de un archivo");
        optDatosDeArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDatosDeArchivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(optDatosPrecargados);
        optDatosPrecargados.setText("Comenzar con datos de la última ejecución");

        buttonGroup1.add(optSistemaVacio);
        optSistemaVacio.setText("Comenzar con un sistema vacío");

        jLabel1.setText("Seleccione una opción para comenzar:");

        btnElegirArchivo.setText("Elegir archivo");
        btnElegirArchivo.setEnabled(false);
        btnElegirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirArchivoActionPerformed(evt);
            }
        });

        btnAceptarInicio.setText("Aceptar");
        btnAceptarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optDatosPrecargados)
                            .addComponent(optSistemaVacio)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optDatosDeArchivo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(btnAceptarInicio)))
                                .addGap(42, 42, 42)
                                .addComponent(btnElegirArchivo)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(optSistemaVacio)
                .addGap(18, 18, 18)
                .addComponent(optDatosPrecargados)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optDatosDeArchivo)
                    .addComponent(btnElegirArchivo))
                .addGap(18, 18, 18)
                .addComponent(btnAceptarInicio)
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void btnAceptarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarInicioActionPerformed
        if(optSistemaVacio.isSelected()){ // El sistema ya es vacío por defecto. 
            modelo = new Sistema();
            MainWindow ventanaPrincipal = new MainWindow(modelo);
            ventanaPrincipal.setVisible(true);
            dispose();
        }
        else if(optDatosPrecargados.isSelected()){
            try{ // Lee el archivo y lo guarda en modelo (NO ES ASÍ, HAY QUE RECORRER EL ARCHIVO DE TEXTO)
                FileInputStream archivo = new FileInputStream("DATOS");
                ObjectInputStream in = new ObjectInputStream(archivo);
                modelo = (Sistema) in.readObject();
                in.close();
                
                MainWindow ventanaPrincipal = new MainWindow(modelo);
                ventanaPrincipal.setVisible(true);
                dispose();
            } catch (ClassNotFoundException|IOException ex) {
                System.err.println("Error al leer el archivo");
                JOptionPane.showMessageDialog(this,"Error al leer el archivo","Error de archivo",JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            if(modelo.getListaCategorias().size() + modelo.getListaClientes().size() + modelo.getListaProductos().size() > 0){
                MainWindow ventanaPrincipal = new MainWindow(modelo);
                ventanaPrincipal.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"El archivo seleccionado no tiene datos o no ha seleccionado ningún archivo","Error",JOptionPane.ERROR_MESSAGE);
            }    
        }
    }//GEN-LAST:event_btnAceptarInicioActionPerformed
    private void optDatosDeArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDatosDeArchivoActionPerformed
        btnElegirArchivo.setEnabled(true);
    }//GEN-LAST:event_optDatosDeArchivoActionPerformed

    private void btnElegirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirArchivoActionPerformed
        JFileChooser jFileChooser1 = new JFileChooser();
        try{
            int returnVal = jFileChooser1.showOpenDialog(this);

            if(returnVal == JFileChooser.APPROVE_OPTION) {
                ArchivoLectura archivo = new ArchivoLectura(jFileChooser1.getSelectedFile().getPath());
                
                try{
                    // Agrego clientes:
                    archivo.hayMasLineas();
                    int cantClientes = Integer.parseInt(archivo.linea().split(";")[0]);

                    for(int i = 0; i < cantClientes; i++){
                        archivo.hayMasLineas(); // Lee la siguiente línea.
                        String[] datos = archivo.linea().split(";");
                        String nombre = datos[0];
                        String direccion = datos[1];
                        int telefono = Integer.parseInt(datos[2]);

                        Cliente cliente = new Cliente(nombre,direccion,telefono);
                        modelo.addCliente(cliente);
                    }
                }catch(NullPointerException|IndexOutOfBoundsException e){
                    System.out.println(e);
                }
                
                try{
                    // Agrego categorias:
                    archivo.hayMasLineas();
                    int cantCategorias = Integer.parseInt(archivo.linea().split(";")[0]);
                    for(int i = 0; i < cantCategorias; i++){
                        archivo.hayMasLineas(); // Lee la siguiente línea.
                        String[] datos = archivo.linea().split(";");
                        String descripcion = datos[0];
                        String detalle = datos[1];
                        int prioridad = Integer.parseInt(datos[2]);

                        Categoria categoria = new Categoria(descripcion,detalle,prioridad);
                        modelo.addCategoria(categoria);
                    }
                }catch(NullPointerException|IndexOutOfBoundsException e){
                    System.out.println(e);
                }
                
                try{
                    // Agrego productos:
                    archivo.hayMasLineas();
                    int cantProductos = Integer.parseInt(archivo.linea().split(";")[0]);
                    for(int i = 0; i < cantProductos; i++){
                        archivo.hayMasLineas(); // Lee la siguiente línea.
                        String[] datos = archivo.linea().split(";");
                        String nombre = datos[0];
                        int precio = Integer.parseInt(datos[1]);
                        ArrayList<Categoria> categorias = new ArrayList<>();

                        for(int j = 2; j < datos.length; j++){
                            categorias.add(modelo.buscarCategoriaPorNombre(datos[j]));
                        }

                        Producto producto = new Producto(categorias,nombre,precio);
                        modelo.addProducto(producto);
                    }
                }catch(NullPointerException|IndexOutOfBoundsException e){
                    System.out.println(e);
                }
                
                archivo.cerrar();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"El archivo seleccionado no es del formato correcto","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnElegirArchivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarInicio;
    private javax.swing.JButton btnElegirArchivo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton optDatosDeArchivo;
    private javax.swing.JRadioButton optDatosPrecargados;
    private javax.swing.JRadioButton optSistemaVacio;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
    private ArchivoLectura archivo;
}
