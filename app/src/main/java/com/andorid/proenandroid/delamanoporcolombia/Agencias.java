package com.andorid.proenandroid.delamanoporcolombia;

/**
 * Created by Usuario on 03/05/2016.
 */
public class Agencias extends  Agencia {
    private static Agencia[] Medellin =  {new Agencia("Agencia de Viajes Over Comfenalco Antioquia",
            "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",6.2361582,-75.6160376)};

    public static Agencia[] getMedellin() {
        return Medellin;
    }
}
