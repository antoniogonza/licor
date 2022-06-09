package com.example.licor.data;

import android.provider.BaseColumns;

public class Licor {
    public static final String TABLE_NAME ="Licorprueba" ;
    private String id;
    private String nombre;
    private String dificultad;
    private String ingredientes;
    private String preparacion;
    private String tiempo;

    public Licor(String id, String nombre, String dificultad, String ingredientes, String preparacion, String tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
        this.tiempo = tiempo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}

