/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Postulante extends Persona {
    private long telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private ArrayList<String> temas;

    public Postulante(long telefono, String mail, String linkedin, String formato, ArrayList<String> temas, String nombre, long cedula, String direccion) {
        super(nombre, cedula, direccion);
        this.telefono = telefono;
        this.mail = mail;
        this.linkedin = linkedin;
        this.formato = formato;
        this.temas = temas;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
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

    public ArrayList<String> getTemas() {
        return temas;
    }

    public void setTemas(ArrayList<String> temas) {
        this.temas = temas;
    }

    
}
