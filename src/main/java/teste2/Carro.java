package teste2;

public class Carro extends Veiculo {
	private int numerodePorta;
	private boolean farol;
	
	public void farolTeste() {
		if (this.farol == false) {
			System.out.println("nao posso ligar o farol");
		}
		else {
			System.out.println("farol ligado ");
		}
	}
	
	protected void ligarFarol() {
		System.out.println("agora o farol esta ligado");
		this.farol=true;
	}
	protected void desligarFarol() {
		System.out.println("agora o farol esta desligado");
		this.farol=false;
	}
	
	
	public int getNumerodePorta() {
		return numerodePorta;
	}
	public boolean isFarol() {
		return farol;
	}
	public void setFarol(boolean farol) {
		this.farol = farol;
	}
	public void setNumerodePorta(int numerodePorta) {
		this.numerodePorta = numerodePorta;
	}
	public Carro(String fabricante, String marca, String modelo, int ano, String cor, String tipodeCombustivel,
			String tipodeMotor, int velocidade, int numerodePorta, boolean farol) {
		super(fabricante, marca, modelo, ano, cor, tipodeCombustivel, tipodeMotor, velocidade);
		this.numerodePorta = numerodePorta;
		this.farol = farol;
	}

	
	public String status() {
		return super.toString()+ "numerodePorta=" + numerodePorta + ", farol=" + farol   ;
	}

	
	
	
	
	

	
	
}
