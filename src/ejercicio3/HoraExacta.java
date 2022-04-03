package ejercicio3;

public class HoraExacta extends Hora{

    private int segundos;

    public HoraExacta() {

    }

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public void inc() {
        this.segundos++;

        if (this.segundos>59){
            this.segundos=00;
            setMinutos(getMinutos()+1);
        }
        if(getMinutos()>59){
           setMinutos(00);
            setHora(getHora()+1);

        }
        if(getHora()>23){
            setHora(00);
        }
    }

    @Override
    public String toString() {

        String mensajeHora = "";

        if(this.segundos <= 9){
            mensajeHora = super.toString() + ":0" + this.segundos;
        }else{
            mensajeHora = super.toString() + ":" + this.segundos;
        }
        return mensajeHora;
    }
}
