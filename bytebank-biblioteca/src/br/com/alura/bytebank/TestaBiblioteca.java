package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaBiblioteca {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente(132,123);
		c1.deposita(200.0);
		System.out.println("Meu saldo é : " + c1.getSaldo());

	}

}
