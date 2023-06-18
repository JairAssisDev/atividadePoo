package bytebank;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		
		if (agencia<=0) {
			System.out.println("entrada invalida");
			return;
		}else {
		this.agencia = agencia;
		}
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero<=0) {
			System.out.println("entrada invalida");
			return;
		}else {
		this.numero = numero;
		}
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
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
	public Conta(double saldo, int agencia, int numero, Cliente titular) {
		super();
		Conta.total++;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
    public static int Total() {
    	return Conta.total;
    }
}
