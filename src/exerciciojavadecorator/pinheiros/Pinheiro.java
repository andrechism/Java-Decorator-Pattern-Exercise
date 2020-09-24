package exerciciojavadecorator.pinheiros;

/**
 *
 * @author andre
 */
public abstract class Pinheiro {
    protected String tipoPinheiro;
    
    public abstract void decorar();
    
    public String getTipoPinheiro() {
        return tipoPinheiro;
    }
}
