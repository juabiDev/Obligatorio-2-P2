/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author User
 */
public class ErrorAnioValido extends Exception {
    public ErrorAnioValido() {
        super("El año debe ser un numero menor a 2023");
    } 
    
}
