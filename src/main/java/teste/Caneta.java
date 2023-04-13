package teste;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		System.out.println("Modelo : "+this.modelo);
		System.out.println("Uma caneta : "+this.cor);
		System.out.println("Ponta : "+this.ponta);
		System.out.println("Carga : "+this.carga);
		System.out.println("Está tampada ? "+this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("nao posso rabiscar");
		}
		else {
			System.out.println("Estou Rabiscando");
		}
	}
	protected void tampar() {
		this.tampada=true;
	}
	protected void destampar() {
		System.out.println("agora a caneta esta destampada");
		this.tampada=false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	
}
 