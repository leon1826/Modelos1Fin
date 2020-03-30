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
public interface Observador {
    public void actualizar(int puntos);
    public int estado();
    
}
