package conta;

public class CalculadorDeImposto {
	private double totalImposto;

	public void Registra(Tributavel tributavel) {
		double valor = tributavel.getValorImposto();
		this.totalImposto+=valor;
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}
