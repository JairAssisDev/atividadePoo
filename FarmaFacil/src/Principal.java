import com.farmacia.*;
import com.usuarios.*;

public class Principal {
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();

        Produto produto1 = new Produto(1, "Paracetamol", "Analgésico e antitérmico", 10.5, 20);
        Produto produto2 = new Medicamento(2, "Amoxicilina", "Antibiótico", 15.0, 15, "Amoxicilina Tri-hidratada");

        farmacia.adicionarProduto(produto1);
        farmacia.adicionarProduto(produto2);

        Atendente atendente = new Atendente();
        Gerente gerente = new Gerente();

        atendente.analisarItemEstoque(farmacia, produto1);
        atendente.analisarItemEstoque(farmacia, produto2);

        gerente.adicionarItemEstoque(farmacia, produto1, 10);
        gerente.adicionarItemEstoque(farmacia, produto2, 5);

        farmacia.imprimirEstoque();
    }
}
