package ejercicio7_04_2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ejercicio_clase_28.Cliente;
public class Ejercicio {
/*    Ejercicio Colecciones. Día 7.04.2022
Crear una función a la que se le pase dos listas (List) ordenadas y nos devuelva una única lista, fusión de las dos anteriores y que también esté ordenada
Desarrollar el algoritmo de forma no destructiva, es decir, que las listas utilizadas como parámetros se mantengan intactas.

La signatura del método tiene que responder a:
Static List <Integer> fusión (List <Integer> lista1, List <Integer> lista2)
Hacer lo mismo con nuestra clase Empleado que ordenará los elementos por antigüedad.
     */

    //Declaramos los ArrayList que vamos a utilizar en el ejercicio
    public static List<Integer> lista1=new ArrayList<>();
    public static List<Integer> lista2=new ArrayList<>();

    public static void main(String[] args) {

        /**
         * insertamos datos en los arrayList arbitrariamente
         */
        lista1.add(6);
        lista1.add(8);
        lista1.add(9);
        lista1.add(5);
        lista1.add(2);
        lista1.add(1);
        lista2.add(12);
        lista2.add(10);
        lista2.add(11);
        lista2.add(4);
        lista2.add(7);
        lista2.add(3);

        //Mostramos el resultado de el uso del metodo agregarNumero
        System.out.println("LISTAS DESORDENADAS");
        System.out.println("Lista numero 1 desordenada"+lista1);
        System.out.println("Lista numero 2 desordenada"+lista2+System.lineSeparator());

       //Utilizamos el metodo de ordenacion
        ordenarArray(lista1);
        ordenarArray(lista2);

        //Mostramos el resultado de el uso del metodo de ordenacion
        System.out.println("LISTAS ORDENADAS");
        System.out.println("Lista numero 1 ordenada"+lista1);
        System.out.println("Lista numero 2 ordenada"+lista2+System.lineSeparator());

        //llamada al metodo fusion para unir los dos arrays en uno
        System.out.println( fusión(lista1,lista2) );

        Cliente e1= new Cliente("Eva",LocalDate.of(2022,1,1));
        Cliente e2=new Cliente("Vigi",LocalDate.of(2021,1,1));
        Cliente e3=new Cliente("Esperanza",LocalDate.of(2020,1,1));
        Cliente e4=new Cliente("Jesus",LocalDate.of(2019,1,1));
        Cliente e5=new Cliente("Paco",LocalDate.of(2018,1,1));
        Cliente e6=new Cliente("Manuel",LocalDate.of(2017,1,1));
        //Mostramos el resultado de la accion anterior
        //  System.out.println("LISTAS UNIFICADAS");
        // fusión(lista1,lista2);
        List<Cliente> lista3=new ArrayList<>();
        List<Cliente> lista4=new ArrayList<>();

        lista3.add(e6);
        lista3.add(e4);
        lista3.add(e5);
        lista4.add(e1);
        lista4.add(e3);
        lista4.add(e2);

        System.out.println(lista3.toString());
        System.out.println(lista4.toString());

    }



    /**
     * Metodo para ordenar el arrayList, aqui le pasamos por parametros el arrayList que deseamos ordenar
     * @param lista
     */
    public static void ordenarArray(List<Integer> lista){
        Collections.sort(lista);
    }

    /**
     * Metodo que nos sirve para fusionar las dos arrayList creadas en una nueva, sin que ello implique la perdida de las otras dos
     * @param lista
     * @param tonta
     */
    public static List <Integer>  fusión(List <Integer> lista, List <Integer> tonta){

        Integer i=0;
        Integer j=0;
        List<Integer> union=new ArrayList<>();

        while( i < lista1.size() && j< lista2.size()){
            if (lista2.get(j)<lista1.get(i)){
                union.add(lista2.get(j));
                j++;
            }else
                if(lista1.get(i)< lista2.get(j)){
                union.add(lista1.get(i));
                i++;
            }
        }
        //compruebo si no he llegado al final de alguna lista y la vuelco en union
        if (i<lista1.size()){
            while (i<lista1.size()){
                union.add(lista1.get(i));
                i++;

            }
        }
        if (j<lista2.size()){
            while (j<lista2.size()){
            union.add(lista2.get(j));
                j++;

            }
        }

        return union;
    }

}
