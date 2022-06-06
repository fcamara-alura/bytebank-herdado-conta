package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(11, 22);
		guardadorDeContas.adicionar(cc1);
		
		Conta cc2 = new ContaCorrente(44, 55);
		guardadorDeContas.adicionar(cc2);
		
		int tamanho = guardadorDeContas.getQuantidadeDeElemento();
		System.out.println(tamanho);
		
		Conta ref = guardadorDeContas.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
