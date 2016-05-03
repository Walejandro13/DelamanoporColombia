package com.andorid.proenandroid.delamanoporcolombia;

/**
 * Created by Usuario on 03/05/2016.
 */
public class Agencia {
    private String nombre;
    private String descrip;
    private double longi,lati;

    public Agencia(){}

    public  Agencia(String na, String des, double la, double lo){

        nombre=na;
        descrip=des;
        longi=lo;
        lati=la;
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
}
