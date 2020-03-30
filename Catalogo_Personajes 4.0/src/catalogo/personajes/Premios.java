/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Leon1
 */
public class Premios implements PersonajeAbstracto, Observador {
    
    private int x;
    private int y;
    private Image img;
    private int puntosacumulados;

    public int getPuntosacumulados() {
        return puntosacumulados;
    }

    public void setPuntosacumulados(int puntosacumulados) {
        this.puntosacumulados = puntosacumulados;
    }
    
    public Premios(){
        x=(int) (Math.random()*400+1);
        y=(int) (Math.random()*250+1);
        System.out.println(x+" "+ y);
    }
    

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tenerX() {
       return x;
    }

    @Override
    public int tenerY() {
        return y;
    }

    @Override
    public Image tenerImagen() {
        ImageIcon fot = new ImageIcon("imagenes/power.png");
        img = fot.getImage();
        return img;
    }

    @Override
    public void actualizar(int puntos) {
        puntosacumulados+=puntos;
        System.out.println("puntos actuales "+ Integer.toString(puntosacumulados));
        
    }

    @Override
    public int estado() {
        return getPuntosacumulados();
    }
    
}
