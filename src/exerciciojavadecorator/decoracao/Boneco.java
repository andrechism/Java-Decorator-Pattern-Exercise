package exerciciojavadecorator.decoracao;

import exerciciojavadecorator.pinheiros.Pinheiro;

/**
 *
 * @author andre
 */
public class Boneco extends Decoracao{
    
    public Boneco(Pinheiro pinheiro) {
        super(pinheiro);
    }
    
    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Decorou com Boneco");
    }
}
