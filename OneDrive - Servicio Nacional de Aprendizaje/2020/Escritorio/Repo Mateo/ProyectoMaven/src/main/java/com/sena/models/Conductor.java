package com.sena.models;

import java.time.LocalDate;
import java.util.Date;

public class Conductor {

    private int id;
    private String nombreComp;
    private String telefono;
    private String direccion;
    private String fechaCreacion;

    public Conductor(){ };

    public Conductor(int id, String nombreComp, String telefono, String direccion, String fechaCreacion) {
        this.id = id;
        this.nombreComp = nombreComp;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public void setNombreComp(String nombreComp) {
        this.nombreComp = nombreComp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
