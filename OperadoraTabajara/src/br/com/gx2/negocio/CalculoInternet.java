package br.com.gx2.negocio;

import br.com.gx2.internet.PlanoInternet;

public class CalculoInternet {
	
	PlanoInternet planoInternet = new PlanoInternet();

	
		double temp = 0;
		public double calculoMinutosTelefonia(double dadoAdicional,double dadosUtilizados) {
			if (dadosUtilizados > planoInternet.getFranquiaDado()) {
				
				temp = planoInternet.getFranquiaDado() - dadosUtilizados;
				
				dadoAdicional = temp * 15;
			} 
			return planoInternet.getFranquiaDado();
	}		
}



