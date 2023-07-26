package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(123, 70345);
		Conta cc2 = new ContaCorrente(423, 45345);
		lista.add(cc1);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(423, 45345);
		
		boolean existe= lista.contains(cc3);

		System.out.println("já exite? "+existe);
		
		for (Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("já tenho essa conta! ");
			}
		}
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
