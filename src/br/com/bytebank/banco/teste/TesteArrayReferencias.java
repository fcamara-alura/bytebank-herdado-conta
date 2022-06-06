package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
//		Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(111, 111);
		referencias[0] = cc1;
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		referencias[1] = cp1;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaCorrente refCC = (ContaCorrente) referencias[0];
		
		System.out.println(referencias[0]);
		System.out.println(referencias[1].toString());
		System.out.println(refCC.getNumero());
		
	}

}
