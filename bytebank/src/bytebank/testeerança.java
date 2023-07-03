package bytebank;

public class testeerança {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("jair","812383", 6000.89, 123123);
	
	
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getSenha());
		
		boolean aut = gerente.autentica(123123);
		System.out.println(aut);
		System.out.println(gerente.bonificação());
	}

}
