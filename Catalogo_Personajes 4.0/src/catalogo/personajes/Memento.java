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
public class Memento {

    private Personaje [] personajes;

    public Memento(Personaje[] personajes) {
        this.personajes=personajes;
    }

    public Personaje[] getGuardado() {
        return personajes;
    }
    
}
