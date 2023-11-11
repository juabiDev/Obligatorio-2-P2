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
public class Utility {
    
    public static void validarNumero(String valor) {
        try {
            Integer.valueOf(valor);
        } catch(NumberFormatException e) {
            throw new NumberFormatException(valor + " no es un número");
        }
    }
    
    public static void validarEntrevista(String cedulaPos, String cedulaEval, int puntaje, String comentarios) throws IllegalArgumentException, ErrorCamposVacios {

        if(comentarios.trim().equals("")) {
            throw new ErrorCamposVacios();
        }
            
        if(!validarRango(puntaje,0,100)) {
            throw new IllegalArgumentException("El puntaje debe ser un numero de 0 a 100");
        }      
    }
    
    public static void validarNivelPuesto(int nivel) throws IllegalArgumentException {
        if(!validarRango(nivel, 1, 10)) {
            throw new IllegalArgumentException("El nivel debe ser un numero de 1 a 10");
        }  
    }
    
    private static boolean validarRango(int numero, int min, int max) {
        return (numero >= min && numero <= max);
    }
}
