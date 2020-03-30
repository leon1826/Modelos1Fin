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
public class Cadena1 implements CadenaResponsabilidad{
    private CadenaResponsabilidad susesor;
    private final int tipoinfo=1;

    public Cadena1(CadenaResponsabilidad tipo) {
        this.susesor=tipo;
        
    }
    

    @Override
    public String Info(int Info) {
        if(Info==tipoinfo){
            System.out.println("Hola");
            return Respuesta();
        }else{
            return susesor.Info(Info);
        }
    }

    @Override
    public String Respuesta() {
        return "En la configuracion de estilos cambiaras todo el personaje";
        
    }
    
}
