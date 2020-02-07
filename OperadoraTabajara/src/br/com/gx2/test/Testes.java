package br.com.gx2.test;

import br.com.gx2.negocio.CalculoInternet;
import br.com.gx2.negocio.CalculoTelefonia;
import br.com.gx2.negocio.Cliente;
import br.com.gx2.negocio.Fatura;
import br.com.gx2.negocio.Plano;
import br.com.gx2.negocio.StatusCliente;
import br.com.gx2.telefonia.PlanoPosPago;

public class Testes {
	
	public static void main(String[] args) {
	
	/* Gerar Fatura 
	 * Dados do Cliente
	 * 		    private int codigoCliente;
     			String nomeCliente;
     			int numeroCliente;
     			
     	Operadora
     			int codigoOperadora;
    			String nomeOperadora;
    			
    	detalhes d consumo
    	
    			quanto custa o plano 
    			quanto custa adicional
    			valor da fatura
     			
   	*/	
		
		
		
		Cliente cliente = new Cliente();	
		
		Plano plano ;
		CalculoInternet calculoInternet = new CalculoInternet();
		CalculoTelefonia calculoTelefonia = new CalculoTelefonia();
		
		
		
		cliente.setNomeCliente("Tom Gregory ");
		
		
		Fatura fatura = new Fatura(plano,cliente,calculoInternet,calculoTelefonia);
		
		
		System.out.println(fatura);
		

	}
}
