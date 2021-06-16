package com.company.application;

import com.company.entities.Pessoa;

public class PessoaBuilderApplication {

    //Builder serve para iniciar objetos muito grandes sem perder informação

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Fábio")
                .sobrenome("Machado")
                .idade(29)
                .rua("Rua Teste")
                .numeroCasa(1)
                .bairro("Jardim Taguá")
                .cidade("Estiva-Gerbi")
                .telefone("XX-XXXX-XXXX")
                .criarPessoa();

        System.out.println(pessoa);


    }
}
