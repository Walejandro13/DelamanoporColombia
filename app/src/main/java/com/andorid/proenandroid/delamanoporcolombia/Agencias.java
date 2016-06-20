package com.andorid.proenandroid.delamanoporcolombia;


public class Agencias extends  Agencia {


    private static Agencia[] Medellin =  {
            new Agencia("Agencia de Viajes  de Pueblo en Pueblo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia." +
                            " También somos comercializadores de múltiples opciones de viajes como excursiones terrestres a la costa Colombiana," +
                            " el eje cafetero, Capurganá, San Andrés islas, alojamientos en el Caribe Colombiano, " +
                            "hosterías y hoteles en Antioquia y planes internacionales a Cuba, Panamá, Crucero por el caribe," +
                            " Perú y las hermosas playas de Cancún en México.",
                    "viajesdepuebloenpueblo.com","Cra. 51 #5147,Medellín, Antioquia",
                    6.2361582,-75.6160376,3137225,R.drawable.pueblo),
            new Agencia( "Agencia de Viajes Over Comfenalco Antioquia",
                    "En la Agencia de Viajes de COMFENALCO Antioquia estamos comprometidos con la satisfacción de las necesidades y expectativas de nuestros usuarios. \n" +
                          "Contamos con un equipo humano que se caracteriza por ofrecer asesoría y atención personalizada, " +
                            "escuchando activamente la voz de nuestros clientes como base fundamental para el mejoramiento continuo.  " +
                            "Las facilidades de pago, el amplio portafolio de servicios turísticos y el respaldo de la organización, " +
                            "son nuestras ventajas competitivas. ",
                    "www.comfenalco.travel","Cra. 50 #53-43,Medellín, Antioquia",
                    6.2508653,-75.5703947,4447110,R.drawable.confenalco),
            new Agencia("Agencia de Viajes Casa de Colombia Medellín LTDA",
                    "Mision: En CASA DE COLOMBIA nos dedicamos a la planeación y venta de servicios turísticos de descanso y negocios. " +
                            "Ofrecemos asesoría calificada que facilita la prestación del servicio.",
                    "casadecolombia.travel","Carrera 43A 6 Sur 15 Centro Comercial Oviedo, Local 106",+
                    6.2018140,-75.5750850,4442611,R.drawable.casa),
            new Agencia("Agencia de Viajes LandVenture Travel",
                    "Mision: LandVenture viaje fue fundada en 2010 con el propósito de mostrar a nuestros visitantes reales de belleza de Colombia. " +
                            "Nos centramos en los destinos que reflejan nuestra tradiciones, la cultura, la naturaleza y el paisaje más atractivo. " +
                            "Aunque también cubrimos los destinos más populares, nos encanta viajar fuera de los lugares alejado de todo, " +
                            "apoyar a los pequeños productores y ofrecemos tours exclusivos",
                    "landventuretravel.com","# 43A,Cl. 12 Sur #25255,Medellín, Antioquia",
                    6.1930030,-75.5811650,3219555,R.drawable.land),
            new Agencia("Agencia de Viajes Empaque y Vámonos",
                    "En la agencia de viajes Empaque & vámonos nos comprometemos con nuestros clientes a ofrecer una confiabilidad en el servicio, " +
                            "un personal competente y una adecuada atención en la prestación del servicio, para ello contamos con productos " +
                            "y servicios de calidad, garantizando la satisfacción de nuestros clientes y el mejoramiento continuo de todos nuestros procesos.",
                    "www.empaqueyvamonos.com","reservas@empaqueyvamonos.com",
                    12.5406168,-81.774295,3200550,R.drawable.empaque),
            new Agencia("Agencia de Viajes Turismo de Naturaleza",
                    "Mision: Somos la manera más sencilla y fácil de buscar, recopilar, comparar, validar y " +
                            "comprar experiencias de naturaleza en Colombia." +
                          "Nos especializamos la difusión, promoción y comercialización de experiencias de ecoturismo," +
                            " turismo de aventura y agroturismo.",
                    "turismodenaturaleza.co","Carrera 65 a 13 157 Local 63 A Piso 2,Medellín, Antioquia",
                    6.2188383,-75.5889857,3631655,R.drawable.naturaleza),
            new Agencia("Agencia de Viajes Univiajes",
                    "Ser facilitadores de nuestros clientes, brindando un servicio personalizado con información confiable y oportuna; " +
                            "actuando como asesores tratamos de interpretar y satisfacer sus necesidades. " +
                            "Ofrecemos asesoría para el control de sus volúmenes de compras orientada a las aerolíneas que nos ofrezcan la mejor opción.",
                    "univiajes.travel","Cra. 65d #34-15,Medellín, Antioquia",
                    6.2400523,-75.5882667,4484827,R.drawable.univiajes),
            new Agencia("Sol y Mar AGENCIA DE VIAJES",
                    "Mision: Somos una empresa de turismo sólida y responsable, con capacidad de satisfacer las necesidades de nuestros clientes de acuerdo " +
                            "a sus necesidades y presupuesto. Operamos con base en el cumplimiento y la calidad humana de nuestra gente.",
                   "ventassolymar.es.tl","Of 903,Oriental #52-36,Medellín, Antioquia",
                    6.2400523,-75.5882667,5112824,R.drawable.sol),
            new Agencia( "Agencia de Viajes vuelo Secreto",
                    "Mision: Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales, " +
                            "satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, con efectividad y calidad.",
                    "vuelo-secreto.com","calle 55,Carrera 49 # 55-73,Medellín, La Candelaria",
                    6.2444401,-75.6160376,5110777,R.drawable.vuelo)
    };

    private static Agencia[] Bogota =  {
            new Agencia("Agencia de Viajes 360 Travelers",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "360travelers.com","54 - 73 Oficina 602,Cl. 106,Bogotá, Cundinamarca",
                    4.6438022,-74.1631721,7461626,R.drawable.trecientossesenta),
            new Agencia("Agencia de Viajes Aero Vacaciones Ltda",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "aerovacacionesltda.com","66 Local 210,Suba 55 #93 A,Bogotá",
                    4.6623496,-74.1341254,6231222,R.drawable.aero),
            new Agencia("Agencia de Viajes Aviatur Centro Andino",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "aviatur.com","Carrera 11 # 82-01,Piso 4,Bogotá, Cundinamarca",
                    4.6555912,-74.2053178,5876500,R.drawable.aviatur),
            new Agencia("Agencia de Viajes Aero Viajes Pacífico",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "aeroviajespacifico.com","Carrera 68C # 61,Local 1-09,Bogotá, Engativá",
                    4.6626884,-74.1341255,7426777,R.drawable.aeroviajes),
            new Agencia("Agencia de Viajes Agencia de Viajes Colsubsidio",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "colsubsidio.com","Esquina Calle 26,Cra. 27,Bogotá",
                    4.6628577,-74.1341256, 2870700,R.drawable.colsubsidio),
            new Agencia("Agencia de Viajes PREMIER LTDA",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "viajespremier.travel","Nº 6A,Cl. 114 #3092,Bogotá",
                    4.6630271,-74.1341256,6296222,R.drawable.premier),
            new Agencia("Agencia de Viajes Los Nómadas",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "","",
                    4.6631964,-74.1341257,7,R.drawable.nomadas),
            new Agencia("Agencia de Viajes TURISMAURO",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "www.turismauro.com","1 De Mayo #35D-46,Bogotá",
                    4.6633658,-74.1341257,4940101,R.drawable.turismauro),
            new Agencia( "Agencia de Viajes Puntos Cardinales",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "www.pcardinales.com.ar","Carrera 10 # 27-51, Interior 166,Bogotá, Cundinamarca",
                    4.6635352,-74.1341258,5999912,R.drawable.cardenales)
    };

    private static Agencia[] Cartagena =  {
            new Agencia("Agencia de Viajes Contactos",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "contactos.com.co","Edificio Torremolinos,San Martín #2-30,Cartagena, Bolívar",
                    10.413617,-75.5517161,6551130,R.drawable.contactanos),
            new Agencia("Agencia de Viajes OPITOURS - Agencia Operadora de Turismo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "opitours.com","Edificio Real Cl. 47 # 2 -120A,,Cartagena, Cartagena De Indias (Distrito Turístico Y Cultural), Bolívar",
                    10.4134519,-75.5517161,6665957,R.drawable.opiturs),
            new Agencia("Agencia de Viajes CIRCULO DE VIAJES UNIVERSAL",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "cvu.com.co","Av. El Poblado #15Sur-19,Medellín, Antioquia",
                    10.413782,-75.5517162,3258787,R.drawable.univiajes),
            new Agencia("Agencia de Viajes Gema Tours",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "gematours.com","Santander #41-202,Cartagena, Bolívar",
                    10.413947,-75.5517162,6535800,R.drawable.gematours),
            new Agencia("Agencia de Viajes DEPRISA",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "avianca.com","Local 1-18, Piso 1, C.C Multicentro La Plazuela,Cl. 31 #71-130,Cartagena, Bolívar",
                    10.4141121,-75.5517163,6533430,R.drawable.deprisa),
            new Agencia("Agencia de Viajes Mirasol",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "mirasoltravel.com","Cra. 2 #4-132,Cartagena, Bolívar",
                    10.4142771,-75.5517163,6652530,R.drawable.marisol),
            new Agencia("Agencia Panamericana de Viajes",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "panamericanadeviajes.net","13,San Martín #8,Cartagena, Bolívar",
                    10.4144421,-75.5517163,6550002,R.drawable.panamericana),
            new Agencia("Agencia de Viajes Travel fusion Colombia",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "travelfusioncolombia.com","37 ofi 201,Portobello #23,Cartagena, Bolívar",
                    10.4147722,-75.5517164,6604408,R.drawable.travelfusion),
            new Agencia( "Agencia de Viajes Mundial Tours ",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "mundial-tours.com","129,Cra. 3 #8,Cartagena, Bolívar",
                    10.4149372,-75.5517164,6551230,R.drawable.mundial)
    };

    private static Agencia[] Cali =  {
            new Agencia("Agencia Hatoris Viajes",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "hoturisviajes.com.co","Avenida 5 No 21-21,Cali, Versalles",
                    3.4256964,-76.623683, 6678383,R.drawable.hoturis),
            new Agencia("Agencia de viajes Crucero turismo",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "cruceroturismo.net","Cl. 23 #626,Cali, Valle del Cauca",
                    3.440662,-76.556079,4850932,R.drawable.crucero),
            new Agencia("Agencia de Viajes City tours",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "citytoursviajes.com", "Paso Ancho #65B-26,Cali, Valle del Cauca",
                    3.3991921,-76.5399208,5551055,R.drawable.citytours),
            new Agencia("Agencia Artours Viajes",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "artoursviajes.com","Centro Comercial Colón Plaza,Cra. 1 Bis #61A-30,Cali, Valle del Cauca",
                    3.4806165,-76.5009318,4851789,R.drawable.artours),
            new Agencia("Jet Set Viajes y Turismo",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "jetsetviajesyturismo.com","CALLE 24 NORTE 5 AN 25,Cali, Valle del Cauca",
                    3.3678295,-76.5624655, 5240252,R.drawable.jetset),
            new Agencia("Agencia de Viajes Ecolombia Tours",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "ecolombiatours.com","Cra. 37a #6-18,Cali, Valle del Cauca",
                    3.4240717,-76.542778,5571957,R.drawable.ecolombia),
            new Agencia("Agencia de Viajes Je tours",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "jetours.com.co", "Cra. 98A #16-200,San Joaquín, Cali, Valle del Cauca",
                    3.3677391,-76.5296345,6680221,R.drawable.jetours),
            new Agencia("Agencia de Viajes StarTours Cali",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "startourscolombia.com","Av 4N 7N 46 Centro Comercial Local 127-128,Cali, Valle del Cauca",
                    3.4545514,-76.5391607,8858888,R.drawable.startours),
            new Agencia( "Agencia de Viajes Panturismo Cali ",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "panturismo.com.co","8n,Cl. 18 Nte. #8 Norte27,Cali, Valle del Cauca",
                    3.4616024,-76.5342977,6682255,R.drawable.panturismo)
    };

    private static Agencia[] SantaMarta =  {
            new Agencia("Agencia de Viajes Chayrama",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "chayrama.com","Centro Comercial Santa Maria del Mar,Cra. 1 #8-30,El Rodadero, Santa Marta (Distrito Turístico Cultural E Histórico), Magdalena",
                    11.2039364,-74.2296621, 4229520,R.drawable.chayrama),
            new Agencia("Agencia de Viajes Alestur Ltda",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "overalestur.com.co","Edificio Banco Santander,Cl. 14 #3-04,Santa Marta (Distrito Turístico Cultural E Histórico), Magdalena",
                    11.2449071,-74.2142681,4215076,R.drawable.alestur),
            new Agencia("Agencia de Viajes COMFORT Travel",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "overalestur.com.co","Edificio Banco Santander,Cl. 14 #3-04,Santa Marta (Distrito Turístico Cultural E Histórico), Magdalena",
                    11.2449071,-74.2142681,4215076,R.drawable.comfort),
            new Agencia("Agencia de Viajes Las Pleyades",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "viajesantamarta.com","Cl. 10 #1 C-59,Santa Marta, Magdalena",
                    11.247208,-74.215338,4207525,R.drawable.viajesntamarta),
            new Agencia("Agencia de Viajes over Alestur expertos en viajes",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "overalestur.com.co","Cl. 7 #1-73,El Rodadero, Santa Marta, Magdalena",
                    11.2054624,-74.2289831,4225849,R.drawable.alestur),
            new Agencia("Turismerk Agencia de Turismo",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "turismerk.com","Cl. 20 #3-73,Santa Marta, Magdalena",
                    11.2417871,-74.2146007,4310892,R.drawable.turismerk),
            new Agencia("Agencia de Viajes TAYKU",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "taykuviajesyturismo.blogspot.com","Cl. 6 #CRA1,Santa Marta, Magdalena",
                    11.2063425,-74.229606,5962032 ,R.drawable.tayku),
            new Agencia("Agencia de Viajes Turcol - Turismo Colombiano",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "turcoltravel.com","N°,Cl. 13 #913,Santa Marta, Magdalena",
                    11.245348,-74.214127,4212256,R.drawable.turcol),
            new Agencia( "Agencia de Viajes expedición tayrona ",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "www.facebook.com/expedicion-tayrona","Edificio Caribe,Calle 6 Esquina Carrera 3,El Rodadero, Santa Marta, Magdalena",
                    11.2065878,-74.2285673,6046125,R.drawable.operador)
    };

    private static Agencia[] Manizales =  {
            new Agencia("Agencia de Viajes Agentur",
                    "Brinda asesoría integral para la elección de las mejores rutas, programas y planes a múltiples destinos.",
                    "viajesagentur.com","Cra. 23b #65-20,Manizales, Caldas",
                    5.0553323,-75.4891457,8874100,R.drawable.agentur),
            new Agencia("Agencia de Viajes DESTINOS Y RUTAS DE COLOMBIA",
                    "De Pueblo en Pueblo es una agencia especialista en turismo por Antioquia cada domingo " +
                            "salen a un pueblo diferente de la región.",
                    "","",
                    5.0523603,-75.5276277,2,R.drawable.rutas),
            new Agencia("Agencia de Viajes Ecosistemas Viajes y turismo ",
                    "Casa de Colombia es una de las agencias con más trayectoria y prestigio en Medellín.",
                    "destinosyrutasdecolombia.com","Cra. 43 #1110,Manizales, Caldas",
                    5.0496222,-75.5324027,6136170,R.drawable.ecosistema),
            new Agencia("Agencia de Viajes Arma tu viaje",
                    "Ofrece tours de día entero a los más emocionantes y paisajísticos destinos, ubicados a dos horas de la ciudad.",
                    "agenciaarmatuviaje.com","# 51,Cra. 23 #55135,Manizales, Caldas",
                    5.0655663,-75.5127961,8853767,R.drawable.arma),
            new Agencia("Agencia de Viajes Circulo de Viajes",
                    "Es el operador mayorista a otras regiones de Colombia.",
                    "cvu.com.co","Cra. 24 No. 53 - 49,KRA 24,Manizales, Caldas",
                    5.0592525,-75.4923392,3258787,R.drawable.cvu),
            new Agencia("Agencia de Viajes COMFAMILIARES",
                    "Agencia Tour Operadora en Ecoturismo, Turismo de Aventura y Agroturismo de la ciudad de Medellín.",
                    "aviatur.com", "Cra. 25 #9a50,Manizales",
                    5.0501296,-75.5324028,8863300,R.drawable.aviatur),
            new Agencia("Agencia de Viajes Norte y Sur Travel",
                    "Ofrece planes turísticos nacionales e internacionales, entre otros servicios.",
                    "norteysurtravel.com","Cra. 23 #7455,Manizales, Caldas",
                    5.047236,-75.4849927,2968129,R.drawable.nortesir),
            new Agencia("Agencia de Viajes  Turismo Claudia Ramirez",
                    "Facilita al viajero su estadía brindando las mejores experiencias de viaje.",
                    "agenciadeviajesydeturismo.com","Cl. 62 #2361,Manizales, Caldas",
                    5.0472839,-75.5003137,8861835,R.drawable.claudia),
            new Agencia( "Agencia de Viajes Avianca Manizales",
                    "Ofrecemos servicios de excursiones, tiquetería, planes individuales nacionales e internacionales," +
                            " satisfaciendo las necesidades de nuestros clientes de forma proactiva e integral, " +
                            "con efectividad y calidad.",
                    "agenciadeviajesydeturismo.com","Cra. 27a #66-30,Manizales, Caldas",
                    5.0562468,-75.4909149,8877117,R.drawable.avianca)
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
