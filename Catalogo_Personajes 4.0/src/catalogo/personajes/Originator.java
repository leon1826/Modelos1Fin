/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

/**
 *
 * @author Leon1
 */
public class Originator {
     private Personaje [] personajes;

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }
   
    public Memento guardar(){
        return new Memento(personajes);
    }
    public void restaurar(Memento m){
        this.personajes=m.getGuardado();
    }
}
