package conta;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida suguro = new SeguroDeVida();
		
		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.Registra(cc);
		calculadorDeImposto.Registra(suguro);
		
		System.out.println(calculadorDeImposto.getTotalImposto());
	}

}
