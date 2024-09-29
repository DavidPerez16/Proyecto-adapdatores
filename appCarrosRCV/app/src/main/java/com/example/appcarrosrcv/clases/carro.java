package com.example.appcarrosrcv.clases;

import java.io.Serializable;

public class carro implements Serializable {
    String imagen;
    String nombre;
    String modelo;
    String precio;

    public carro(String imagen, String precio, String nombre, String modelo) {
        this.imagen = imagen;
        this.precio = precio;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
