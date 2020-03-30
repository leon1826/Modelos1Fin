
package catalogo.personajes;

import javax.swing.JPanel;


public class FabricaElfos extends FabricaPersonajes{
    public JPanel panel;
    public ArmaElfos ae;
    public EscudoElfos ee;
    public CuerpoElfos ce;
    public String co;
    public FabricaElfos(){
    }   

    @Override
    public Arma creararma() {
        ae = new ArmaElfos();
        return ae;
    }

    @Override
    public Cuerpo crearcuerpo() {
        ce = new CuerpoElfos();
        return ce;
    }

    @Override
    public Escudo crearescudo() {
        ee = new EscudoElfos();
        return ee;
    }

    @Override
    public String cuerpocompleto() {
        co="imagenes/elfo.png";
        return co;
    }

    @Override
    public void SetImagen(String co) {
        this.completo=co;
    }

    
}
