package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicao;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[10];
		this.posicao = 0;
	}
	
	public void adiciona(Object object) {
		this.referencias[this.posicao] = object;
		this.posicao++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicao;
	}
	
	public Object getReferencia() {
		return this.referencias[this.posicao];
	}

}
