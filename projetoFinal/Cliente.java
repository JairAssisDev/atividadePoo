
public class Cliente implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
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
