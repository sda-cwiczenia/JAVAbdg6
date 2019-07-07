package com.sda.example1.model;

public class Auto {
    private String name;
    private String mocSilnika;

    public Auto(String name, String mocSilnika) {
        this.name = name;
        this.mocSilnika = mocSilnika;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", mocSilnika='" + mocSilnika + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMocSilnika() {
        return mocSilnika;
    }

    public void setMocSilnika(String mocSilnika) {
        this.mocSilnika = mocSilnika;
    }
}
