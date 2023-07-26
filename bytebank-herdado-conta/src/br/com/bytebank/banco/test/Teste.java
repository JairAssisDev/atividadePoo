package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(323, 3450);
		
		guardadorDeContas.adicionar(cc1);
		
		Conta cc2 = new ContaCorrente(2312, 23432);
		
		guardadorDeContas.adicionar(cc2);
		
		int tamanho = guardadorDeContas.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardadorDeContas.getReferencia(0);
		
		System.out.println(ref);
		System.out.println(ref.getAgencia());
		
		
	}

}
