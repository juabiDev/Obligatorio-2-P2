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
public class ErrorCedulaExistente extends Exception {
    public ErrorCedulaExistente() {
        super("Cédula ya existente");
    }
    
}
