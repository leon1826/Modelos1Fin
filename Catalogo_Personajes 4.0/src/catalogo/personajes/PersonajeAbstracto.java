/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Image;
import java.awt.event.KeyEvent;

/**
 *
 * @author Leon1
 */
public interface PersonajeAbstracto {

    /**
     *
     */
    String personaje="";

    /**
     *
     * @param 
     */
    public void keyPressed(KeyEvent e);
    public void keyReleased(KeyEvent e);
    public void mover();
//    
//    
    public int tenerX();
//    {
//        return x;
//    }
    
    public int tenerY();
//    
    
     public Image tenerImagen();
//        
    
}

