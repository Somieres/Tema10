package boletin10_ejercicio3;

public class Main_Ejercicio3 {
    public static void main(String[] args) {

        Hora12 h1=new Hora12(12,59,AmPm.PM);
        HoraExacta h2=new HoraExacta(23,59,59);
        h1.inc();
        h2.inc();
        h1.inc();
        h2.inc();
        h1.inc();
        System.out.println(h1);
        System.out.println(h2);

    }
}
