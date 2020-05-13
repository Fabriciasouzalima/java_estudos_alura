package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestaArrayReferencias {

	public static void main(String[] args) {
		
		//ContaCorrente[] contas = new ContaCorrente[5];
		
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(2222, 1578);
		ContaCorrente cc2 = new ContaCorrente(1111, 5634);
		
		referencias[0] = cc1;// inclusão da referência do objeto CC no array;
		referencias[1] = cc2;
		
		//ContaCorrente[] refs = {cc1,cc2};
		
		//System.out.println(refs.length);//pegou o número de objetos na minha array
		//System.out.println(refs);
		
		System.out.println(referencias[0]);
		
		System.out.println("--------------------------------------------------------");
		
		Conta[] novasReferencias = new Conta[5];
		
		Conta cp = new ContaPoupanca(1234, 8475);
		Conta cp1 = new ContaPoupanca(1254, 8978);
		
		novasReferencias[0] = cp; 
		novasReferencias[1] = cp1; 
		
		System.out.println(novasReferencias[0]);
		
		System.out.println("---------------------------------------------------------");
		
		ContaPoupanca ref = (ContaPoupanca) novasReferencias[1];
		System.out.println(ref);
		
		System.out.println("----------------------------------------------------------");
		
		Cliente cliente = new Cliente("Jacobina", "123456", "Pipoqueira");
		

		referencias[2] = cliente;
		System.out.println(referencias[2]);
	}

}
