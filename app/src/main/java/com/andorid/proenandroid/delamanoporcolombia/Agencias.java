package com.andorid.proenandroid.delamanoporcolombia;


public class Agencias extends  Agencia {

    //todo agencia empaque y vamonos le flata la direccion
    //todo agencia turicol no se encuentra informacion buscar luego

    private static Agencia[] Medellin =  {
            new Agencia("Agencia de Viajes  de Pueblo en Pueblo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingon" +
                    "salen a un pueblo diferente de la región. ",
                    "viajesdepuebloenpueblo.com","Cra. 51 #5147,Medellín, Antioquia",
                    6.2361582,-75.6160376,3137225,1),
            new Agencia( "Agencia de Viajes Over Comfenalco Antioquia",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "www.comfenalco.travel","Cra. 50 #53-43,Medellín, Antioquia",
                    6.2508653,-75.5703947,4447110,2),
            new Agencia("Agencia de Viajes Casa de Colombia Medellín LTDA",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "casadecolombia.travel","Carrera 43A 6 Sur 15 Centro Comercial Oviedo, Local 106",+
                    6.2018143,-75.5750857,4442611,3),
            new Agencia("Agencia de Viajes LandVenture Travel",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "landventuretravel.com","# 43A,Cl. 12 Sur #25255,Medellín, Antioquia",
                    6.1930033,-75.5811657,3219555,4),
            new Agencia("Agencia de Viajes Empaque y Vámonos",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "www.empaqueyvamonos.com","reservas@empaqueyvamonos.com",
                    12.5406168,-81.774295,3200550,5),
            new Agencia("Agencia de Viajes Turismo de Naturaleza",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "turismodenaturaleza.co","Carrera 65 a 13 157 Local 63 A Piso 2,Medellín, Antioquia",
                    6.2188383,-75.5889857,3631655,6),
            new Agencia("Agencia de Viajes Univiajes",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "univiajes.travel","Cra. 65d #34-15,Medellín, Antioquia",
                    6.2400523,-75.5882667,4484827,7),
            new Agencia("Agencia de Viajes Turicol - Turismo Receptivo de Colombia Ltda",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "","",
                    6.2400523,-75.5882667,8,8),
            new Agencia( "Agencia de Viajes vuelo Secreto",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                        " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                    "con efectividad y calidad.",
                    "vuelo-secreto.com","calle 55,Carrera 49 # 55-73,Medellín, La Candelaria",
                    6.2444401,-75.6160376,5110777,9)
    };

    private static Agencia[] Bogota =  {
            new Agencia("Agencia de Viajes 360 Travelers",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "360travelers.com","54 - 73 Oficina 602,Cl. 106,Bogotá, Cundinamarca",
                    4.6438022,-74.1631721,7461626,1),
            new Agencia("Agencia de Viajes Aero Vacaciones Ltda",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "aerovacacionesltda.com","66 Local 210,Suba 55 #93 A,Bogotá",
                    4.6623496,-74.1341254,6231222,2),
            new Agencia("Agencia de Viajes Aviatur Centro Andino",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "aviatur.com","Carrera 11 # 82-01,Piso 4,Bogotá, Cundinamarca",
                    4.6555912,-74.2053178,5876500,3),
            new Agencia("Agencia de Viajes Aero Viajes Pacífico",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "aeroviajespacifico.com","Carrera 68C # 61,Local 1-09,Bogotá, Engativá",
                    4.6626884,-74.1341255,7426777,4),
            new Agencia("Agencia de Viajes Agencia de Viajes Colsubsidio",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "colsubsidio.com","Esquina Calle 26,Cra. 27,Bogotá",
                    4.6628577,-74.1341256, 2870700,5),
            new Agencia("Agencia de Viajes PREMIER LTDA",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "viajespremier.travel","Nº 6A,Cl. 114 #3092,Bogotá",
                    4.6630271,-74.1341256,6296222,6),
            new Agencia("Agencia de Viajes Los Nómadas",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "","",
                    4.6631964,-74.1341257,7,7),
            new Agencia("Agencia de Viajes TURISMAURO",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "www.turismauro.com","1 De Mayo #35D-46,Bogotá",
                    4.6633658,-74.1341257,4940101,8),
            new Agencia( "Agencia de Viajes Puntos Cardinales",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "www.pcardinales.com.ar","Carrera 10 # 27-51, Interior 166,Bogotá, Cundinamarca",
                    4.6635352,-74.1341258,5999912,9)
    };

    private static Agencia[] Cartagena =  {
            new Agencia("Agencia de Viajes Contactos",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "contactos.com.co","Edificio Torremolinos,San Martín #2-30,Cartagena, Bolívar",
                    10.413617,-75.5517161,6551130,1),
            new Agencia("Agencia de Viajes OPITOURS - Agencia Operadora de Turismo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "opitours.com","Edificio Real Cl. 47 # 2 -120A,,Cartagena, Cartagena De Indias (Distrito Turístico Y Cultural), Bolívar",
                    10.4134519,-75.5517161,6665957,2),
            new Agencia("Agencia de Viajes CIRCULO DE VIAJES UNIVERSAL",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "cvu.com.co","Av. El Poblado #15Sur-19,Medellín, Antioquia",
                    10.413782,-75.5517162,3258787,3),
            new Agencia("Agencia de Viajes Gema Tours",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "gematours.com","Santander #41-202,Cartagena, Bolívar",
                    10.413947,-75.5517162,6535800,4),
            new Agencia("Agencia de Viajes DEPRISA",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "avianca.com","Local 1-18, Piso 1, C.C Multicentro La Plazuela,Cl. 31 #71-130,Cartagena, Bolívar",
                    10.4141121,-75.5517163,6533430,5),
            new Agencia("Agencia de Viajes Mirasol",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "mirasoltravel.com","Cra. 2 #4-132,Cartagena, Bolívar",
                    10.4142771,-75.5517163,6652530,6),
            new Agencia("Agencia Panamericana de Viajes",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "panamericanadeviajes.net","13,San Martín #8,Cartagena, Bolívar",
                    10.4144421,-75.5517163,6550002,7),
            new Agencia("Agencia de Viajes Travel fusion Colombia",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "travelfusioncolombia.com","37 ofi 201,Portobello #23,Cartagena, Bolívar",
                    10.4147722,-75.5517164,6604408,8),
            new Agencia( "Agencia de Viajes Mundial Tours ",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "mundial-tours.com","129,Cra. 3 #8,Cartagena, Bolívar",
                    10.4149372,-75.5517164,6551230,9)
    };

    private static Agencia[] Cali =  {
            new Agencia("Agencia Hatoris Viajes",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "","",
                    3.4261047,-76.5583517,1,1),
            new Agencia("Agencia de viajes Crucero turismo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "","",
                    3.4262748,-76.5583517,2,2),
            new Agencia("Agencia de Viajes City tours",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "","",
                    3.4262748,-76.5583517,3,3),
            new Agencia("Agencia Artours Viajes",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "","",
                    3.426615,-76.5583518,4,4),
            new Agencia("Agencia de Viajes Pichinde",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "","",
                    3.433484,-76.6516996,6,5),
            new Agencia("Agencia de Viajes Ecolombia Tours",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "","",
                    3.426615,-76.5583518,5,6),
            new Agencia("Agencia de Viajes Je tours",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "","",
                    3.426615,-76.5583518,2,7),
            new Agencia("Agencia de Viajes StarTours Cali",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "","",
                    3.426615,-76.5583518,3,8),
            new Agencia( "Agencia de Viajes Panturismo Cali ",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "","",
                    3.426615,-76.5583518,1,9)
    };

    private static Agencia[] SantaMarta =  {
            new Agencia("Agencia de Viajes Chayrama",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "","",
                    11.1919311,-74.2811875,1,1),
            new Agencia("Agencia de Viajes Alestur Ltda",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "","",
                    11.1922517,-74.2811876,2,2),
            new Agencia("Agencia de Viajes COMFORT Travel",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "","",
                    11.1925722,-74.2811878,3,3),
            new Agencia("Agencia de Viajes Las Pleyades",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "","",
                    11.1928927,-74.2811879,4,4),
            new Agencia("Agencia de Viajes over Alestur expertos en viajes",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "","",
                    11.1945603,-74.2808447,5,5),
            new Agencia("Turismerk Agencia de Turismo",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "","",
                    11.1922517,-74.2662342,6,6),
            new Agencia("Agencia de Viajes TAYKU",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "","",
                    11.1925722,-74.2662344,7,7),
            new Agencia("Agencia de Viajes Turcol - Turismo Colombiano",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "","",
                    11.1928927,-74.2662346,8,8),
            new Agencia( "Agencia de Viajes expedición tayrona ",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "","",
                    11.1932132,-74.2662348,9,9)
    };

    private static Agencia[] Manizales =  {
            new Agencia("Agencia de Viajes Agentur",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "","",
                    5.049284,-75.5324026,1,1),
            new Agencia("Agencia de Viajes DESTINOS Y RUTAS DE COLOMBIA",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "","",
                    5.0494531,-75.5324027,2,2),
            new Agencia("Agencia de Viajes Ecosistemas Viajes y turismo ",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "","",
                    5.0496222,-75.5324027,4,3),
            new Agencia("Agencia de Viajes Arma tu viaje",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "","",
                    5.0497913,-75.5324028,3,4),
            new Agencia("Agencia de Viajes Circulo de Viajes",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "","",
                    5.0499605,-75.5324028,5,5),
            new Agencia("Agencia de Viajes COMFAMILIARES",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "","",
                    5.0501296,-75.5324028,6,6),
            new Agencia("Agencia de Viajes Norte y Sur Travel",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "","",
                    5.0504678,-75.5324029,7,7),
            new Agencia("Agencia de Viajes  Turismo Claudia Ramirez",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "","",
                    5.0508061,-75.532403,8,8),
            new Agencia( "Agencia de Viajes Avianca Manizales",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "","",
                    5.0509752,-75.5324031,9,9)
    };

    public static Agencia[] getMedellin() {
        return Medellin;
    }

    public static Agencia[] getBogota(){
        return Bogota;
    }

    public static Agencia[] getCartagena(){
        return Cartagena;
    }

    public static Agencia[] getCali(){
        return Cali;
    }

    public static Agencia[] getSantaMarta(){
        return SantaMarta;
    }

    public static Agencia[] getManizales(){
        return Manizales;
    }
}
