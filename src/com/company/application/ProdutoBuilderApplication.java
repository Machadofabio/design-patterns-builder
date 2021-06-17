package com.company.application;

import com.company.entities.Produto;

public class ProdutoBuilderApplication {
    public static void main(String[] args) {

        Produto produto = new Produto.ProdutoBuilder()
                .id(1L)
                .nome("Playstation 4")
                .categoria("Console")
                .quantidade(1)
                .preco(2000.00).criarProduto();

        System.out.println(produto);
    }
}
