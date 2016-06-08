package com.andorid.proenandroid.delamanoporcolombia;

public class Agencia {
    private String nombre;
    private String descrip;
    private double longi,lati;
    private  int idImage;
    private int telefono;
    private String correo;
    private  String direccion;

    public Agencia(){}

    public  Agencia(String na, String des, String cor, String dir, double la, double lo,  int tel,int img){
        nombre = na;
        descrip = des;
        correo = cor;
        longi = lo;
        lati = la;
        idImage = img;
        telefono = tel;
        direccion = dir;
    }

    public String getNombre(){return nombre;}

    public double getLati() {
        return lati;
    }

    public double getLongi() {
        return longi;
    }

    public String getDescrip() {
            return descrip;
    }

    public int getIdImage() {
        return idImage;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getCorreo() { return  correo; }
}

