package boletin10_ejercicio3;

public class Hora12 extends Hora {

    public Hora12() {
    }

    public Hora12(int hora, int minutos) {
        super(hora, minutos);
    }

    @Override
    public void inc() {

        if (this.getMinutos()>59){
            this.setHora()+=1;
            this.setMinutos(00);
        }

    }

}
