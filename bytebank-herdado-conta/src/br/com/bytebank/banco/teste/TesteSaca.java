package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		try {
			conta.saca(220.0);

		}catch(SaldoInsuficienteException ex){
			System.out.println("Saldo Insuficiente: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());

	}

}
