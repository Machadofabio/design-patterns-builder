package com.company.entities;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String rua;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private String telefone;

    private Pessoa(String nome, String sobrenome, int idade, String rua, int numeroCasa, String bairro, String cidade, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa[" +
                "\nnome='" + nome + '\'' +
                ", \nsobrenome='" + sobrenome + '\'' +
                ", \nidade=" + idade +
                ", \nrua='" + rua + '\'' +
                ", \nnumeroCasa=" + numeroCasa +
                ", \nbairro='" + bairro + '\'' +
                ", \ncidade='" + cidade + '\'' +
                ", \ntelefone='" + telefone + '\'' +
                ']';
    }

    public static class PessoaBuilder{
        private String nome;
        private String sobrenome;
        private int idade;
        private String rua;
        private int numeroCasa;
        private String bairro;
        private String cidade;
        private String telefone;

        public PessoaBuilder() {
        }

        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public PessoaBuilder sobrenome(String sobrenome){
            this.sobrenome = sobrenome;
            return this;
        }
        public PessoaBuilder idade(int idade){
            this.idade = idade;
            return this;
        }
        public PessoaBuilder rua(String rua){
            this.rua = rua;
            return this;
        }
        public PessoaBuilder numeroCasa(int numeroCasa){
            this.numeroCasa = numeroCasa;
            return this;
        }
        public PessoaBuilder bairro(String bairro){
            this.bairro = bairro;
            return this;
        }
        public PessoaBuilder cidade(String cidade){
            this.cidade = cidade;
            return this;
        }
        public PessoaBuilder telefone(String telefone){
            this.telefone = telefone;
            return this;
        }

        public Pessoa criarPessoa(){
            return new Pessoa(nome, sobrenome, idade, rua, numeroCasa, bairro, cidade, telefone);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
