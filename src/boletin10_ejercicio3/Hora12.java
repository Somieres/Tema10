package boletin10_ejercicio3;

enum AmPm{AM,PM}

public class Hora12 extends Hora {

    private AmPm amPm;

    public Hora12() {

    }

    public Hora12(int hora, int minutos, AmPm amPm) {
        super(hora, minutos);
        this.amPm = amPm;
    }

    @Override
    public void inc() {
        super.inc();

        if(getHora()>12 && this.amPm==AmPm.AM){
            setHora(01);
            this.amPm=AmPm.PM;
        }
        if(getHora()>12 && this.amPm==AmPm.PM){
            setHora(01);
            this.amPm=AmPm.AM;
        }
    }




    @Override
    public String toString() {
        return super.toString()+" "+ amPm;
    }
}
