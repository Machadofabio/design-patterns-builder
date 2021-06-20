package com.company.entities;

import lombok.Builder;

@Builder
public class Casa {
    private String quarto;
    private String cozinha;
    private String sala;
    private String banheiro;
    private String garagem;

    public Casa() {
    }

    public Casa(String quarto, String cozinha, String sala, String banheiro, String garagem) {
        this.quarto = quarto;
        this.cozinha = cozinha;
        this.sala = sala;
        this.banheiro = banheiro;
        this.garagem = garagem;
    }

    @Override
    public String toString() {
        return "Casa[" +
                "\nquarto='" + quarto + '\'' +
                ", \ncozinha='" + cozinha + '\'' +
                ", \nsala='" + sala + '\'' +
                ", \nbanheiro='" + banheiro + '\'' +
                ", \ngaragem='" + garagem + '\'' +
                ']';
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getCozinha() {
        return cozinha;
    }

    public void setCozinha(String cozinha) {
        this.cozinha = cozinha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(String banheiro) {
        this.banheiro = banheiro;
    }

    public String getGaragem() {
        return garagem;
    }

    public void setGaragem(String garagem) {
        this.garagem = garagem;
    }
}
