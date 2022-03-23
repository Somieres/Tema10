import Ejercicio4.Metodos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjerciciosClase {

    public static int[] num1={1,4,8,12,45,0,7,32,62,78,18};
    public static int[] num2={1,4,8,12,45,0,7,32,62,78,18};
    public static int[] num3={1,4,8,12,45,0,7,32,62,78,18};
    public static int[] num4={1,2,4,6,7,8,9,10,11};
    public static char[] letras ={'a','c','d','e','f','g','h','i','j'};

    public static void main(String[] args) {

        //imprimimos el array entero
        System.out.println(Arrays.toString(num1));

        Arrays.fill(num1,-4);
        System.out.println(Arrays.toString(num1));

        // con este metodo podemos darle un valor desde una posicion de inicio hasta una final
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

        //

        char[] letras2= Arrays.copyOf(letras,letras.length+10);
        System.out.println(Arrays.toString(letras));
         System.out.println("Copia de letras a letras2 y le aumentamos 10 posiciones");
        System.out.println(Arrays.toString(letras2));
        System.out.println(Arrays.binarySearch(letras,'h'));
        Arrays.fill(letras2,letras.length, letras2.length,'~');

        Arrays.sort(letras2);
        System.out.println(Arrays.toString(letras2));
        System.out.println(Arrays.binarySearch(letras2,'h'));


        System.out.println(Arrays.toString(num4));
       introducirLetra(num4,3);
       System.out.println(Arrays.toString(num1));

    }

    /**
     * a traves de este metodo lo que queremos hacer es introducir un caracter en la posicion correspondiente
     * para ello hemos creado un bucle for en el que le hemos indicado, que cuando el caracter sea mayor
     * que el que le hemos introducido por parametros, ese se guarde en una variable local, damos el valor del
     * caracter a la posicion indicada y el caracter que se encontraba en esa posicion pase a la posicion siguiente
     * @param num4
     * @param numero
     */
   public static void introducirLetra(int[] array, int numero){

        int posicion=0;
        int aux;

        for (int i=0;i<array.length-1;i++){
            for (int j = 0; j < array.length; j++) {
                if (array[j]>numero){
                    aux=array[j];
                    array[j]=numero;
                    array[j+1]=aux;
            }


            }
        }

    }

}
