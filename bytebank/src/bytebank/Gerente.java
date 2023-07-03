package bytebank;

public class Gerente extends Funcionario {


	private int senha;
	

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}



	public boolean autentica(int senha) {
		if(this.senha==senha) {		
			return true;
		}else {
			return false;
		}
		}

	public double bonificação() {
		return super.getBonificacao()+super.getSalario()+1000;
	
	}
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
}
