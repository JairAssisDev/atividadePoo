package com.farmacia;

public class Medicamento extends Produto {
    private String principioAtivo;

    public Medicamento(int id, String nome, String descricao, double preco, int quantidade, String principioAtivo) {
        super(id, nome, descricao, preco, quantidade);
        this.principioAtivo = principioAtivo;
    }

    public String getPrincipioAtivo() {
        return principioAtivo;
    }

    public void setPrincipioAtivo(String principioAtivo) {
        this.principioAtivo = principioAtivo;
    }

    @Override
    public String toString() {
        return super.toString() + " Medicamento [principioAtivo=" + principioAtivo + "]";
    }
}
