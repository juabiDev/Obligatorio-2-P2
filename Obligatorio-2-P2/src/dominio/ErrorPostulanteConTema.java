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
public class ErrorPostulanteConTema extends Exception {
    public ErrorPostulanteConTema() {
        super("Debe agregar por lo menos 1 tema");
    } 
}
