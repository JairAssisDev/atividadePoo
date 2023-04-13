package teste;

public class Testa {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.setModelo("big");
		c1.setCarga(60);
		c1.setCor("Azul");
		c1.setPonta(10.0f);
		c1.setTampada(true);
		
		c1.status();
		c1.destampar();
		c1.rabiscar();
	}
}
