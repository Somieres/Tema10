package ejercicio_clase_28;

import java.util.ArrayList;

public class Main_ejercicio_clase_28 {

    public static void main(String[] args) {

        Cliente cliente=new Cliente("Marta","11111J", 20);
        Cliente cliente2=new Cliente("Eva","22222A", 40);
        Cliente cliente3=new Cliente("Sofia","33333B", 35);
        Cliente cliente4=new Cliente("Jesusa","44444C", 85);
        ArrayList <Cliente> listaCliente=new ArrayList<>();

        //Introducir elementos en el array
        listaCliente.add(cliente);
        listaCliente.add(cliente2);
        listaCliente.add(cliente3);
        listaCliente.add(cliente4);
        //Meter elemementos a traves del mismo array
        listaCliente.add(new Cliente("Manuel","284585454L",20));
        // Eliminiar elemento del array list
        listaCliente.remove(cliente);
        // Implementamos el metodo equals en la clase Cliente y lo comparamos con el dni y nos devuelve un true o un
        // false dependiendo de los datos introducidos son iguales o no. Implementamos este metodo para poder hacer
        // un contains

        System.out.println(listaCliente.contains(new Cliente("22222A")));


        System.out.println(listaCliente.contains(new Cliente("Pepa","22222B", 58)));


            System.out.println(listaCliente);


    }
}
