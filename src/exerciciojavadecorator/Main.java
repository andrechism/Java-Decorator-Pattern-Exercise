package exerciciojavadecorator;

import exerciciojavadecorator.decoracao.*;
import exerciciojavadecorator.pinheiros.*;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        Pinheiro p1 = new Bolinha(new Boneco(new Laco(new Luzes(new Pinheiro3D()))));
        p1.decorar();
        
        System.out.println("");
        Pinheiro p2 = new Luzes(new Laco(new PinheiroCroche()));
        p2.decorar();
        
        System.out.println("");
        Pinheiro p3 = new PinheiroPapel();
        p3.decorar();
        
        System.out.println("");
    }
    
}
