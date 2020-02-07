package br.com.gx2.test;

import br.com.gx2.negocio.Cliente;
import br.com.gx2.negocio.StatusCliente;

public class TesteEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigoCliente = 10;
		String nomeCliente = "Ronaldo Prass";
		int numeroCliente = 1234;
		String statusCliente = "BLOQUEADO";
		StatusCliente status = StatusCliente.valueOf(statusCliente);
		
		Cliente cliente = new Cliente(codigoCliente, nomeCliente, numeroCliente, status);
		
		
		for (StatusCliente valores : status.values()) {
			System.out.println(valores);
		}
		
		System.out.println(status.getDescricao());
		
	}

}
