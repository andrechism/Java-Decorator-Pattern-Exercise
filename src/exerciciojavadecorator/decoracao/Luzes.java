package exerciciojavadecorator.decoracao;

import exerciciojavadecorator.pinheiros.Pinheiro;

/**
 *
 * @author andre
 */
public class Luzes extends Decoracao{
    
    public Luzes(Pinheiro pinheiro) {
        super(pinheiro);
    }
    
    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Decorou com Luzes");
    }
}
