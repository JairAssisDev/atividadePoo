package bytebank;

public class Endereco {
	private String cep;
	private String cidade_estado;
	private String rua;
	private int numerodaCasa;
	
	
	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade_estado() {
		return cidade_estado;
	}


	public void setCidade_estado(String cidade_estado) {
		this.cidade_estado = cidade_estado;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public int getNumerodaCasa() {
		return numerodaCasa;
	}


	public void setNumerodaCasa(int numerodaCasa) {
		this.numerodaCasa = numerodaCasa;
	}


	public Endereco(String cep, String cidade_estado, String rua, int numerodaCasa) {
		super();
		this.cep = cep;
		this.cidade_estado = cidade_estado;
		this.rua = rua;
		this.numerodaCasa = numerodaCasa;
	}


	
	
}
