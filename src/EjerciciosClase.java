import Ejercicio4.Metodos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjerciciosClase {

    public static int[] num1={1,4,8,12,45,0,7,32,62,78,18};
    public static int[] num2={1,4,8,12,45,0,7,32,62,78,18};
    public static int[] num3={1,4,8,12,45,0,7,32,62,78,18};
    public static int[] num4={1,2,4,6,7,8,9,10,11};
    public static char[] letras ={'a','b','c','d','e','f','g','i','j'};

    public static void main(String[] args) {

        //imprimimos el array entero
        System.out.println(Arrays.toString(num1));


        // con este metodo podemos darle un valor desde una posicion de inicio hasta una final
        Arrays.fill(num1,-4);
        System.out.println(Arrays.toString(num1));


        Arrays.fill(num1,5,8,50);
        System.out.println(Arrays.toString(num1));

        // sirve para comparar dos arrays devuelve true o false, ver ejemplo;
        System.out.println(Arrays.equals(num2,num3));
        System.out.println(Arrays.equals(num2,num4));

        // para buscar un numero en un array ordenado, si no lo encuantra te da la posicion en la que deberia estar
        // y hay que restarle un -1 con un previo -Arrays, ver ejemplo
        System.out.println(Arrays.binarySearch(num4,4));
        System.out.println("El numero buscado no se encuentra en el array deberia estar en la posicion "+
                (-Arrays.binarySearch(num4,5)-1));



        char[] letras2= Arrays.copyOf(letras,letras.length+10);
        System.out.println(Arrays.toString(letras));
        System.out.println("Copia de letras a letras2 y le aumentamos 10 posiciones");
        System.out.println(Arrays.toString(letras2));
        System.out.println(Arrays.binarySearch(letras,'h'));
        Arrays.fill(letras2,letras.length, letras2.length,'~');
        Arrays.sort(letras2);
        System.out.println(Arrays.toString(letras2));
        System.out.println(-Arrays.binarySearch(letras2,'h')-1);

      int inicio= letras.length;

     introducirLetra(letras2,'h',inicio);
       System.out.println(Arrays.toString(letras2));
        System.out.println(Arrays.binarySearch(letras, 'a'));



    }


    /**
     * Este metodo lo que hace es que busca la posicion en la que deberia estar un caracter en este caso y corre un espacio a la derecha
     * para introducir el caracter deseado
     * @param array
     * @param letra
     * @param inicio
     */
      public static void introducirLetra(char [] array, char letra, int inicio ){


         int indicePosicion=(-Arrays.binarySearch(letras,'h')-1);


        for (int i=inicio-1;i>=indicePosicion;i--){
            array[i+1]=array[i];

        }
        array[indicePosicion]=letra;
    }



}
