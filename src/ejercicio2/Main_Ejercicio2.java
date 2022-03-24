package ejercicio2;

public class Main_Ejercicio2 {
    /*
    En el programa principal se deberá de dar de alta a varios profesores fijos e interinos, intercambiar
el cargo de dos profesores, consultar el periodo de tiempo que va a estar un interino en el instituto,
cuánto tiempo le queda a ese interino en el instituto, renovar su periodo de interinidad.
     */
    public static void main(String[] args) {

        ProfesorFijo prof1=new ProfesorFijo("Lucia","Delgado",30,TipoTrabajo.DIRECTOR);

        System.out.println(prof1);

        ProfesorFijo prof2=new ProfesorFijo("Maria","Delgado",42,TipoTrabajo.DIRECTOR);

        System.out.println(prof2);
    }

}
