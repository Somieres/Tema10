package ejercicio2;
import java.time.LocalDate;
import java.util.Date;
enum Cargo { PROFESOR, JEFE_DE_DEPARTAMENTO}



public class ProfesorInterino extends Trabajador {

    private LocalDate fechaInicio;
    private LocalDate fechaCese;
    private String nombreInstituto;
    private Cargo cargo;

    public ProfesorInterino(){

    }



    public ProfesorInterino(String nombre, String apellido, int edad, LocalDate fechaInicio, LocalDate fechaCese, String nombreInstituto, Cargo cargo) {
        super(nombre, apellido, edad);
        this.fechaInicio = fechaInicio;
        this.fechaCese = fechaCese;
        this.nombreInstituto = nombreInstituto;
        this.cargo = cargo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(LocalDate fechaCese) {
        this.fechaCese = fechaCese;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void renovarInterinidad(){



    }

    public void consultarInterinidad(){

    }

}
