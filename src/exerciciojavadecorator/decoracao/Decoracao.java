package exerciciojavadecorator.decoracao;

import exerciciojavadecorator.pinheiros.Pinheiro;

/**
 *
 * @author andre
 */
public abstract class Decoracao extends Pinheiro{

    protected Pinheiro pinheiro;
    
    public Decoracao(Pinheiro pinheiro) {
        this.pinheiro = pinheiro;
    }

    @Override
    public void decorar() {
        if(pinheiro != null) {
            pinheiro.decorar();
        }
    }
    
}
