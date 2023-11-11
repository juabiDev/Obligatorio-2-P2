/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class ArchivoGrabacion {
    private Formatter out;
    
    public ArchivoGrabacion(String unNombre) {
        try {
            out = new Formatter(unNombre);
        } catch(FileNotFoundException e) {
            System.out.println("No se puede crear archivo");
            System.exit(1);
        } catch(SecurityException e) {
            System.out.println("No existen permisos");
            System.exit(1);
        }
    }
    
    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }
    
    public void cerrar() {
        out.close();
    }
}
