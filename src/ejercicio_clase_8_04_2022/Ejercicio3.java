package ejercicio_clase_8_04_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio3 {
    /**
     * 3. Repetir el ejercicio anterior pero esta vez permitiendo números repetidos y
     * seleccionando números aleatorios menores que 10. No usar Maps
     */

    public static void main(String[] args) {
        List<Integer> listaNumeros=new ArrayList<>();

        Integer numero;
        numero=(int)(Math.random()*10);
        listaNumeros.add(numero);
        int i=0;
        while (i<20){

            numero=(int)(Math.random()*10);
            listaNumeros.add(numero);
            Collections.sort(listaNumeros);
            Collections.reverse(listaNumeros);
            i++;
        }
        System.out.println(listaNumeros);
    }
}
