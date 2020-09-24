package exerciciojavadecorator.pinheiros;

/**
 *
 * @author andre
 */
public class PinheiroPapel extends Pinheiro{

    public PinheiroPapel() {
        this.tipoPinheiro = "Pinheiro de Papel";
    }
    
    @Override
    public void decorar() {
        System.out.println("Este é um " + this.getTipoPinheiro());
    }
    
}
