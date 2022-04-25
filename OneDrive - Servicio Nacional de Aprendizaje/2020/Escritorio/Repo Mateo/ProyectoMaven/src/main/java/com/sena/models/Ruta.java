package com.sena.models;

public class Ruta {
    private int id;
    private String origen;
    private String destino;
    private double valorTicket;

    public Ruta() {
    }

    public Ruta(int id, String origen, String destino, double valorTicket) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.valorTicket = valorTicket;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorTicket() {
        return valorTicket;
    }

    public void setValorTicket(double valorTicket) {
        this.valorTicket = valorTicket;
    }
}
