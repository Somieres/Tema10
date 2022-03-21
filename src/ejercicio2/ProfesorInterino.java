package ejercicio2;
import java.util.Date;
enum Cargo { PROFESOR, JEFE_DE_DEPARTAMENTO}



public class ProfesorInterino extends Trabajador {

    private Date fechaInicio;
    private Date fechaCese;
    private String nombreInstituto;
    private Cargo cargo;

    public ProfesorInterino(){

    }

    public ProfesorInterino(String nombre, String apellido, int edad, Date fechaInicio, Date fechaCese, String nombreInstituto, Cargo cargo) {
        super(nombre, apellido, edad);
        this.fechaInicio = fechaInicio;
        this.fechaCese = fechaCese;
        this.nombreInstituto = nombreInstituto;
        this.cargo = cargo;
    }

    public void renovarInterinidad(){

    }

    public void comprobarInterinidad(){

    }

}
