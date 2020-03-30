
package catalogo.personajes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FabricaHumanos extends FabricaPersonajes {
    public JPanel panel;
    protected String tipo= "humano";
    public ArmaHumanos ah;
    public EscudoHumanos eh;
    public CuerpoHumanos ch;
    public FabricaHumanos (){
    }
    

    @Override
    public Arma creararma() {
        ah = new ArmaHumanos();
        return ah;
        }

    @Override
    public Cuerpo crearcuerpo() {
        ch = new CuerpoHumanos();
        return ch;
    }

    @Override
    public Escudo crearescudo() {
        eh = new EscudoHumanos();
        return eh;
    }

    @Override
    public String cuerpocompleto() {
        completo="imagenes/humano.png";
        return completo;
    }

    @Override
    public void SetImagen(String co) {
        this.completo=co;
    }

  


}


