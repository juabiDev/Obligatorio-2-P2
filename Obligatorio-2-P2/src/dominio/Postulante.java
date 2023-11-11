/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class Postulante extends Persona {
    private String telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private HashMap<String,String> temas;
    
    public Postulante() {
        super("", "", "");
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.temas = temas;
    }

    public Postulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato, HashMap<String,String> temas) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.temas = temas;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public HashMap<String,String> getTemas() {
        return temas;
    }

    public void setTemas(HashMap<String,String> temas) {
        this.temas = temas;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + " (" + this.getCedula() + ")";
    }

    public String formatoArchivo() {
        return this.getNombre() + " - " + this.getCedula() + " - " + this.getMail();
    }
    
    public ArrayList<String> formatoTemas() {
        ArrayList<String> temasFormateado = new ArrayList<>();

        for(Map.Entry<String,String> entry : temas.entrySet()) {
            String aux = entry.getKey() + " (" + entry.getValue() + ")";
            temasFormateado.add(aux);
        }

        return temasFormateado;
    }
}
