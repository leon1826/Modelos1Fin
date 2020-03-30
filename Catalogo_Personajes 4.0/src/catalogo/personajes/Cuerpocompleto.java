/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import javax.swing.JLabel;

/**
 *
 * @author Leon1
 */
public  abstract class Cuerpocompleto  {
    String imagencuerpo;
    public abstract Cuerpocompleto Crearcuerpocompleto(); 
     public String devolver(){
        return imagencuerpo;
    }
    
}
