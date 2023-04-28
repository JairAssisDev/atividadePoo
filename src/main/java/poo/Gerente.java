package poo;

public class Gerente extends Funcionario {

	@Override
	public void aumentasalario(double aumento) {
		// TODO Auto-generated method stub
		setSalario(getSalario()*aumento);
		
	}

}
