/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Lindsey Camargo
 */
public class Personaje implements PersonajeAbstracto,ObservadoSuje{
    
     protected String personaje;
    FabricaPersonajes fab;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image img;
    private int puntos=0;
    private ArrayList<Observador> observadores;
    private Estado estado;

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    public Personaje(String personaje,FabricaPersonajes fab) {
        this.personaje=personaje;
        this.fab=fab;
        this.observadores = new ArrayList();
        EstadoJugando jugando = new EstadoJugando(); 
        this.estado=jugando; 
        x=(int) (Math.random()*400+1);
        y=(int) (Math.random()*250+1);
        System.out.println(x+" "+ y);
        verificar();
//        personaje=fab.cuerpocompleto();
        System.out.print(personaje);
        
    }

    public void setPuntos(int puntos) {
        this.puntos = this.puntos+ puntos;
    }
    

    public int getPuntos() {
        return puntos;
    }
    
    

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        if (key==KeyEvent.VK_LEFT){
            if(x>=0)
            dx=-1;
            else{
                dx=0;
            }
        }
        if (key==KeyEvent.VK_RIGHT){
            if(x<=500)
            dx=1;
            else{
                dx=0;
            }
        }
        if (key==KeyEvent.VK_UP){
            if(y>=0)
            dy=-1;
            else{
                dy=0;
            }
        }
        if (key==KeyEvent.VK_DOWN){
            if(y<=300)
            dy=1;
            else{
                dy=0;
            }
        }
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
        {
        int key=e.getKeyCode();
        
        if (key==KeyEvent.VK_LEFT){
            dx=0;
        }
        if (key==KeyEvent.VK_RIGHT){
            dx=0;
        }
        if (key==KeyEvent.VK_UP){
            dy=0;
        }
        if (key==KeyEvent.VK_DOWN){
            dy=0;
        }
    }
    }

    @Override
    public void mover() 
        {
        x+=dx;
        y+=dy;
    }
    

    @Override
    public int tenerX() {
        {
        return x;
    }
    }

    @Override
    public int tenerY() 
        {
        return y;
    }
    

    @Override
    public Image tenerImagen() {
        ImageIcon fot = new ImageIcon(personaje);
        img = fot.getImage();
        return img;
    }

    @Override
    public void aviso(int point) {
        for (Observador observador : observadores ){
            observador.actualizar(point);
            setPuntos(point);
            verificar();
        }
        }
        
    

    @Override
    public void agegarobservador(Observador premio) {
        System.out.println("ENTRO AGREGAR OBSERVADOR");
        this.observadores.add(premio);
    }

    private void verificar() {
        if(getPuntos()>50){
            System.out.println("gano");
            EstadoGano Gano = new EstadoGano();
            setEstado(Gano);
            Gano.accionestado();
        }else{
                 System.out.println("seguir jugando");   
                    }
        if(getPuntos()<0){
            System.out.println("Perdio");
            EstadoPerdio perdio = new EstadoPerdio();
            setEstado(perdio);
            perdio.accionestado();
            
        }
    }
}
