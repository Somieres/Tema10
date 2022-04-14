package ejercicio_clase_28;

import java.util.*;

public class Main_ejercicio_clase_28 {

    public static void main(String[] args) {


       /* List<Cliente> listaClientes=new ArrayList<>();

        Cliente c1=new Cliente("Manuel","4E",20);
        Cliente c2=new Cliente("Francisco", "5F",41);
        listaClientes.add(c2);
        listaClientes.add(c1);
        listaClientes.add(new Cliente("Eva","0A",42));
        listaClientes.add(new Cliente("Virginia","1B",37));
        listaClientes.add(new Cliente("Silvia","2C",37));
        listaClientes.add(new Cliente("Cristina","3D",30));
        System.out.println(listaClientes.toString());
       // listaClientes.clear();
        listaClientes.remove(4);
        listaClientes.remove(c1);
        System.out.println(listaClientes.toString());
        System.out.println("Hay "+listaClientes.size()+" clientes almacenados");
        System.out.println(listaClientes.contains(c2));
        System.out.println("Es "+listaClientes.contains(new Cliente("Eva","0A",42)));
        System.out.println(listaClientes.contains(c1));
        System.out.println(listaClientes.isEmpty());*/


       // Object[] listaClientes=cliente2.toArray;

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
        //para que apareczca la posision que deberia ocupar, le ponemos delante el menos y detras el -1
        System.out.println("La posicion de El Ultimo elemento introducido deberia de ser en el lugar "+(-Collections.binarySearch(listaCliente,estefania,new CompararNombre())-1));



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
