package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayEquals {
	

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(11, 11);
//		
//		boolean igual = cc1.isEqual(cc2);
//		System.out.println(igual);

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new ContaCorrente(22, 22);


        System.out.println(lista.contains(cc2));
        
    
        
        // recurso novo do Java
        for(Conta conta : lista) {
            System.out.println(conta);
        }

	
}

}


