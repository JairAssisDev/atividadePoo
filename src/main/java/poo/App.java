package poo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		gerente.setSalario(500);
		gerente.aumentasalario(1.02);
		System.out.println(gerente.getSalario());
	}

}
