package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		//System.out.println("x");
		//System.out.println(3);
		//System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(123, 257);
		
		//Cliente cliente = new Cliente();
		
		Object cliente = new Cliente("Ana", "123456", "Florista");
		
		System.out.println(cliente);
		System.out.println(cc);
		System.out.println(cp);

	}
	
	static void println() {
		
	};
	
	static void println(int a) {
		
	};
	
	static void println(boolean valor) {
		
	};
	
	static void println(Object referencia) {
		
	};
	
	

}
