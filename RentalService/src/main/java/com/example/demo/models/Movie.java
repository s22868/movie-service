package com.example.demo.models;

import java.util.Objects;

public class Movie {

    private Integer id;
    private String nazwa;
    private String kategoria;
    private boolean isAvailable;

    public Movie(Integer id) {
        this.id = id;
    }

    public Movie() {

    }

    public Movie(Integer id, String nazwa, String kategoria, boolean isAvailable) {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.isAvailable = isAvailable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazawa) {
        this.nazwa = nazawa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", nazawa='" + nazwa + '\'' +
                ", kategoria='" + kategoria + '\'' +
                '}';
    }
}
