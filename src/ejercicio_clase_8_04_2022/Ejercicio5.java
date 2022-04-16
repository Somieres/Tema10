package ejercicio_clase_8_04_2022;


import javax.swing.*;
import java.util.*;

public class Ejercicio5 {
    /*
    5. Repetir el ejercicio anterior pero en esta ocasión el listado ha de mostrarse ordenado
por nombre.
     */

    public static void main(String[] args) {

    Set<String> listaNombres=new TreeSet<>();
    String nombre;

    nombre= JOptionPane.showInputDialog("Introduzca un nombre");

    while (!nombre.equals("fin")){

        listaNombres.add(nombre);
        nombre= JOptionPane.showInputDialog("Introduzca un nombre");
    }
        System.out.println(listaNombres);
    }
}
