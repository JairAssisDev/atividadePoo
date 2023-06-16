package bytebank;

public class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;
    
    public void depositar(double saldoQueVaiSerDepositado) {
    	this.saldo+=saldoQueVaiSerDepositado;
    }
    public void sacar(double sacarValor) {
    	this.saldo-=sacarValor;
    	System.out.println("Você tirou: "+ sacarValor);
    	System.out.println("Seu saldo agora é: "+this.saldo);
    }
}
