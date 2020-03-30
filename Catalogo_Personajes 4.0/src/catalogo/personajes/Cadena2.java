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
public class Cadena2 implements CadenaResponsabilidad{
    private final int tipoinfo=2;

    public Cadena2() {
        System.out.println("Entro a Cadena 2");
    }
    

    @Override
    public String Info(int Info) {
        if(Info==tipoinfo){
            return Respuesta();
        }else{
            return "No se puede obtener ayuda";
        }
    }

    @Override
    public String Respuesta() {
        return "A traves de la estartegia controlaras que tan rapido se mueve tu personaje";
    }
    
    
}
