package ejerciciosClase;

public class Vehiculo {

    protected String matricula;
    protected String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula=" + matricula +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
