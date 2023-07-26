package br.com.bytebank.banco.test;

import modelo.ContaCorrente;

public class TesteArrayDeReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente[] contas =new ContaCorrente[5];
		ContaCorrente cc1 = new ContaCorrente(23, 434);
		ContaCorrente cc2 = new ContaCorrente(43, 134);
		ContaCorrente cc3 = new ContaCorrente(53, 234);
		ContaCorrente cc4 = new ContaCorrente(63, 334);
		ContaCorrente cc5 = new ContaCorrente(73, 534);
		
		contas[0]=cc1;
		contas[1]=cc2;
		contas[2]=cc3;
		contas[3]=cc4;
		contas[4]=cc5;
		
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].getAgencia());
		}
		
		ContaCorrente ref = contas[1];
		System.out.println(cc2.getAgencia());
		System.out.println(ref.getAgencia());

	}

}
