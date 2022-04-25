package com.sena.models;

public class Vehiculo {
    private int id;
    private String placa;
    private String modelo;
    private String marca;
    private double valorComercial;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, String modelo, String marca, double valorComercial) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }
}
