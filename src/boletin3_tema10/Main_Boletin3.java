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
        Portatil portatil2 =new Portatil("1B", Portatil.Modelo.PAVILION);
        Portatil portatil3=new Portatil("3C", Portatil.Modelo.OMEN);

        Programador p1 = new Programador("eva", "Ramos","5458D", LocalDate.of(2025, 6, 20),
            portatil1, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Programador p2 = new Programador("Manuel","Lopez", "5555E", LocalDate.of(2025, 6, 20),p1
            , portatil2, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Programador p3= new Programador("Cristina", "Sanchez","1111111C",LocalDate.now(),p1,portatil3, Programador.Proyecto.MARVEL, Programador.Tecnologia.FILOMENA )


        System.out.println(p1);
        System.out.println(p2);


        p1.cambioTecnologia(Programador.Tecnologia.ACUSICA);
        p1.incrementarSalario();
        p2.incrementarSalario();
        p1.cambiarPortatil(new Portatil("548l", Portatil.Modelo.PAVILION));
        p2.cambiarPortatil(new Portatil("548l", Portatil.Modelo.PAVILION));
        p2.cambioSupervisor(p1);
        p1.cambioSupervisor(p2);
        System.out.println(p1);
        System.out.println(p2);

        Administrativo a1 = new Administrativo("Francisco","Albiñana" , "77j", LocalDate.of(1995, 5, 8), p1, 6);
        System.out.println(a1);
        a1.incrementarSalario();
        System.out.println(a1);

        JefeDeProyecto j1 = new JefeDeProyecto("Maria","Foliasca", "66y", LocalDate.of(1990, 5, 25),
                a1, 1, new Coche("55F", Coche.Marca.TESLA, Coche.ModeloCoche.SUPREME), new Portatil("58r",
                Portatil.Modelo.PAVILION), a1, Programador.Tecnologia.SISMICA);
        System.out.println(j1);
        j1.cambioTecnologia(Programador.Tecnologia.FULLERA);
        j1.cambioSupervisor(p1);
        j1.cambiarAdministrativo(a1);
        j1.incrementarSalario();
        j1.cambiarCoche(new Coche("SE-3333-ZZ", Coche.Marca.MERCEDES, Coche.ModeloCoche.SPORT));
        j1.cambiarPortatil(new Portatil("00000A", Portatil.Modelo.PAVILION));

        System.out.println(j1);

        j1.darAlta(p1);
        j1.darAlta(p2);
        j1.darAlta (p3);
        j1.darAlta (new Programador("Silvia","2222B", LocalDate.now(),j1));
        j1.darAlta(new Programador("Virginia","3333C", LocalDate.now(),j1));
        j1.devolverTrabajador();
        j1.darBaja();
        j1.mostrarListaTrabajadores();


    }
}
