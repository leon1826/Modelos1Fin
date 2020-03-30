/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lindsey
 */
public class ArmaElfos extends Arma {
    
    
    @Override
    public ArmaElfos CrearArma() {
        return new ArmaElfos();
    }
    
    public ArmaElfos(){
        ImageIcon fot = new ImageIcon("imagenes/aelfo.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
        imagen.setIcon(icono);
    }

    
}
