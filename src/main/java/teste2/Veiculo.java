package teste2;

public class Veiculo {
	private String fabricante;
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String tipodeCombustivel;
	private String tipodeMotor;
	private int velocidade;
	
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipodeCombustivel() {
		return tipodeCombustivel;
	}
	public void setTipodeCombustivel(String tipodeCombustivel) {
		this.tipodeCombustivel = tipodeCombustivel;
	}
	public String getTipodeMotor() {
		return tipodeMotor;
	}
	public void setTipodeMotor(String tipodeMotor) {
		this.tipodeMotor = tipodeMotor;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public void freiar() {
		this.getVelocidade();
		System.out.println(velocidade-20);
		}
	
	public Veiculo(String fabricante, String marca, String modelo, int ano, String cor, String tipodeCombustivel,
			String tipodeMotor, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.tipodeCombustivel = tipodeCombustivel;
		this.tipodeMotor = tipodeMotor;
		this.velocidade = velocidade;
	}
	@Override
	public String toString() {
		return "fabricante=" + fabricante + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano
				+ ", cor=" + cor + ", tipodeCombustivel=" + tipodeCombustivel + ", tipodeMotor=" + tipodeMotor
				+ ", velocidade=" + velocidade ;
	}
	
	
	

	

	
}
