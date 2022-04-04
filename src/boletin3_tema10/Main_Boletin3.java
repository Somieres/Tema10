package boletin3_tema10;

import boletin3_usos_empresa.Coche;
import boletin3_usos_empresa.Portatil;

import java.time.LocalDate;
import java.util.Arrays;

public class Main_Boletin3 {
    public static void main(String[] args) {
/**
 * creamos tres tipo un programador, un administrativo y un jefe de proyecto
 */

        Portatil portatil1=new Portatil("0A", Portatil.Modelo.OMEN);
        Portatil portatil2 =new Portatil("0B",Portatil.Modelo.OMEN);
        Portatil portatil3=new Portatil("0C", Portatil.Modelo.OMEN);
        Portatil portatil4=new Portatil("0D", Portatil.Modelo.OMEN);
        Portatil portatil5=new Portatil("0E", Portatil.Modelo.OMEN);
        Portatil portatil6=new Portatil("1A", Portatil.Modelo.OMEN);
        Portatil portatil7=new Portatil("1B", Portatil.Modelo.OMEN);


        Coche coche1=new Coche("5555A", Coche.Marca.TESLA, Coche.ModeloCoche.SUPREME);
        Coche coche=new Coche("6666B", Coche.Marca.MERCEDES, Coche.ModeloCoche.SUPREME);

        Programador p0=new Programador();
        Programador p1 = new Programador("Eva", "Ramos","00000a", LocalDate.of(2025, 6, 20),p0,
            portatil1, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Programador p2 = new Programador("Manuel","Lopez", "11111a", LocalDate.of(2025, 6, 20),p1
            , portatil2, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Programador p3= new Programador("Cristina", "Sanchez","22222a",LocalDate.now(),p1,
                portatil3, Programador.Proyecto.MARVEL, Programador.Tecnologia.FILOMENA );
        Programador p4 = new Programador("Virginia", "Delgado","33333a", LocalDate.now(),p1,
                portatil4, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Programador p5 = new Programador("Silvia", "Delgado","44444a", LocalDate.now(),p1,
                portatil5, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);



        p1.cambioTecnologia(Programador.Tecnologia.ACUSICA);
        p1.incrementarSalario();
        p2.incrementarSalario();
        p1.cambiarPortatil(portatil1);
        p2.cambiarPortatil(portatil3);
        p2.cambioSupervisor(p1);
        p1.cambioSupervisor(p2);
        System.out.println(p1);
        System.out.println(p2);

        Administrativo a1 = new Administrativo("Francisco","Albiñana" , "77j", LocalDate.of(1995, 5, 8)
                , p1, 6);
        System.out.println(a1);
        a1.incrementarSalario();
        System.out.println(a1);

        JefeDeProyecto j1 = new JefeDeProyecto("Rosario","Leon", "1234ABC", LocalDate.of(1980, 6, 26),
                a1, 1, coche,portatil6, a1, Programador.Tecnologia.SISMICA);
        System.out.println(j1);
        j1.cambioTecnologia(Programador.Tecnologia.FULLERA);
        j1.cambioSupervisor(p1);
        j1.cambiarAdministrativo(a1);
        j1.incrementarSalario();
        j1.cambiarCoche(coche1);
        j1.cambiarPortatil(portatil6);
        j1.cambiarPortatil(portatil7);

        System.out.println(j1);

        j1.darAlta(p1);
        j1.darAlta(p2);
        j1.darAlta (p3);
        j1.darAlta (p4);
        j1.darAlta(p5);
        j1.mostrarListaTrabajadores();
        j1.darBaja(p5);
        j1.mostrarListaTrabajadores();


    }
}
