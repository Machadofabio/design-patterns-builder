package com.company.application;


import com.company.entities.Casa;

public class CasaBuilderApplicationLombok {
    public static void main(String[] args) {
        Casa casa = Casa.builder()
                .sala("Sala de estar")
                .quarto("Suíte principal")
                .cozinha("Área gourmet")
                .banheiro("Banheiro de hóspedes")
                .garagem("Garagem ampla para 2 carros").build();

        System.out.println(casa);
    }
}
