package ejercicio7_04_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public static List<Integer> union=new ArrayList<>();
    public static void main(String[] args) {

        //llamamos al metodo agragarNumero para insertar valores en el arrayList
        agregarNumero(lista1,6);
        agregarNumero(lista1,3);
        agregarNumero(lista1,4);
        agregarNumero(lista1,5);
        agregarNumero(lista1,2);
        agregarNumero(lista1,1);
        agregarNumero(lista2,12);
        agregarNumero(lista2,10);
        agregarNumero(lista2,11);
        agregarNumero(lista2,9);
        agregarNumero(lista2,7);
        agregarNumero(lista2,8);

        //Mostramos el resultado de el uso del metodo agregarNumero
        System.out.println("LISTAS DESORDENADAS");
        System.out.println("Lista numero 1 desordenada"+lista1.toString());
        System.out.println("Lista numero 2 desordenada"+lista2.toString()+System.lineSeparator());

        //Utilizamos el metodo de ordenacion
        ordenarArray(lista1);
        ordenarArray(lista2);

        //Mostramos el resultado de el uso del metodo de ordenacion
        System.out.println("LISTAS ORDENADAS");
        System.out.println("Lista numero 1 ordenada"+lista1.toString());
        System.out.println("Lista numero 2 ordenada"+lista2.toString()+System.lineSeparator());

        //llamada al metodo fusion para unir los dos arrays en uno
        fusión(lista1,lista2);

        //Mostramos el resultado de la accion anterior
        System.out.println("LISTAS UNIFICADAS");
        System.out.println("La union de las dos listas en una da como resultado "+union.toString()+System.lineSeparator());

        //Compruebo que las listas siguen existiendo y que no se han eliminado al usar el metodo fusion
        System.out.println("NO EXISTE PERDIDA DE LISTAS");
        System.out.println("Lista numero 1 ordenada"+lista1.toString());
        System.out.println("Lista numero 2 ordenada"+lista2.toString());
    }

    /**
     * Metodo para insertar datos en un arrayList, le pasamos por paramentros el arrayList y el numero que deseamos introducir
     * @param lista
     * @param num
     */
    public static void agregarNumero(List<Integer> lista,int num){
        lista.add(num);
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
    public static void  fusión(List <Integer> lista, List <Integer> tonta){

        union.addAll(lista);
        union.addAll(tonta);

    }

}
