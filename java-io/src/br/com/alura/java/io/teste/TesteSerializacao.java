package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//String nome = "Fabricia Lima";

		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream("Objeto.bin")); oos.writeObject(nome);
		 * 
		 * oos.close(); // gravou o objeto
		 */

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
	}
}
