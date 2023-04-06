package atividadePoo;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristica) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public void dadosPeixe() {
    	System.out.println("nome "+getNome());
    	System.out.println("Comprimento "+getComprimento()+"cm");
    	System.out.println("patas"+getPatas());
    	System.out.println("cor "+getCor());
    	System.out.println("Ambiente "+getAmbiente());
    	System.out.println("velocidade "+getVelocidade()+"m/s");
    	System.out.println("caracteristica "+getCaracteristica());
    	System.out.println(":)");
    }
}

