package br.com.bytebank.banco.modelo;


public class CalculadoraDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
