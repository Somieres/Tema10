package ejercicio_clase_8_04_2022;

import java.util.*;

public class Ejercicio2{

    /**
     * 2. Crear una colección de 20 números enteros aleatorios distintos y menores que 100.
     * Guardarlos por orden decreciente a medida que se vayan generando y mostrar la
     * colección por pantalla. No usar Maps.
     */

    public static void main(String[] args) {


        Set<Integer> listaNumeros = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        Integer numero = 0;
        int i = 1;
        numero = (int) (Math.random() * 100);
        listaNumeros.add(numero);
        while (i < 20) {

            numero = (int) (Math.random() * 100);
            listaNumeros.add(numero);

            i++;
        }

        System.out.println(listaNumeros);
    }


}
