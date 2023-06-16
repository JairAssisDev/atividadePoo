package bytebank;

public class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    Cliente titular;
    
    public void depositar(double saldoQueVaiSerDepositado) {
    	this.saldo+=saldoQueVaiSerDepositado;
    }
    public boolean sacar(double sacarValor) {
    	if(this.saldo>=sacarValor) {
    	this.saldo-=sacarValor;
    	System.out.println("Você tirou: "+ sacarValor);
    	System.out.println("Seu saldo agora é: "+this.saldo);
    	return true;
    	}
			return false;
		
    	
    }
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo>=valor) {
    		this.saldo-=valor;
    		destino.depositar(valor);
    		return true;
    	}
    		return false;
    	
    	
    }
}
