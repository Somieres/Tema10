package boletin3_tema10;

import boletin3_usos_empresa.CambiosEmpresa;
import boletin3_usos_empresa.Coche;
import boletin3_usos_empresa.Portatil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

/*
Tiene despacho, tiene un administrativo/a a su cargo, una lista de
programadores a su cargo, una lista de proyectos que supervisa y tiene coche de la
empresa (identificado por la matrícula, marca y modelo). Incrementa su salario un 20%
anual. Al igual que los programadores, tienen un portátil y una tecnología asocaida
Tendrá, al menos, las siguientes funciones miembro:
• Constructores
• Imprimir
• Cambiar de administrativo.
• Cambiar de coche.
• Cambiar de tecnología.
• Cambiar de portátil.
• Dar de alta y de baja los programadores que forman parte de su equipo
 */
public class JefeDeProyecto extends Empleado implements CambiosEmpresa{

    ArrayList<Programador> listaTrabajadores = new ArrayList<>();
    ArrayList<Programador.Proyecto> listaProyectos=new ArrayList<>();
    private int numDespacho;
    private Coche coche;
    private Portatil portatil;
    private Administrativo administrativo;
    private Programador.Tecnologia tecnologia;



    public JefeDeProyecto(String nombre, String DNI, LocalDate antEmpresa, Empleado supervisor,
                          int numDespacho, Coche coche, Portatil portatil, Administrativo administrativo, Programador.Tecnologia tecnologia) {
        super(nombre, DNI, antEmpresa, supervisor);
        this.numDespacho = numDespacho;
        this.coche = coche;
        this.portatil = portatil;
        this.administrativo = administrativo;
        this.tecnologia = tecnologia;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public Portatil getPortatil() {
        return portatil;
    }

    public void setPortatil(Portatil portatil) {
        this.portatil = portatil;
    }

    public Administrativo getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }

    public Programador.Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Programador.Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return super.toString() + " Su cargo es jefe de proyecto su despacho es el numero " + this.numDespacho +
                " " + coche.toString() + " " + portatil.toString() + " tiene como administrativo a " + this.administrativo.getNombre() +
                " y la tecnologia con la que trabaja es " + this.tecnologia + "." + System.lineSeparator();
    }

    @Override
    public void incrementarSalario() {
        double incremento = 20;
        double aumento = salario * incremento / 100;

        salario = salario + aumento;
    }

    public void cambiarAdministrativo(Administrativo administrativo) {

        if (this.administrativo.getDNI().equals(administrativo.getDNI())) {
            System.out.println("Usted ya tiene asignado ese administrativo");
        } else {
            this.administrativo = administrativo;
        }
    }

    public void cambiarCoche(Coche coche) {
        if (this.coche.getMatricula().equals(coche.getMatricula())) {
            System.out.println("Usted ya tiene asignado ese vehiculo" + System.lineSeparator());
        } else {
            this.coche = coche;
        }

    }

    @Override
    public void cambioTecnologia(Programador.Tecnologia tecnologia) {
        if (this.tecnologia.equals(tecnologia)) {
            System.out.println("Esta trabajando con esa tecnologia por lo tanto no tiene sentido el cambio");
        } else {

            this.tecnologia = tecnologia;
        }
    }

    @Override
    public void cambiarPortatil(Portatil portatil) {
        if (this.portatil.getNumSerie().equals(portatil.getNumSerie())) {
            System.out.println("Imposible, ya dispone usted de ese portatil" + System.lineSeparator());
        } else {
            this.portatil = portatil;
        }
    }

    public void darAlta(Programador programador) {
        listaTrabajadores.add(programador);
    }

    public void darBaja(Programador programador) {
        listaTrabajadores.remove( programador.);
    }
    public void gestionarProyectos(Programador.Proyecto proyecto){
      listaProyectos.add(proyecto);
    }
    public void dejarGestionProyectos(Programador.Proyecto proyecto){
      listaProyectos.remove(proyecto);
    }
    public String devolverTrabajador(){
        return "El programador se llama "+ getNombre() + ", su DNI es "+getDNI()+"."+System.lineSeparator();
    }

    public void mostrarListaTrabajadores(ArrayList listaTrabajadores){

        Iterator miIterador=listaTrabajadores.iterator();

        while (miIterador.hasNext()){
            System.out.println(miIterador.next().toString());
        }
    }
}
