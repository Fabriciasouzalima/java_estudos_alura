package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInterger {

	public static void main(String[] args) {
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		int valor = idadeRef.intValue(); // unboxing
		String s = args[0];// "10"
		// Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);

		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing

		Integer idadeRef1 = 29; // autoboxinng, é criado um objeto do tipo Integer
		int primitivo = new Integer(21); // que locura!! unboxing

		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef1); // ok
		lista.add(primitivo); // autoboxing

		int i1 = lista.get(0); // unboxing
		Integer i2 = lista.get(1); // ok

		System.out.println(i1); // 29
		System.out.println(i2); // 21

		Integer valorRef = Integer.valueOf(33); // delegando a criação para método valueOf
		int valorPri = valorRef.intValue(); // desembrulhando, pegando o valor primitivo do objeto wrapper

		System.out.println(valorPri); // 33

	}

}
