package ejercicio2;

import java.time.LocalDate;
import java.util.Date;

enum TipoTrabajo{ DIRECTOR, JEFE_DE_ESTUDIOS, SECRETARIO, JEFE_DE_DEPARTAMENTO, PROFESOR}

public class ProfesorFijo extends Trabajador {

    static private int id;
    private LocalDate fechaOposicion;
    private TipoTrabajo tipoTrabajo;
    static int numDirectores=0;

    public ProfesorFijo() {

    }

    public ProfesorFijo(String nombre, String apellido, int edad, TipoTrabajo tipoTrabajo) {

        super(nombre, apellido, edad);

        if (tipoTrabajo==TipoTrabajo.DIRECTOR && numDirectores==1){
            System.out.println("Ya exite un director dado de alta");
            System.out.println(super.toString() + " ha sido dado de alta como profesor");
            this.tipoTrabajo=TipoTrabajo.PROFESOR;
        }else {
            this.tipoTrabajo = tipoTrabajo;
        }
        id++;
        numDirectores++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaOposicion() {
        return fechaOposicion;
    }

    public void setFechaOposicion(LocalDate fechaOposicion) {
        this.fechaOposicion = fechaOposicion;
    }

    public TipoTrabajo getTipoTrabajo() {
        return tipoTrabajo;
    }

    @Override
    public String toString() {
        return "tiene el id= " + id +
                " es un " + tipoTrabajo;
    }


    //Por último, los profesores que son fijos pueden intercambiar su cargo
    //con otro profesor fijo.
    // crear un metodo con esto



}
