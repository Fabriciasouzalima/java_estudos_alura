package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWritter {

	public static void main(String[] args) throws IOException {

		/*
		 * OutputStream fis = new FileOutputStream("lorem2.txt"); Writer osw = new
		 * OutputStreamWriter(fis); BufferedWriter bw = new BufferedWriter(osw);
		 */
		
		//FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));
		bw.write("Informação de um texto que deverá ser escrito");
		bw.write("Informação de um texto que deverá ser escrito");
		bw.write(System.lineSeparator());
		bw.write("\n");
		bw.write("Segundo teste com texto a ser escrito no console");

		bw.close();
	}

}
