package com.cecati6.jussef.drawernavigation.DataModels;

public class ShopDataModel {

    private String titulo;
    private int imagen;


    public String getTitulo() {
        return titulo;
    }

    public ShopDataModel(String titulo, int imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
