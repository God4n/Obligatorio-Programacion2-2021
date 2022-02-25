package persistencia;

import java.util.*;
import java.io.*;

public class ArchivoGrabacion {

    private Formatter out;
    
    public ArchivoGrabacion(String nombreArchivo){
        try{
            out = new Formatter(nombreArchivo);
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear el archivo");
            System.exit(1);
        }
    }
    
    public ArchivoGrabacion(String nombreArchivo, boolean extender){
        try{
            FileWriter arch = new FileWriter(nombreArchivo, extender);
            out = new Formatter(arch);
        }
        catch(IOException e){
            System.out.println("Error al crear el archivo");
            System.exit(1);
        }
    }
    
    public void grabarLinea(String text){
        out.format("%s%n", text);
    }
    
    public void cerrar(){
        out.close();
    }
}
