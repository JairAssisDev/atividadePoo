package atividadePoo;

public class TestarAnimal {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 300.0, 3, "meio amarelado cor de caramelo", "Terra",3.0, "plantas e mama");
        Peixe tubarao = new Peixe("Tubarão", 250.0, 0, "branca", "Mar", 6.5, "Barbatanas e cauda");
        
        System.out.println("lista de comfiguraçoes do camelinho");
        camelo.dadosMamifero();

        
        System.out.println("lista de comfiguraçoes do tubarão de recife");
       
        tubarao.dadosPeixe();
    }
}