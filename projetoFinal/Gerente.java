public class Gerente extends Funcionario implements Autenticavel {
	
	

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
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
