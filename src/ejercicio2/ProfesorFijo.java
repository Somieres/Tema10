package ejercicio2;

import java.util.Date;

enum TipoTrabajo{ DIRECTOR, JEFE_DE_ESTUDIOS, SECRETARIO, JEFE_DE_DEPARTAMENTO, PROFESOR}

public class ProfesorFijo extends Trabajador {

    private int id;
    private Date fechaOposicion;
    private TipoTrabajo tipoTrabajo;
    static int numDirectores=0;

    public ProfesorFijo() {

    }

    public ProfesorFijo(String nombre, String apellido, int edad, int id, Date fechaOposicion, TipoTrabajo tipoTrabajo) {
        super(nombre, apellido, edad);
        this.id = id;
        this.fechaOposicion = fechaOposicion;

        if (tipoTrabajo==TipoTrabajo.DIRECTOR && numDirectores==1){
            System.out.println("Ya exite un director dado de alta");
            System.out.println(super.toString() + " ha sido dado de alta como profesor");
            this.tipoTrabajo=TipoTrabajo.PROFESOR;
        }else {
            this.tipoTrabajo = tipoTrabajo;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaOposicion() {
        return fechaOposicion;
    }

    public void setFechaOposicion(Date fechaOposicion) {
        this.fechaOposicion = fechaOposicion;
    }

    public TipoTrabajo getTipoTrabajo() {
        return tipoTrabajo;
    }


    //Por último, los profesores que son fijos pueden intercambiar su cargo
    //con otro profesor fijo.
    // crear un metodo con esto



}
