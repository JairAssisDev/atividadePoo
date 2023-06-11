package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setAgencia(1233);
		conta1.setNumero(233);
		conta1.setSaldo(2333.8);
		conta1.setTitular("jair");
		
		conta1.mostraConta();
	
	}
}
