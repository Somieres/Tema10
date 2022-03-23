package boletin10_ejercicio3;

public class Hora {

    private int hora;
    private int minutos= 00;

    public Hora() {
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public Hora(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * Mestodo para incrementar minutos
     * @return devuelve los minutos incrementados
     */
     public void inc(){

         this.minutos++;
         if (this.minutos>59){
             this.hora+=1;
             this.minutos=00;
         }
         if (this.hora>23){
             this.hora=00;
         }

     }


    @Override
    public String toString() {
         String mensajeHora="";

         if (this.hora<10 && this.minutos<10){
             mensajeHora="0"+getHora() +":0" + getMinutos();

         }else if (this.hora<=9 ){
            mensajeHora="0"+getHora() +":" + getMinutos();

        }else if (this.minutos<10){
            mensajeHora=getHora() +":0" + getMinutos();

        }
         else{
             mensajeHora= getHora()+":"+getMinutos();
         }
        return  mensajeHora;
    }
}
