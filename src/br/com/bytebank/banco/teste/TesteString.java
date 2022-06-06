package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = " ";
		
		String nome = "Alura";
		String outra = nome.replace("A", "a");
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		int posicao = nome.indexOf("ur");
		System.out.println(posicao);
		
		int tamanho = nome.length();
		System.out.println(tamanho);
		
		for (int i=0; i<tamanho; i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(vazio.trim().isEmpty());
		System.out.println(vazio.isBlank());
		
		System.out.println("O nome contem uma substring ura: " 
				+ nome.contains("ura") );
		
		String nomeSplit = "Adriano:Takata";
		System.out.println(nomeSplit.split(":")[0]);
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		String texto = builder.toString();
		System.out.println(texto);
		
//		nome.toLowerCase();
		System.out.println(nome);
		System.out.println(outra);

	}

}
