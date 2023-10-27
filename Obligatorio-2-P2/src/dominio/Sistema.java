/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class Sistema implements Serializable {
    private ArrayList<Tematica> listaTematicas;
    private ArrayList<Postulante> listaPostulantes;
    private ArrayList<Entrevistador> listaEntrevistadores;
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Puesto> listaPuestos;
    
    public Sistema() {
        this.listaTematicas = new ArrayList<>();
        this.listaPostulantes = new ArrayList<>();
        this.listaEntrevistadores = new ArrayList<>();
        this.listaEntrevistas = new ArrayList<>();
        this.listaPuestos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }
    
    public ArrayList<Tematica> getTematicas() {
        return listaTematicas;
    }
    
    public boolean agregarTematica(String nombre, String descripcion) {
        boolean existeNombre = false;
        for(Tematica unaTematica : this.listaTematicas) {
            if(unaTematica.getNombre().equalsIgnoreCase(nombre)) {
                existeNombre = true;
            }
        }
        
        if(!existeNombre) {
            Tematica nuevaTematica = new Tematica(nombre,descripcion);
            this.listaTematicas.add(nuevaTematica);
        }
        
        return existeNombre;
    }
    
    public boolean agregarPostulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato, HashMap<String,String> temas) {
        boolean existeCedula = false;
        
        for(Persona unaPersona : this.listaPersonas) {
            if(unaPersona.getCedula().equals(cedula)) {
                existeCedula = true;
            }
        }
        
        if(!existeCedula) {
            Postulante nuevoPostulante = new Postulante(nombre, cedula, direccion, telefono, mail, linkedin, formato, temas);
            this.listaPersonas.add(nuevoPostulante);
            this.listaPostulantes.add(nuevoPostulante);
            System.out.println("Creado");
        }
        
        return existeCedula;
    }
    
    public boolean validarPostulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato) {
        boolean existeCedula = false;
        
        for(Persona unaPersona : this.listaPersonas) {
            if(unaPersona.getCedula().equals(cedula)) {
                existeCedula = true;
            }
        }
        
        return !existeCedula;
    }
    
    public void agregarTematicaPostulante(String unNombre, String unNivel, String unaCedula) {
        for(Postulante unPostulante : this.listaPostulantes) {
            if(unPostulante.getCedula().equals(unaCedula)) {
                unPostulante.getTemas().put(unNombre,unNivel);
                System.out.println("se agrego tema a postulante");
            }
        }
    }
    
}
