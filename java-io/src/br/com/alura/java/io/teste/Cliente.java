package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no ByteBank.
 * 
 * @author Fabricia;
 * @version 0.1;
 *
 */

public class Cliente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String cpf;
	private String profissao;

	public Cliente(String nome, String cpf, String profissão) {

		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissão;
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String toString() {
		
		return  "Cliente: " + this.nome + " CPF:  " + this.cpf + " Profissão: " + this.profissao;
	}

}
