package Ejercicio4;

enum Notas{ DO,RE, MI,FA, SOL, LA, SI}

abstract public class Instrumento {

    //atributos


    protected final int MAXIMO_NOTAS = 100;
    protected Notas[] notasMusicales = new Notas[MAXIMO_NOTAS];
    static int numNotas=0;

    /**
     * Método que añade notas al array de notas definido para el instrumento.
     * Validará que no hemos llegado a la capacidad máxima del array notasMusicales
     *
     * Precondición: La nota debe estar definida en el enum
     * Postcondición: Ninguna
     * @param nota nota que se introduce
     */
    public void add(Notas nota){

        if (numNotas < notasMusicales.length){
            notasMusicales[numNotas]=nota;
            numNotas++;



        }else {
            System.out.println("No se pueden meter más notas!");
        }

    }


}