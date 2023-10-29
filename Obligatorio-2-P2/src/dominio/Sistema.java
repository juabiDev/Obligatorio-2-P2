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
    private ArrayList<Evaluador> listaEvaluadores;
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Entrevista> listaEntrevistas;
    private ArrayList<Puesto> listaPuestos;
    
    public Sistema() {
        this.listaTematicas = new ArrayList<>();
        this.listaPostulantes = new ArrayList<>();
        this.listaEvaluadores = new ArrayList<>();
        this.listaEntrevistas = new ArrayList<>();
        this.listaPuestos = new ArrayList<>();
        this.listaPersonas = new ArrayList<>();
    }
    
    public ArrayList<Tematica> getTematicas() {
        return listaTematicas;
    }
    
    public ArrayList<Evaluador> getEvaluadores() {
        return listaEvaluadores;
    }
    
    public ArrayList<Postulante> getPostulantes() {
        return listaPostulantes;
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
    
    public void agregarPostulante(String nombre, String cedula, String direccion, String telefono, String mail, String linkedin, String formato, HashMap<String,String> temas) {
        boolean existeCedula = this.validarExisteCedula(cedula);
        
        if(!existeCedula) {
            Postulante nuevoPostulante = new Postulante(nombre, cedula, direccion, telefono, mail, linkedin, formato, temas);
            this.listaPersonas.add(nuevoPostulante);
            this.listaPostulantes.add(nuevoPostulante);
            System.out.println("Creado");
        }
    }
    
    public boolean validarExisteCedula(String cedula) {
        boolean existeCedula = false;
        
        for(Persona unaPersona : this.listaPersonas) {
            if(unaPersona.getCedula().equals(cedula)) {
                existeCedula = true;
            }
        }
        
        return existeCedula;
    }
    
    public void agregarTematicaPostulante(String unNombre, String unNivel, String unaCedula) {
        for(Postulante unPostulante : this.listaPostulantes) {
            if(unPostulante.getCedula().equals(unaCedula)) {
                unPostulante.getTemas().put(unNombre,unNivel);
                System.out.println("se agregó tema a postulante");
            }
        }
    }
    
    public boolean agregarEvaluador(String nombre, String cedula, String direccion, String anioIngreso) {
        boolean existeCedula = this.validarExisteCedula(cedula);
        
        if(!existeCedula) {
            Evaluador nuevoEvaluador = new Evaluador(nombre, cedula, direccion, anioIngreso);
            this.listaPersonas.add(nuevoEvaluador);
            this.listaEvaluadores.add(nuevoEvaluador);
            System.out.println("Evaluador Creado");
        }
        
        return !existeCedula;
    }
    
    public void agregarEntrevista(String cedulaPos, String cedulaEval, int puntaje, String comentarios) {
        Postulante postulante = null;
        for (Postulante pos : this.listaPostulantes) {
            if(pos.getCedula().equals(cedulaPos)) {
                postulante = pos;
            }
        }
        
        Evaluador evaluador = null;
        for (Evaluador eval : this.listaEvaluadores) {
            if(eval.getCedula().equals(cedulaEval)) {
                evaluador = eval;
            }
        }
        
        Entrevista nuevaEntrevista = new Entrevista(postulante, evaluador, puntaje, comentarios);    
        
        this.listaEntrevistas.add(nuevaEntrevista);
    }
    
    public boolean agregarPuesto(String unNombre, String tipo, ArrayList<String> temasRequeridos) {
        boolean existeNombre = false;
        
        for(Puesto puesto : this.listaPuestos) {
            if(puesto.getNombre().equalsIgnoreCase(unNombre)) {
                existeNombre = true;
            }
        }
        
        ArrayList<Tematica> temas = new ArrayList<>();
        for (String temaReq : temasRequeridos) {
            for(Tematica tematica : this.listaTematicas) {
                if (tematica.getNombre().equalsIgnoreCase(temaReq)) {
                    temas.add(tematica);
                }
            }
        }
        
        if(!existeNombre) {
            Puesto nuevoPuesto = new Puesto(unNombre, tipo, temas);
            this.listaPuestos.add(nuevoPuesto);
        }
        
        return existeNombre;
    }
}
