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
public abstract class Decorator implements PersonajeAbstracto{
    protected Personaje[] Personajes;
    
    
    public Decorator(Personaje[] Personajes) {
        this.Personajes = Personajes;
    }

    public abstract Personaje[] CambiarColor(Personaje[] Personajes);
}
