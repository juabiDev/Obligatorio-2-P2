/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Comparator;

/**
 *
 * @author Dana Cizin
 * @author Fabian Mederos
 */
public class CriterioPostulantes implements Comparator<Postulante> {
    
    public int compare(Postulante p1, Postulante p2) {
        return Integer.parseInt(p1.getCedula()) - Integer.parseInt(p2.getCedula());
    }
    
}
