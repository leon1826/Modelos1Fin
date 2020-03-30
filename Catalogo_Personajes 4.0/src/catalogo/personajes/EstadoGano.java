/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import javax.swing.JOptionPane;

/**
 *
 * @author Leon1
 */
public class EstadoGano implements Estado {

    @Override
    public void accionestado() {
        System.out.println("entro");
        JOptionPane.showMessageDialog(null,"Has ganado","Aviso",JOptionPane.PLAIN_MESSAGE);
    }
    
}
    