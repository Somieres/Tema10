package boletin3_tema10;

import boletin3_usos_empresa.Coche;
import boletin3_usos_empresa.Portatil;

import java.time.LocalDate;

public class Main_Boletin3 {
    public static void main(String[] args) {
/**
 * creamos tres tipo un programador, un administrativo y un jefe de proyecto
 */
        Programador p1 = new Programador("eva", "5458D", LocalDate.of(2025, 6, 20),);

        System.out.println(p1);

        p1.cambioTecnologia(Programador.Tecnologia.ACUSICA);
        p1.incrementarSalario();
        System.out.println(p1);

        Administrativo a1 = new Administrativo("Francisco", "77j", LocalDate.of(1995, 5, 8), "Eva", 6);
        System.out.println(a1);
        a1.incrementarSalario();
        System.out.println(a1);

        JefeDeProyecto j1 = new JefeDeProyecto("Maria", "66y", LocalDate.of(1990, 5, 25),
                a1, 1,
                new Coche("55F", Coche.Marca.TESLA, Coche.ModeloCoche.SUPREME), new Portatil("58r", Portatil.Modelo.PAVILION),
                a1, Programador.Tecnologia.SISMICA);
        System.out.println(j1);
        j1.cambioTecnologia(Programador.Tecnologia.SISMICA);
        System.out.println(j1);


    }
}