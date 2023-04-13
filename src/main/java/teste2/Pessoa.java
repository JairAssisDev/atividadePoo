package teste2;

import java.util.List;

public class Pessoa {
Carro carro;
public String nome;
private List <Carro> carroL;


public Carro getCarro() {
	return carro;
}
public void setCarro(Carro carro) {
	this.carro = carro;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


public List<Carro> getCarroL() {
	return carroL;
}
public void setCarroL(List<Carro> carroL) {
	this.carroL = carroL;
}
public List<Carro> carros() {
	return carroL;
}

public void carros(List<Carro> carro) {
	this.carro = (Carro) carro;
}




}
