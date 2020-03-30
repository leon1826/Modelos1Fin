/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.util.ArrayList;

/**
 *
 * @author Leon1
 */
public class CareTaker {
    
    private ArrayList<Memento> mementos = new ArrayList<>();
    
    public void AgregarMemento(Memento p){
        mementos.add(p);
    }
    
    public Memento getMemento(int indice){
        return mementos.get(indice);
                
    }
    
}
