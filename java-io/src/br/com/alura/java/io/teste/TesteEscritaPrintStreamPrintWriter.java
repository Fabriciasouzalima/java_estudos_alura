package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		/*
		 * BufferedWriter bw = new BufferedWriter( new FileWriter("lorem2.txt"));
		 * bw.write("Informação de um texto que deverá ser escrito");
		 * bw.write("Informação de um texto que deverá ser escrito");
		 * bw.write(System.lineSeparator()); bw.write("\n");
		 * bw.write("Segundo teste com texto a ser escrito no console");
		 * 
		 * bw.close();
		 */		
		
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		long ini = System.currentTimeMillis();
		
		//PrintWriter pw = new PrintWriter("lorem2.txt"); 
		PrintWriter pw = new PrintWriter("lorem2.txt", "UTF-8");

		pw.println("O printStream existe antes do BufferedWritter");
		pw.println();
		pw.println("Outra informação a ser adicionada");
		
		pw.close();
		
		 
		 long fim = System.currentTimeMillis();

	     System.out.println("Passaram " + (fim - ini) + " milissegundos");
		
		
	}

}
