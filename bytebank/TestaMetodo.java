package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente jair = new Cliente();
		jair.profissao= "programador";
		jair.cpf="231.123.323-32";
		jair.nome="jair";
		
		jair.endereco =new Endereco("1323123", "agua preta", "centro", 2323);

		
		System.out.println(jair.endereco.cep);
		System.out.println(jair.endereco.cidade_estado);
		System.out.println(jair.endereco.numerodaCasa);
		System.out.println(jair.endereco.rua);
		
		Endereco endereco1 =new Endereco("1233123", "palmares", "centro",233);
		
		Cliente rebson = new Cliente();
		rebson.endereco=endereco1;
		rebson.profissao= "programador";
		rebson.cpf="434.342.434-34";
		rebson.nome="rebson";
		
		System.out.println("-------------");
		System.out.println(rebson.endereco.cep);
		System.out.println(rebson.endereco.cidade_estado);
		System.out.println(rebson.endereco.numerodaCasa);
		System.out.println(rebson.endereco.rua);
		
		Conta conta = new Conta();
		conta.agencia= 2323;
		conta.numero=123;
		conta.titular=jair;
		conta.saldo=1000.0;
		
		
		Conta conta2 = new Conta();
		conta2.agencia=2321;
		conta2.numero=232;
		conta2.titular=rebson;
		conta2.saldo=300.0;
		System.out.println("saldo do "+conta2.titular.nome
				+" Saldo : "+conta.saldo+" rua: "+conta2.titular.endereco.cidade_estado);
		conta.depositar(233.70);
		System.out.println("saldo do "+conta.titular.nome
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
