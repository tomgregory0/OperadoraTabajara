package br.com.gx2.telefonia;

import br.com.gx2.negocio.Plano;

/**
 *
 * @author ronaldo
 */
public abstract class PlanoTelefonia extends Plano
 {

    private double franquiaMinuto;
    
    
    public PlanoTelefonia(int codigoPlano, String descricaoPlano, double valorPlano, double franquiaMinuto) {
        super(codigoPlano, descricaoPlano, valorPlano);
        this.franquiaMinuto = franquiaMinuto;
    }
    
   
    

    public double getFranquiaMinuto() {
        return franquiaMinuto;
    }

    public void setFranquiaMinuto(double franquiaMinuto) {
        this.franquiaMinuto = franquiaMinuto;
    }


}
