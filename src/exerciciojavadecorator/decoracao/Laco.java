package exerciciojavadecorator.decoracao;

import exerciciojavadecorator.pinheiros.Pinheiro;

/**
 *
 * @author andre
 */
public class Laco extends Decoracao{
    
    public Laco(Pinheiro pinheiro) {
        super(pinheiro);
    }
    
    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Decorou com Laco");
    }
}
