package boletin3_tema10;

import boletin3_tema10.boletin3_usos_empresa.CambiosEmpresa;
import boletin3_tema10.boletin3_usos_empresa.Coche;
import boletin3_tema10.boletin3_usos_empresa.Portatil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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

    /**
     * Creamos lo atributos y dos arrayList de la clase Jefe de proyecto
     */
    public List<Programador> listaTrabajadores = new ArrayList<>();
    List<Programador.Proyecto> listaProyectos=new ArrayList<>();
    private int numDespacho;
    private Coche coche;
    private Portatil portatil;
    private Administrativo administrativo;
    private Programador.Tecnologia tecnologia;


    /**
     * Creamos un metodo constructor con todos los paramentros, tanto de la clase padres con de la propia clase
     * @param nombre
     * @param apellidos
     * @param DNI
     * @param antEmpresa
     * @param supervisor
     * @param numDespacho
     * @param coche
     * @param portatil
     * @param administrativo
     * @param tecnologia
     */
    public JefeDeProyecto(String nombre, String apellidos, String DNI, LocalDate antEmpresa, Empleado supervisor,
                          int numDespacho, Coche coche, Portatil portatil, Administrativo administrativo, Programador.Tecnologia tecnologia) {
        super(nombre, apellidos , DNI, antEmpresa, supervisor);
        this.numDespacho = numDespacho;
        this.coche = coche;
        this.portatil = portatil;
        this.administrativo = administrativo;
        this.tecnologia = tecnologia;
    }

    /**
     * Metodos getter y setter
     * @return
     */
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

    /**
     * Sobreescribimos el toString para añadirle los datos de salida
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " Su cargo es jefe de proyecto su despacho es el numero " + this.numDespacho +System.lineSeparator()+
                " " + coche.toString() + " " + portatil.toString() + " tiene como administrativo a " + this.administrativo.getNombre() +System.lineSeparator()+
                " y la tecnologia con la que trabaja es " + this.tecnologia + "." + System.lineSeparator();
    }

    /**
     * Sobreescribimos el metodo Incrementar salario introduciendole en este caso un 20%
     * y nos devuelve el salario base mas el 20%
     */
    @Override
    public void incrementarSalario() {
        double incremento = 20;
        double aumento = salario * incremento / 100;

        salario = salario + aumento;
    }

    /**
     * Metodo para cambiar de administrativo, por el que compara el existente con el que se cambiaria, a traves
     * del DNI, si es el mismo no deja, y si no lo es, lo cambia
     * @param administrativo
     */
    public void cambiarAdministrativo(Administrativo administrativo) {

        if (this.administrativo.getDNI().equals(administrativo.getDNI())) {
            System.out.println("Usted ya tiene asignado ese ADMINISTRATIVO");
        } else {
            this.administrativo = administrativo;
        }
    }

    /**
     * Este metodo utiliza el metodo equals, como el de arriba para compara la clase vehiculo a traves de la matricula
     * al igual que el de arriba, si es igual sale un mensaje de error pero si es distinta, la cambia
     * @param coche
     */
    public void cambiarCoche(Coche coche) {
        if (this.coche.getMatricula().equals(coche.getMatricula())) {
            System.out.println("Usted ya tiene asignado ese VEHICULO" + System.lineSeparator());
        } else {
            this.coche = coche;
        }

    }

    @Override
    public void cambioTecnologia(Programador.Tecnologia tecnologia) {
        if (this.tecnologia.equals(tecnologia)) {
            System.out.println("Esta trabajando con esa TECNOLOGIA por lo tanto no tiene sentido el cambio");
        } else {

            this.tecnologia = tecnologia;
        }
    }

    @Override
    public void cambiarPortatil(Portatil portatil) {
        if (this.portatil.getNumSerie().equals(portatil.getNumSerie())) {
            System.out.println("Imposible, ya dispone usted de ese PORTATIL" + System.lineSeparator());
        } else {
            this.portatil = portatil;
        }
    }

    /**
     * Metodo para dar de alta a un programador en el arrayList del jefe de proyecto
     * @param programador
     */
    public void darAlta(Programador programador) {
        listaTrabajadores.add(programador);
    }

    public void darBaja(Programador programador) {
        listaTrabajadores.remove(listaTrabajadores.indexOf(programador));
    }
    public void gestionarProyectos(Programador.Proyecto proyecto){
      listaProyectos.add(proyecto);
    }
    public void dejarGestionProyectos(Programador.Proyecto proyecto){
      listaProyectos.remove(listaProyectos.indexOf(proyecto));
    }
    public String devolverTrabajador(){
        return "El programador se llama "+ getNombre() + ", su DNI es "+getDNI()+"."+System.lineSeparator();
    }

    public void mostrarListaTrabajadores( ){

        Iterator<Programador> miIterador=listaTrabajadores.iterator();

        for (;miIterador.hasNext();){
            Empleado e= miIterador.next();
            System.out.println(e);
        }
    }

}
