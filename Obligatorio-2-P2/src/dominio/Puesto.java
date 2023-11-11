/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class Puesto implements Serializable {
    private String nombre;
    private String tipo;
    private ArrayList<Tematica> temasRequeridos;

    public Puesto() {
        this.nombre = "";
        this.tipo = "";
        this.temasRequeridos = new ArrayList<>();
    }

    public Puesto(String nombre, String tipo, ArrayList<Tematica> temasRequeridos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.temasRequeridos = temasRequeridos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Tematica> getTemasRequeridos() {
        return temasRequeridos;
    }

    public void setTemasRequeridos(ArrayList<Tematica> temasRequeridos) {
        this.temasRequeridos = temasRequeridos;
    }
    
    @Override
    public String toString() {
        return this.getNombre();
    }   
}
