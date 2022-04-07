package boletin3_tema10;

import boletin3_tema10.boletin3_usos_empresa.Coche;
import boletin3_tema10.boletin3_usos_empresa.Portatil;

import java.time.LocalDate;

public class Main_Boletin3 {
    public static void main(String[] args) {
/**
 * creamos varios portatiles para meterlos en el constructor de los programadores y Jefes de proyectos
 */

        Portatil portatil1=new Portatil("0A", Portatil.Modelo.OMEN);
        Portatil portatil2 =new Portatil("0B",Portatil.Modelo.OMEN);
        Portatil portatil3=new Portatil("0C", Portatil.Modelo.OMEN);
        Portatil portatil4=new Portatil("0D", Portatil.Modelo.OMEN);
        Portatil portatil5=new Portatil("0E", Portatil.Modelo.OMEN);
        Portatil portatil6=new Portatil("1A", Portatil.Modelo.OMEN);
        Portatil portatil7=new Portatil("1B", Portatil.Modelo.OMEN);

        /**
         * Creamos una serie de coches
         */
        Coche coche1=new Coche("5555A", Coche.Marca.TESLA, Coche.ModeloCoche.SUPREME);
        Coche coche=new Coche("6666B", Coche.Marca.MERCEDES, Coche.ModeloCoche.SUPREME);

        /**
         * damos de alta algunos empleado programadores
          */
        Empleado p0=new Programador();// Programador creado para que sea el supervisor del primer empleado y no de error
        Empleado p1 = new Programador("Eva", "Ramos","00000a", LocalDate.of(2025, 6, 20),p0,
            portatil1, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Empleado p2 = new Programador("Manuel","Lopez", "11111a", LocalDate.of(2025, 6, 20),p1
            , portatil2, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Empleado p3= new Programador("Cristina", "Sanchez","22222a",LocalDate.now(),p1,
                portatil3, Programador.Proyecto.MARVEL, Programador.Tecnologia.FILOMENA );
        Empleado p4 = new Programador("Virginia", "Delgado","33333a", LocalDate.now(),p1,
                portatil4, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);
        Empleado p5 = new Programador("Silvia", "Delgado","44444a", LocalDate.now(),p1,
                portatil5, Programador.Proyecto.MARVEL, Programador.Tecnologia.FULLERA);


/**
 * utilizamos los metodos de programadores, para comprobar que funcionan
 */
        ((Programador) p1).cambioTecnologia(Programador.Tecnologia.ACUSICA);
        p1.incrementarSalario();
        p2.incrementarSalario();
        ((Programador) p1).cambiarPortatil(portatil1);
        ((Programador) p2).cambiarPortatil(portatil3);
        p2.cambioSupervisor(p1);
        p1.cambioSupervisor(p2);
        System.out.println(p1);
        System.out.println(p2);

        /**
 * Damos de alta a un administrador y le aplicamos sus metodos
 */
        Empleado a1 = new Administrativo("Francisco","Albiñana" , "77j", LocalDate.of(1995, 5, 8)
                , p1, 6);
        System.out.println(a1);
        a1.incrementarSalario();
        System.out.println(a1);

        /**
 * Creamos un Jefe de proyecto le aplicamos sus metodos y creamos un arrayList de empleados con su metodo correspondiente
 */
        Empleado j1 = new JefeDeProyecto("Rosario","Leon", "1234ABC", LocalDate.of(1980, 6, 26),
                a1, 1, coche,portatil6, (Administrativo) a1, Programador.Tecnologia.SISMICA);
        System.out.println(j1);


        ((JefeDeProyecto) j1).cambioTecnologia(Programador.Tecnologia.FULLERA);
        j1.cambioSupervisor(p1);
        ((JefeDeProyecto) j1).cambiarAdministrativo((Administrativo) a1);
        j1.incrementarSalario();
        ((JefeDeProyecto) j1).cambiarCoche(coche1);
        ((JefeDeProyecto) j1).cambiarPortatil(portatil6);
        ((JefeDeProyecto) j1).cambiarPortatil(portatil7);

        System.out.println(j1);

        ((JefeDeProyecto) j1).gestionarProyectos(Programador.Proyecto.RESPLANDOR);
        ((JefeDeProyecto) j1).gestionarProyectos(Programador.Proyecto.MARVEL);
        ((JefeDeProyecto) j1).gestionarProyectos(Programador.Proyecto.FENIX);
        System.out.println(((JefeDeProyecto) j1).listaProyectos.toString());
        System.out.println();
        ((JefeDeProyecto) j1).dejarGestionProyectos(Programador.Proyecto.RESPLANDOR);
        ((JefeDeProyecto) j1).darAlta((Programador) p1);
        ((JefeDeProyecto) j1).darAlta((Programador) p2);
        ((JefeDeProyecto) j1).darAlta ((Programador) p3);
        ((JefeDeProyecto) j1).darAlta ((Programador) p4);
        ((JefeDeProyecto) j1).darAlta((Programador) p5);
        ((JefeDeProyecto) j1).mostrarListaTrabajadores();
        ((JefeDeProyecto) j1).darBaja((Programador) p5);
        System.out.println(System.lineSeparator()+"El jefe de proyecto "+ j1.getNombre()+" "+ j1.getApellidos()+", tiene a su cargo"+System.lineSeparator());
        ((JefeDeProyecto) j1).mostrarListaTrabajadores();
        System.out.println(((JefeDeProyecto) j1).listaProyectos.toString());


    }
}
