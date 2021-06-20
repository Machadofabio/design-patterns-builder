package com.company.entities;

public class Computador {
    private String memoria;
    private String placaMae;
    private String hd;
    private String processador;
    private String placaDeVideo;
    private String fonte;
    private String driverCd;

    private Computador(String memoria, String placaMae, String hd, String processador, String placaDeVideo, String fonte, String driverCd) {
        this.memoria = memoria;
        this.placaMae = placaMae;
        this.hd = hd;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.fonte = fonte;
        this.driverCd = driverCd;
    }

    @Override
    public String toString() {
        return "Computador[" +
                "\nmemoria:'" + memoria + '\'' +
                ", \nplacaMae:'" + placaMae + '\'' +
                ", \nhd:'" + hd + '\'' +
                ", \nprocessador:'" + processador + '\'' +
                ", \nplacaDeVideo:'" + placaDeVideo + '\'' +
                ", \nfonte:'" + fonte + '\'' +
                ", \ndriverCd:'" + driverCd + '\'' +
                ']';
    }

    public static class ComputadorBuilder{
        private String memoria;
        private String placaMae;
        private String hd;
        private String processador;
        private String placaDeVideo;
        private String fonte;
        private String driverCd;

        public ComputadorBuilder memoria(String memoria){
            this.memoria = memoria;
            return this;
        }

        public ComputadorBuilder placaMae(String placaMae){
            this.placaMae = placaMae;
            return this;
        }

        public ComputadorBuilder hd(String hd){
            this.hd = hd;
            return this;
        }

        public ComputadorBuilder processador(String processador){
            this.processador = processador;
            return this;
        }

        public ComputadorBuilder placaDeVideo(String placaDeVideo){
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public ComputadorBuilder fonte(String fonte){
            this.fonte = fonte;
            return this;
        }

        public ComputadorBuilder driverCd(String driverCd){
            this.driverCd = driverCd;
            return this;
        }

        public Computador criarComputador(){
            return new Computador(memoria, placaMae, hd, processador, placaDeVideo, fonte, driverCd);
        }
    }


    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public String getDriverCd() {
        return driverCd;
    }

    public void setDriverCd(String driverCd) {
        this.driverCd = driverCd;
    }
}
