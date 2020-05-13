package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		
		//boolean tem = scanner.hasNextLine();// confirma se há no arquivo mais de uma linha
		//System.out.println(tem);
		
		//System.out.println("---------------------------------");
		
		/*
		 * String linha = scanner.nextLine(); System.out.println(linha);
		 * 
		 * System.out.println("---------------------------------");
		 */
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
		
		//String[] valores = linhas.split(",");//método split
		//System.out.println(Arrays.toString(valores));
		//System.out.println(valores[3]);
		
		//método com scaner
		
		Scanner linhaScanner = new Scanner(linha);
		linhaScanner.useLocale(Locale.US);
		linhaScanner.useDelimiter(",");
		
		String valor1 = linhaScanner.next();
		int valor2 = linhaScanner.nextInt();
		int valor3 = linhaScanner.nextInt();
		String valor4 = linhaScanner.next();
		double valor5 = linhaScanner.nextDouble();

		System.out.println(valor1 + valor2 + valor3 + valor4 + valor5 );
		
		linhaScanner.close();
			
		}
		
		
		scanner.close();
	}
}
