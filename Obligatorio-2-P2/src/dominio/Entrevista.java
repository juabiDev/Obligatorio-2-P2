/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Entrevista implements Serializable {
    private int nroEntrevista;
    private Postulante postulante;
    private Entrevistador entrevistador;
    private int puntaje;
    private ArrayList<String> comentarios;
    
    private static int cantidadEntrevistas;

    public Entrevista(Postulante postulante, Entrevistador entrevistador, int puntaje, ArrayList<String> comentarios) {
        this.nroEntrevista = cantidadEntrevistas;
        this.postulante = postulante;
        this.entrevistador = entrevistador;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
    }

    public int getNroEntrevista() {
        return nroEntrevista;
    }

    public void setNroEntrevista(int nroEntrevista) {
        this.nroEntrevista = nroEntrevista;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public Entrevistador getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(Entrevistador entrevistador) {
        this.entrevistador = entrevistador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public static int getCantidadEntrevistas() {
        return cantidadEntrevistas;
    }

    public static void setCantidadEntrevistas(int cantidadEntrevistas) {
        Entrevista.cantidadEntrevistas = cantidadEntrevistas;
    }
    
    
}
