package ejercicio_clase_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main_ejercicio_clase_28 {

    public static void main(String[] args) {


        Cliente cliente=new Cliente("Marta","11111J", 20);
        Cliente cliente2=new Cliente("Eva","22222A", 40);
        Cliente cliente3=new Cliente("Sofia","33333B", 35);
        Cliente cliente4=new Cliente("Jesusa","44444C", 85);
        ArrayList <Cliente> listaCliente=new ArrayList<>();


       // Object[] listaClientes= listaCliente.toArray();




        //Introducir elementos en el array
        listaCliente.add(cliente4);
        listaCliente.add(cliente3);
        listaCliente.add(cliente2);
        listaCliente.add(cliente);
        //Meter elemementos a traves del mismo array
        listaCliente.add(new Cliente("Manuel","284585454L",20));
        // Eliminiar elemento del array list
       // listaCliente.remove(cliente);
        // Implementamos el metodo equals en la clase Cliente y lo comparamos con el dni y nos devuelve un true o un
        // false dependiendo de los datos introducidos son iguales o no. Implementamos este metodo para poder hacer
        // un contains


        Cliente estefania=new Cliente("Estefania","55555D",150);
//odenamos el array por el nombre implementado el compareTo creado en la clase cliente
      Collections.sort(listaCliente,new CompararNombre());

      //devuelve la posicion en la que deberia introducirse a Estefania, en este caso el -1 que seria la posision 0
        System.out.println(listaCliente);
        System.out.println(Collections.binarySearch(listaCliente,estefania,new CompararNombre()));



       /* Collections.sort(listaCliente, new Comparator<Cliente>() {
                    @Override
                    public int compare(Cliente o1, Cliente o2) {
                        return o1.getEdad()-(o2.getEdad());
                    }
                }
        );//    Collections.sort(listaCliente, new CompararNombe());*/

       // System.out.println(listaCliente.contains(new Cliente("22222A")));


       // System.out.println(listaCliente.contains(new Cliente("Pepa","22222B", 58)));


           // System.out.println(cliente);


    }
}
