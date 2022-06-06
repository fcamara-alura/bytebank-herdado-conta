package br.com.bytebank.banco.modelo;

/**
 * Classe abstrata que representa um conta do ByteBank 
 * 
 * @author Adriano Sueke Takata
 *
 */

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; 
	// static faz com o a variável pertença a classe e não é do objeto
	
//	public Conta () {}
	
	/**
	 * Construtor para instanciar a classe conta
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
		Conta.total++;
//		System.out.println("A conta com agência " + this.agencia 
//				+ " e numero: " + this.numero + " foi criada com sucesso");
//		System.out.println("O total de conta é " + Conta.total);
	}
	
//	public Conta(int agencia, int numero) {
//		this(agencia, numero, 100.0);
//	}
	
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public abstract void deposita(double valor);
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public boolean saca(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Numero: " +
				this.getNumero();
	}
	
}
