package com.company.application;

import com.company.entities.Computador;

public class ComputadorBuilderApplication {
    public static void main(String[] args) {
        Computador computador = new Computador.ComputadorBuilder()
                .placaMae("Placa Mae GALAX H410M")
                .hd("SSD Adata SU630 240GB")
                .placaDeVideo("Placa de Video ASUS Phoenix GeForce GTX 1650")
                .memoria("Memoria DDR4 OLOy Owl Black 8GB")
                .fonte("Fonte Gamemax GP650 650W")
                .processador("Processador Intel Core i3 10100F 3.60GHz")
                .driverCd("None")
                .criarComputador();

        System.out.println(computador);

    }
}
