package br.com.gx2.negocio;

import br.com.gx2.telefonia.PlanoTelefonia;

public class CalculoTelefonia {
	
	
	private PlanoTelefonia planoTelefonia;
	
	
		double temp = 0;
		public double calculoBandaLarga(double dadoAdicional,double dadosUtilizados) {
			if (dadosUtilizados > planoTelefonia.getFranquiaMinuto()) {
				
				temp = planoTelefonia.getFranquiaMinuto() - dadosUtilizados;
				
				dadoAdicional = temp * 0.08;
			} 
			return planoTelefonia.getFranquiaMinuto();
	}		
}

