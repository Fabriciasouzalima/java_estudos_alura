package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String vazio = "";
		System.out.println(vazio.isEmpty());// verifica se a string/campo foi preenchido;
		System.out.println(vazio.contains("Alu"));
		
		String vazioComEspaco = " ";
		//vazioComEspaço.trim();// remove os espaços;
		String outroVazio = vazioComEspaco.trim();
		System.out.println(outroVazio.isEmpty());
		
		String nome = "Alura"; // object literal;
		
		String outroNome = nome.replace("l", "L");
		String segundoNome = nome.toLowerCase();
		String nome1 = nome.toUpperCase();
		
		char c = nome.charAt(2); // me devolve o caracter nessa posição;
		
		int posicao = nome.indexOf("ur");// devolve a posição (int) em que esta o caracter;
		
		String sub = nome.substring(1);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome);
		System.out.println(outroNome);
		System.out.println(segundoNome);
		System.out.println(nome1);
		System.out.println(c);
		System.out.println(posicao);
		System.out.println(sub);
		System.out.println(nome.length());
	}

}
