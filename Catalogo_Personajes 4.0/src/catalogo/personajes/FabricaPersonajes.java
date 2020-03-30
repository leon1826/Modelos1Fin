
package catalogo.personajes;

import javax.swing.JPanel;

/**
 *
 * @author Leon1
 */
public abstract class FabricaPersonajes {
    protected  String completo;
   

   public abstract Arma creararma();
   public abstract Cuerpo crearcuerpo();
   public abstract Escudo crearescudo();
   public abstract String cuerpocompleto();
   public abstract void SetImagen(String co);

   
   
}
