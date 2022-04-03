package boletin3_tema10;

import java.time.LocalDate;

public class Empleado {

    protected String nombre;
    protected String DNI;
    protected String direccion;
    protected LocalDate antEmpresa;
    protected int telefono;
    protected double salario;
    protected Empleado supervisor;

    public Empleado() {

    }

    public Empleado(String nombre, String DNI, LocalDate antEmpresa, Empleado supervisor) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = "C/ La Pantomima";
        this.antEmpresa = antEmpresa;
        this.telefono = 358485569;
        this.salario = 35000;
        this.supervisor = supervisor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getAntEmpresa() {
        return antEmpresa;
    }

    public void setAntEmpresa(LocalDate antEmpresa) {
        this.antEmpresa = antEmpresa;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        return "El empleado, se llama " + this.nombre + ", su DNI es " + this.DNI + ", su direccion es " + this.direccion +
                ", es empleado de la empresa desde " + this.antEmpresa + ", su telefono es " + this.telefono + ", su sueldo es de " + this.salario +
                " y su supervisor es " + this.supervisor + ".";
    }

    public void cambioSupervisor(Empleado supervisor) {

        if (this.supervisor.getNombre().equals(supervisor.getNombre())) {
            System.out.println("No se puede cambiar por ese supervisor ya que es el mismo");
        } else {
            supervisor = this.supervisor;
        }
    }

    public void incrementarSalario() {

        double incremento=0;
        double aumento = salario * incremento / 100;

        salario = salario + aumento;
    }
}
