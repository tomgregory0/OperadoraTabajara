package br.com.gx2.negocio;

import br.com.gx2.telefonia.PlanoPosPago;

public class Fatura {
	
	
	private Plano plano;
	private Cliente cliente;
	private CalculoInternet calculoInternet;
	private CalculoTelefonia calculoTelefonia;
	
	
	public Fatura() {
		
		
	}
	
	
	public Fatura(Plano plano, Cliente cliente, CalculoInternet calculoInternet, CalculoTelefonia calculoTelefonia) {
		super();
		this.plano = plano;
		this.cliente = cliente;
		this.calculoInternet = calculoInternet;
		this.calculoTelefonia = calculoTelefonia;
	}
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public CalculoInternet getCalculoInternet() {
		return calculoInternet;
	}
	public void setCalculoInternet(CalculoInternet calculoInternet) {
		this.calculoInternet = calculoInternet;
	}
	public CalculoTelefonia getCalculoTelefonia() {
		return calculoTelefonia;
	}
	public void setCalculoTelefonia(CalculoTelefonia calculoTelefonia) {
		this.calculoTelefonia = calculoTelefonia;
	}
	@Override
	public String toString() {
		return "Fatura [plano=" + plano + ", cliente=" + cliente + ", calculoInternet=" + calculoInternet
				+ ", calculoTelefonia=" + calculoTelefonia + "]";
	}

}

