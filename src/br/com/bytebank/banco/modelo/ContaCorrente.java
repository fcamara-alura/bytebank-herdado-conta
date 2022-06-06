package br.com.bytebank.banco.modelo;


// new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	// Não herda contrutores
//	public ContaCorrente() {
//		super();
//	}
//	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 0.20;
		return super.saca(valorSacar);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta corrente " + super.toString();
	}

}
