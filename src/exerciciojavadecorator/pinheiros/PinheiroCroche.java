package exerciciojavadecorator.pinheiros;

/**
 *
 * @author andre
 */
public class PinheiroCroche extends Pinheiro{

    public PinheiroCroche() {
        this.tipoPinheiro = "Pinheiro de Croche";
    }
    
    @Override
    public void decorar() {
        System.out.println("Este é um " + this.getTipoPinheiro());
    }
    
}
