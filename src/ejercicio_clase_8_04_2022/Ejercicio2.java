package ejercicio_clase_8_04_2022;

import java.util.*;

public class Ejercicio2 {

    /**
     * 2. Crear una colección de 20 números enteros aleatorios distintos y menores que 100.
     * Guardarlos por orden decreciente a medida que se vayan generando y mostrar la
     * colección por pantalla. No usar Maps.
     */

    public static void main(String[] args) {


        List<Integer> listaNumeros = new ArrayList<>();

        Integer numero = 0;
        int i = 1;
        numero = (int) (Math.random() * 100);
        listaNumeros.add(numero);
        while (i < 20) {

            numero = (int) (Math.random() * 100);
            listaNumeros.add(numero);

            Collections.sort(listaNumeros);

           /* if (listaNumeros.get(i - 1) == listaNumeros.get(i)) {
                listaNumeros.remove(i);
                listaNumeros.add( i, (int) (Math.random() * 100));

            }*/
            Collections.reverse(listaNumeros);
            i++;
        }

        System.out.println(listaNumeros);
    }


}
