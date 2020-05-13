package br.com.alura.java.io.teste;

import java.io.BufferedWriter;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fis = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Informação de um texto que deverá ser escrito");
		bw.newLine();
		bw.write("Segundo teste com texto a ser escrito no console");

		bw.close();
	}

}
