package com.company.entities;

public class Produto {
    private long id;
    private String nome;
    private int quantidade;
    private double preco;
    private String categoria;

    private Produto(long id, String nome, int quantidade, double preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto[" +
                "\nid=" + id +
                ", \nnome='" + nome + '\'' +
                ", \nquantidade=" + quantidade +
                ", \npreco=" + preco +
                ", \ncategoria='" + categoria + '\'' +
                ']';
    }

    public static class ProdutoBuilder{
        private long id;
        private String nome;
        private int quantidade;
        private double preco;
        private String categoria;

        public ProdutoBuilder(){

        }

        public ProdutoBuilder id(long id){
            this.id = id;
            return this;
        }

        public ProdutoBuilder nome(String nome){
            this.nome = nome;
            return this;
        }

        public ProdutoBuilder quantidade(int quantidade){
            this.quantidade = quantidade;
            return this;
        }

        public ProdutoBuilder preco(double preco){
            this.preco = preco;
            return this;
        }

        public ProdutoBuilder categoria(String categoria){
            this.categoria = categoria;
            return this;
        }

        public Produto criarProduto(){
            return new Produto(id, nome, quantidade, preco, categoria);
        }

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
