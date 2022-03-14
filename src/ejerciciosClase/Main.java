package ejerciciosClase;

import javax.swing.text.TabableView;

public class Main {
    public static void main(String[] args) {

        Vehiculo coche1=new Vehiculo("6655-GFD", "Tesla");
        Taxi taxi1=new Taxi("7654-GTR", "Mercedes", 22222);

        Vehiculo coche2=new Vehiculo();
        coche2=(Vehiculo) taxi1;
        System.out.println(taxi1);
        System.out.println(coche2);

    }
}
