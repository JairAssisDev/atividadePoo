package com.farmacia;

import java.util.ArrayList;
import java.util.List;

import com.usuarios.Atendente;
import com.usuarios.Gerente;

public class Farmacia {
    private List<Produto> estoque;
    private Atendente atendente;
    private Gerente gerente;

    public Farmacia() {
        this.estoque = new ArrayList<>();
        this.atendente = new Atendente();
        this.gerente = new Gerente();
    }

    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : estoque) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public void imprimirEstoque() {
        System.out.println("====== ESTOQUE ======");
        for (Produto produto : estoque) {
            System.out.println(produto.toString());
        }
        System.out.println("=====================");
    }

    public boolean analisarItemEstoque(Produto produto) {
        return estoque.contains(produto);
    }

    public void adicionarItemEstoque(Produto produto, int quantidade) {
        if (estoque.contains(produto)) {
            int index = estoque.indexOf(produto);
            Produto produtoExistente = estoque.get(index);
            produtoExistente.setQuantidade(produtoExistente.getQuantidade() + quantidade);
            estoque.set(index, produtoExistente);
            System.out.println("Quantidade atualizada no estoque.");
        } else {
            produto.setQuantidade(quantidade);
            estoque.add(produto);
            System.out.println("Produto adicionado ao estoque.");
        }
    }

    public void realizarCompra(Produto produto, int quantidade, Atendente analista) {
        if (analista instanceof Atendente || analista instanceof Gerente) {
            if (estoque.contains(produto)) {
                int index = estoque.indexOf(produto);
                Produto produtoExistente = estoque.get(index);
                if (produtoExistente.getQuantidade() >= quantidade) {
                    produtoExistente.setQuantidade(produtoExistente.getQuantidade() - quantidade);
                    estoque.set(index, produtoExistente);
                    System.out.println("Compra realizada com sucesso.");
                } else {
                    System.out.println("Quantidade insuficiente no estoque.");
                }
            } else {
                System.out.println("Produto não encontrado no estoque.");
            }
        } else {
            System.out.println("Apenas atendentes e gerentes podem realizar compras.");
        }
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public Gerente getGerente() {
        return gerente;
    }
}
