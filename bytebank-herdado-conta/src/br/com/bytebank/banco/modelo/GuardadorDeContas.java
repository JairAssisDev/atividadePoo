package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaolive ;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaolive = 0;
	}
	
	public void adicionar(Conta ref) {
		this.referencias[this.posicaolive]=ref;
		this.posicaolive++;
	}

	public int getQuantidadeDeElementos() {
		
		return this.posicaolive;
	}

	public Conta getReferencia(int pos) {
		
		return this.referencias[pos];
	}
}
