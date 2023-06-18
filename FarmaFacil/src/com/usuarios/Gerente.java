package com.usuarios;

import com.farmacia.Produto;
import com.farmacia.Farmacia;

public class Gerente extends Atendente {
    public void adicionarItemEstoque(Farmacia farmacia, Produto produto, int quantidade) {
        Produto produtoNoEstoque = farmacia.buscarProdutoPorId(produto.getId());
        if (produtoNoEstoque != null) {
            produtoNoEstoque.setQuantidade(produtoNoEstoque.getQuantidade() + quantidade);
            System.out.println("Item adicionado ao estoque com sucesso.");
        } else {
            System.out.println("Item não encontrado no estoque.");
        }
    }
}
