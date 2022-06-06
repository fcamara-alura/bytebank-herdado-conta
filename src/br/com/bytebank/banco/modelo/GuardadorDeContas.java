package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicao;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicao = 0;
	}
	
	public void adicionar(Conta conta) {
		referencias[this.posicao] = conta;
		this.posicao += 1;
	}

	public int getQuantidadeDeElemento() {
		return this.posicao;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
