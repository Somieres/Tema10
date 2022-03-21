package ejercicio2;

import java.util.Date;

enum TipoTrabajo{ DIRECTOR, JEFE_DE_ESTUDIOS, SECRETARIO, JEFE_DE_DEPARTAMENTO, PROFESOR}

public class ProfesorFijo extends Trabajador {

    private int id;
    private Date fechaOposicion;
    private TipoTrabajo tipoTrabajo;

    public ProfesorFijo() {

    }

    public ProfesorFijo(String nombre, String apellido, int edad, int id, Date fechaOposicion, TipoTrabajo tipoTrabajo) {
        super(nombre, apellido, edad);
        this.id = id;
        this.fechaOposicion = fechaOposicion;
        this.tipoTrabajo = tipoTrabajo;
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
