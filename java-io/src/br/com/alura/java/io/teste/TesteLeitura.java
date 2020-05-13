package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		// Necessita de um tratamendo de exceção;

		/*
		 * FileInputStream fis = new FileInputStream("lorem.txt");// procura os
		 * caracteres do arquivo InputStreamReader isr = new InputStreamReader(fis);//
		 * recebe os bytes e transforma em caracteres BufferedReader br = new
		 * BufferedReader(isr);// transforma o int em caracter que pode ser lido por
		 * linha,representa um conjunto de caracteres,
		 * 
		 * String linha = br.readLine();
		 * 
		 * while(linha != null) { System.out.println(linha); linha = br.readLine();
		 * 
		 * }
		 * 
		 * //System.out.println(Linha);
		 * 
		 * br.close();
		 */

		// Método genérico

		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis, "UTF-8");

//		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();
	}

}
