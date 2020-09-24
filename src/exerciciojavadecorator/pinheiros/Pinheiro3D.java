/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojavadecorator.pinheiros;

/**
 *
 * @author andre
 */
public class Pinheiro3D extends Pinheiro{

    public Pinheiro3D() {
        this.tipoPinheiro = "Pinheiro3D";
    }
    
    @Override
    public void decorar() {
        System.out.println("Este é um " + this.getTipoPinheiro());
    }
    
}
