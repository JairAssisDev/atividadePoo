
public class TesteSaca {
public static void main(String[] args) {
	Conta conta = new ContaCorrente(123, 1233);
	
	conta.deposita(200.0);
	
	try {
	conta.saca(1900.0);
	}catch (SaldoInsuficienteException ex) {
		System.out.println("Ex: "+ex.getMessage());
	}
	System.out.println(conta.getSaldo());
}
}
