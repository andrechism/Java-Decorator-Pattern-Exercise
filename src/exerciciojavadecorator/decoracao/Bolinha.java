package exerciciojavadecorator.decoracao;

import exerciciojavadecorator.pinheiros.Pinheiro;

/**
 *
 * @author andre
 */
public class Bolinha extends Decoracao{
    
    public Bolinha(Pinheiro pinheiro) {
        super(pinheiro);
    }
    
    @Override
    public void decorar() {
        super.decorar();
        System.out.println("Decorou com Bolinha");
    }
    
}
