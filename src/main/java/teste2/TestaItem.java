package teste2;

import java.util.List;
import java.util.ArrayList;

public class TestaItem {
	public static void main(String[] args) {
	  Pessoa p1 =new Pessoa();
	  p1.setNome("jair");
	  Carro c1 =new Carro(null, null, null, 0, null, null, null, 100, 4, false);
	  Carro c2 =new Carro(null, null, null, 0, null, null, null, 0, 0, false);
	  Carro c3 =new Carro(null, null, null, 0, null, null, null, 0, 0, false);

	  c1.freiar();
	  List<Carro> lista = new ArrayList<Carro>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
	  p1.setCarroL(lista);
	  
     for (Carro carro : p1.getCarroL()) {
		System.out.println(carro.status());
	}
}
} 
