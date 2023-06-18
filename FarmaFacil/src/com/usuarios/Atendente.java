package com.usuarios;

import com.farmacia.Produto;
import com.farmacia.Farmacia;

public class Atendente {
    public void analisarItemEstoque(Farmacia farmacia, Produto produto) {
        if (farmacia.analisarItemEstoque(produto)) {
            System.out.println("O item está disponível no estoque.");
        } else {
            System.out.println("O item não está disponível no estoque.");
        }
    }
}
