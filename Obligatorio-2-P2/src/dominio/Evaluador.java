/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class Evaluador extends Persona {
    private String anioIngreso;
    
    public Evaluador(String nombre, String cedula, String direccion, String anioIngreso) {
        super(nombre, cedula, direccion);
        this.anioIngreso = anioIngreso;
    }  

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    public String formatoTabla() {
        return this.getNombre() + " (" + this.getCedula() + ")";
    }
    
}
