package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		// ideia da comunicação via rede 
		//Socket s = new Socket().getInputStream();


		InputStream fis = System.in;
		//new FileInputStream("lorem.txt"); // informação do método que se encontra ao lado direito pode variar
		//InputStream fis = new FileInputStream("lorem.txt");// método mais genérico - arquivo
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;
		//new FileOutputStream("lorem2.txt");// console
		//OutputStream fos = new FileOutputStream("lorem2.txt");//ler no teclado e escrever no arquivo; 
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		String linha = br.readLine();

		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();// limpa a fila de informaçoes e guarda as anteriores; 
			linha = br.readLine();
		}

		br.close();
		bw.close();
	}

}
