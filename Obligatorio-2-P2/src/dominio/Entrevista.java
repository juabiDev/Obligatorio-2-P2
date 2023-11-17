/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;
/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class Entrevista implements Serializable {
    private int nroEntrevista;
    private Postulante postulante;
    private Evaluador entrevistador;
    private int puntaje;
    private String comentarios;

    public Entrevista(int nroEntrevista, Postulante postulante, Evaluador entrevistador, int puntaje, String comentarios) {
        this.nroEntrevista = nroEntrevista;
        this.postulante = postulante;
        this.entrevistador = entrevistador;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
    }

    public int getNroEntrevista() {
        return this.nroEntrevista;
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

    public Evaluador getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(Evaluador entrevistador) {
        this.entrevistador = entrevistador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int compareTo(Entrevista unaEntrevista) {
        return unaEntrevista.getPuntaje() - this.getPuntaje();
    }
}
