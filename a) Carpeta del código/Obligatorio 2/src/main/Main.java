// Hecho por Augusto Vélez (266655) y Tadeo Goday (256686).
package main;

import dominio.Sistema;
import interfaz.MainWindow;
import interfaz.VentanaInicio;

public class Main {
    
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        VentanaInicio inicio = new VentanaInicio(sistema);
        inicio.setVisible(true);
    }
}
