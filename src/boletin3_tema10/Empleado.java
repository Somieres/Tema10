package boletin3_tema10;

import java.time.LocalDate;

public abstract class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String DNI;
    protected String direccion;
    protected LocalDate antEmpresa;
    protected int telefono;
    protected double salario;
    protected Empleado supervisor = null;

    public Empleado() {
        this.nombre = "Amadeo";
        this.DNI = "0000000Xx";
    }

    public Empleado(String nombre, String apellidos, String DNI, LocalDate antEmpresa, Empleado supervisor) {
        this.nombre = nombre;
        this.apellidos=apellidos;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        return "Nombre " + this.nombre +" "+ this.apellidos +", DNI " + this.DNI +
                ", empleado desde " + this.antEmpresa + ", salario " + this.salario +
                " su supervisor es " +this.supervisor.getNombre()+ "."+System.lineSeparator();

    }

    public void cambioSupervisor(Empleado supervisor) {

        if (this.supervisor.getDNI().equals(supervisor.getDNI())) {
            System.out.println("No se puede cambiar por ese SUPERVISOR ya que es el MISMO");
        } else {
            setSupervisor(supervisor);
        }
    }

    public abstract void incrementarSalario();
}
