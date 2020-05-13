package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivo {

	public static void main(String[] args) {

		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {

			idades[i] = i * i;

		}
		
		for (int i = 0; i < idades.length; i++) {

			System.out.println(idades[i]);

		}

		/*
		 * idades[0] = 29; idades[1] = 30; idades[2] = 31; idades[3] = 32; idades[4] =
		 * 33;
		 */

		/*
		 * int idade1 = 20; int idade2 = 30; int idade3 = 40; int idade4 = 50; int
		 * idade5 = 60;
		 */

		// int idade1 = idades[0];

	}

}
