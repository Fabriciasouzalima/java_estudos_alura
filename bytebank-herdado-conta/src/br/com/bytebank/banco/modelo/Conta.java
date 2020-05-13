package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta.
 * 
 * @author Fabricia
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas é : " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo" + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	};

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {

		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {

		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número inválido, número negativo");
			return;
		}

		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {

		if (agencia <= 0) {
			System.out.println("Conta inválida, número negativo");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public String toString() {

		return this.numero + " Agência: " + this.getAgencia() + " Saldo: " + this.saldo;
	}

	@Override
	public boolean equals(Object ref) {

		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}

		if (this.numero != outra.numero) {
			return false;
		}

		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo);
	}
}