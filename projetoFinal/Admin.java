
public class Admin extends Funcionario implements Autenticavel {

	

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

private AutenticacaoUtil autenticador;
	
	public Admin() {
		 this.autenticador =new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return this.autenticador.autentica(senha);
		
	}
	
	
}
