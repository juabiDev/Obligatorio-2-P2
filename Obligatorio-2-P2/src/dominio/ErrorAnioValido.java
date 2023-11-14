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
public class ErrorAnioValido extends Exception {
    public ErrorAnioValido() {
        super("El año debe ser un número entre 1970 y 2023");
    }    
}
