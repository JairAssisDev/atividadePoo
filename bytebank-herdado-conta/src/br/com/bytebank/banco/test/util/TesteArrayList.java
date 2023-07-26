package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;



public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		
		Conta cc1 = new ContaCorrente(123, 70345);
		Conta cc2 = new ContaCorrente(423, 45345);
		lista.add(cc1);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref);
		System.out.println(ref.getAgencia());
		
		lista.remove(0);
		Conta ref1 =  lista.get(0);
		System.out.println(ref1);
		
		System.out.println("tamanho: "+ lista.size());
		
		Conta cc3 = new ContaCorrente(463, 73455);
		Conta cc4 = new ContaCorrente(453, 88455);
		lista.add(cc3);
		lista.add(cc4);
		
		for (int i = 0; i<lista.size(); i++) {
			Conta oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
	}

}
