
public class SistemaInterno {

	private int senha=123321;
	public void autentica(Gerente gerente) {
		boolean autenticar = gerente.autentica(this.senha);
		if(autenticar) {
			System.out.println("Pode entrar no sistema! ");
		}else {
			System.out.println("Não pode entrar no sistema! ");
		}
	}
	
}
