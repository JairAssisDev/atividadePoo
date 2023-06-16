package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.agencia= 2323;
		conta.numero=123;
		conta.titular="jair";
		conta.saldo=1000.0;
		
		Conta conta2 = new Conta();
		conta2.agencia=2321;
		conta2.numero=232;
		conta2.titular="paulo";
		conta2.saldo=300.0;
		System.out.println("saldo do "+conta.titular
				+" Saldo : "+conta.saldo);
		conta.depositar(233.70);
		System.out.println("saldo do "+conta.titular
				+" Saldo : "+conta.saldo);
		boolean conseguiuSacar = conta.sacar(200.0);
		System.out.println(conseguiuSacar);
		
		System.out.println(conta2.saldo);
		boolean transfenciaComSucesso=conta.transfere(4000.0, conta2);
		if(transfenciaComSucesso) {
			System.out.println("transferencia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		
		
	}

}
