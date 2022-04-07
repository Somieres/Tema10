package boletin3_tema10;
import boletin3_tema10.boletin3_usos_empresa.CambiosEmpresa;
import boletin3_tema10.boletin3_usos_empresa.Portatil;

import java.time.LocalDate;

/*

 */
public class Programador extends Empleado implements CambiosEmpresa {


    public enum Proyecto {MARVEL,DADORA,FENIX,RESPLANDOR};
    public enum Tecnologia {SISMICA,FULLERA,FILOMENA,ACUSICA};
    Portatil portatil;
    private int tfnoMovil;
    Proyecto proyecto;
    Tecnologia tecnologia;


    public Programador(String nombre, String apellidos, String DNI, LocalDate antEmpresa, Empleado supervisor, Portatil portatil,
                       Proyecto proyecto, Tecnologia tecnologia) {
        super(nombre, apellidos, DNI, antEmpresa, supervisor);
        this.portatil = portatil;
        this.tfnoMovil = 658854458;
        this.proyecto = proyecto;
        this.tecnologia = tecnologia;
    }

    public Programador() {
    }

    public Portatil getPortatil() {
        return portatil;
    }

    public void setPortatil(Portatil portatil) {
        this.portatil = portatil;
    }

    public int getTfnoMovil() {
        return tfnoMovil;
    }

    public void setTfnoMovil(int tfnoMovil) {
        this.tfnoMovil = tfnoMovil;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return super.toString()+" Es PROGRAMADOR, su PROYECTO es " + this.proyecto+
                " y la tecnologia es " + this.tecnologia+"."+portatil.toString()+System.lineSeparator()+
                "------------------------------------------------------------------------------------------------------"+System.lineSeparator();
    }


    @Override
    public void incrementarSalario() {
        double incremento=10;
        double aumento = salario * incremento / 100;

        salario = salario + aumento;
    }

    @Override
    public void cambioTecnologia(Tecnologia tecnologia){

        if (this.tecnologia.equals(tecnologia)){
            System.out.println("Esta trabajando con esa TECNOLOGIA por lo tanto no tiene sentido el CAMBIO "+System.lineSeparator());
        }else{

            this.tecnologia=tecnologia;
        }
    }


    @Override
    public void cambiarPortatil(Portatil portatil){

        if (this.portatil.getNumSerie().equals(portatil.getNumSerie())){
            System.out.println("Imposible, ya dispone usted de ese portatil "+System.lineSeparator());
        }else{
            this.portatil=portatil;
        }
    }


}
