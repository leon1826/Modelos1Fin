package catalogo.personajes;

import java.awt.Image;
import java.awt.event.KeyEvent;
import sun.security.util.Length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leon1
 */
public class DecorarConcretoAzul extends Decorator{

    public DecorarConcretoAzul(Personaje[] Personajes) {
        super(Personajes);
    }

    @Override
    public Personaje[] CambiarColor(Personaje[] Personajes) {
        this.Personajes=Personajes;
        String analisis = Personajes[0].fab.toString();
        String hum = "Humanos";
        String elf ="Elfos";
        String orc="Orcos";
        System.out.println(Personajes[0].fab.toString());
//        String  = "Humanos";
        System.out.println(analisis+"paso metodo decorador");
        if(analisis.indexOf(hum)>0){
            for(int i=0;i<Personajes.length;i++){
            Personajes[i].personaje="imagenes/humanoa.png";
            System.out.println(hum+Personajes[i].personaje+"esta entrando al if");
            }
        return Personajes;
        }
        if(analisis.indexOf(elf)>0){
            for(int i=0;i<Personajes.length;i++){
            Personajes[i].personaje="imagenes/elfoapng";
            System.out.println(elf+Personajes[i].personaje+"esta entrando al if del elfo");
            }
        return Personajes;
        }
        if(analisis.indexOf(orc)>0){
            for(int i=0;i<Personajes.length;i++){
            Personajes[i].personaje="imagenes/orcoa.png";
            System.out.println(hum+Personajes[i].personaje+"esta entrando al if");
            }
        return Personajes;
        }
                
        

        return Personajes;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tenerY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image tenerImagen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

    