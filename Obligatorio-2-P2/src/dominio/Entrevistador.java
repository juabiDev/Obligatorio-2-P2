/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author User
 */
public class Entrevistador extends Persona {
    private int anioIngreso;
    
    public Entrevistador(String nombre, long cedula, String direccion, int anioIngreso) {
        super(nombre, cedula, direccion);
        this.anioIngreso = anioIngreso;
    }  

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
}
