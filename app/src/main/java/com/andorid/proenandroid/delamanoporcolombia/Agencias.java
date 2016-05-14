package com.andorid.proenandroid.delamanoporcolombia;

/**
 * Created by Alejandrov on 03/05/2016.
 */
public class Agencias extends  Agencia {

    private static Agencia[] Medellin =  {
            new Agencia("Agencia de Viajes Over Comfenalco Antioquia",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    6.2361582,-75.6160376),
            new Agencia("Agencia de Viajes  de Pueblo en Pueblo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    6.2508653,-75.5703947),
            new Agencia("Agencia de Viajes Casa de Colombia Medellín LTDA",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    6.2018143,-75.5750857),
            new Agencia("Agencia de Viajes LandVenture Travel",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    6.1930033,-75.5811657),
            new Agencia("Agencia de Viajes Empaque y Vámonos",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    12.5406168,-81.774295),
            new Agencia("Agencia de Viajes Turismo de Naturaleza",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    6.2188383,-75.5889857),
            new Agencia("Agencia de Viajes Univiajes",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    6.2400523,-75.5882667),
            new Agencia("Agencia de Viajes Turicol - Turismo Receptivo de Colombia Ltda",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    6.2400523,-75.5882667),};


    public static Agencia[] getMedellin() {
        return Medellin;
    }
}
