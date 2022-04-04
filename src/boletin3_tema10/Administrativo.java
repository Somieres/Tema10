package boletin3_tema10;

import java.time.LocalDate;

public class Administrativo extends Empleado{

    private int numDespacho;
    private int numFax;

    public Administrativo(){

    }

    public Administrativo(String nombre, String apellidos, String DNI, LocalDate antEmpresa, Empleado supervisor, int numDespacho) {
        super(nombre, apellidos, DNI, antEmpresa, supervisor);
        this.numDespacho = numDespacho;
        this.numFax = 958485155;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public int getNumFax() {
        return numFax;
    }

    public void setNumFax(int numFax) {
        this.numFax = numFax;
    }

    @Override
    public void incrementarSalario() {
        double incremento=5;
        double aumento = salario * incremento / 100;

        salario = salario + aumento;
    }

    @Override
    public String toString() {
        return super.toString()+ " Es ADMINISTRATIVO, su DESPACHO es "+ this.numDespacho+ "."+System.lineSeparator()+
                "------------------------------------------------------------------------------------------------------";
    }


}
