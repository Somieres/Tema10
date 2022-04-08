package ejercicio_clase_28;

import java.time.LocalDate;
import java.util.Iterator;

public class Cliente implements Comparable {

    private String nombre;
    private String dni;
    private int edad;
    LocalDate antEmpresa;

    public Cliente(String nombre, LocalDate antEmpresa) {
        this.nombre = nombre;
        this.antEmpresa = antEmpresa;
    }

    public Cliente(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public Cliente(String dni){
        this.dni=dni;
    }

    public LocalDate getAntEmpresa() {
        return antEmpresa;
    }

    public void setAntEmpresa(LocalDate antEmpresa) {
        this.antEmpresa = antEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Sobreescribimos el metodo equals para poder
     * @param o
     * @return
     */
    @Override

    /*    Paco`s Method
    @Override
    public boolean equals(Object obj) {
        boolean salir=false;
        if (obj instanceof Cliente o){
            if (Objects.equals(dni, o.dni)){
                salir=true;
            }
        }
        return salir;
    }
     */
    public boolean equals(Object o) {

        boolean igual = false;
        if (this == o)
            igual = true;
        else {
            if (o instanceof Cliente) {
                Cliente cliente = (Cliente) o;
                if (this.dni == cliente.dni) {
                    igual = true;
                }
            }
        }

        return igual;
    }

    /**
     * Sobreescribimos el metodo toString para poder imprimir por pantalla el array list, solo escribiendo
     * el nombre
     * @return
     */
    @Override
    public String toString() {
        return "El cliente se llama " + this.nombre +
                " con dni " + this.dni + " y tiene " + this.edad+ " años"+ System.lineSeparator();
    }


    @Override
    public int compareTo(Object o) {
        int resultado=0;
        if (o instanceof Cliente) {
            Cliente cliente= (Cliente)o;
            resultado=this.dni.compareTo(cliente.dni);
        }
        return resultado;
    }


}
