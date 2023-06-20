package bytebank;

import java.util.ArrayList;
import java.util.List;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Funcionario>funcionarios= new ArrayList<Funcionario>();
		Funcionario funcionario1 = new Funcionario("jair", "123342334", 10500.0);
		Funcionario funcionario2 = new Funcionario("victor", "456353453", 5000.0);
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getCpf());
			System.out.println(funcionario.getSalario());
		}
		
		
	}

}
