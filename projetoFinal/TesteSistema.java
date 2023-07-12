
public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setSenha(123321);
		
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		
		sistemaInterno.autentica(gerente);
		
		
		
	}
}
