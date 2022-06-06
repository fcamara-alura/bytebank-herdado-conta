package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(33, 44);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta  ref1 = lista.get(0);
		System.out.println(ref1.getAgencia());
	
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(55, 66);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(77, 88);
		lista.add(cc4);
		
		System.out.println("Tamanho: " + lista.size());
	
		Conta  ref2 = lista.get(0);
		System.out.println(ref2.getAgencia());
		
		for (int i = 0 ; i< lista.size(); i++ ) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("---------------");
		
		for (Conta conta:lista) {
			System.out.println(conta);
		}
		System.out.println("-------------------");
		
		lista.forEach(conta -> System.out.println(conta));
	}

}
