package ejercicio_clase_8_04_2022;


import javax.swing.*;
import java.util.*;

public class Ejercicio4 {

/*4. Introducir por teclado, hasta que se introduzca “fin”, una serie de nombres que se
insertarán en una colección, de forma que se conserve el orden de inserción y que no
pueda repetirse. Mostrar la lista por pantalla */

    public static void main(String[] args) {

        Set<String> listaNombre= new LinkedHashSet<>();
        String nombre;

        nombre= JOptionPane.showInputDialog("Introduzca el nombre");

        while(!nombre.equals("fin")){

            listaNombre.add(nombre);
            nombre= JOptionPane.showInputDialog("Introduzca el nombre");
        }

        System.out.println(listaNombre);
    }
}
