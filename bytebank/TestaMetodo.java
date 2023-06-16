package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.agencia= 2323;
		conta.numero=123;
		conta.titular="jair";
		conta.saldo=1000;
		
		System.out.println("saldo do "+conta.titular
				+" Saldo : "+conta.saldo);
		conta.depositar(233.70);
		System.out.println("saldo do "+conta.titular
				+" Saldo : "+conta.saldo);
		conta.sacar(200.0);
	}

}
