package com.company.application;

import com.company.entities.Cliente;

import java.util.Scanner;

public class ClienteBuilderApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("\nDigite o cpf: ");
        String cpfCliente = input.nextLine();

        System.out.print("\nDigite o telefone: ");
        String telefoneCliente = input.nextLine();

        System.out.print("\nDigite a idade: ");
        int idadeCliente = input.nextInt();

        Cliente cliente = new Cliente.ClienteBuilder()
                .nome(nomeCliente)
                .cpf(cpfCliente)
                .telefone(telefoneCliente)
                .idade(idadeCliente)
                .criarCliente();

        System.out.println(cliente);

        input.close();
    }
}
