package Ejercicio4;

import java.util.Scanner;

public class Metodos {

        public static Scanner sc = new Scanner(System.in);
        private static final int MIN_MENU = 0;
        private static final int MAX_MENUS = 2;
        private static final int MIN_MENU_INST = 1;
        private static final int MAX_MENU_NOTAS = 7;

        /**
         * Metodo que sirve para verificar el funcionamiento del programa
         */
        public static void inicio(){


            int opcion,tipoInstrumento;
            NotasMusicales[] notas = introducirValorNotas();
            Piano piano = new Piano();
            Campana campana = new Campana();
            do {
                System.out.print(mostrarMenu());
                opcion = validarNumero(MIN_MENU, MAX_MENUS);
                System.out.print(preguntarTipoInstrumento());
                tipoInstrumento = validarNumero(MIN_MENU_INST, MAX_MENUS);
                switch (opcion){
                    case (1):
                        aumentoNotas(tipoInstrumento,notas, piano,campana);
                        break;

                    case (2):
                        interpretacion(tipoInstrumento,piano,campana);
                        break;
                }
            }while (opcion!=0);
        }

        /**
         * Metodo para mostrar el menu
         * @return
         */
        public static String mostrarMenu(){
            return  "¿Que desea hacer?" + System.lineSeparator() +
                    "1 - Insertar notas." + System.lineSeparator() +
                    "2 - Interpretar notas." + System.lineSeparator() +
                    "0 - Salir"+ System.lineSeparator();
        }

        /**
         * Metodo para mostrar los instrumentos disponible
         * @return
         */
        public static String preguntarTipoInstrumento(){
            return  "¿Que intrumento desea tocar?" + System.lineSeparator() +
                    "1 - Piano." + System.lineSeparator() +
                    "2 - Campana." + System.lineSeparator();
        }

        /**
         * Mostramos las notas a elegir
         * @return
         */
        public static String elegirNota(){
            return "Las notas musicales son: " + System.lineSeparator() +
                    "1 - Do." + System.lineSeparator() +
                    "2 - Re." + System.lineSeparator() +
                    "3 - Mi." + System.lineSeparator() +
                    "4 - Fa." + System.lineSeparator() +
                    "5 - Sol." + System.lineSeparator() +
                    "6 - La." + System.lineSeparator() +
                    "7 - Si." + System.lineSeparator() +
                    "0 - Salir." + System.lineSeparator();


        }


        public static NotasMusicales[] introducirValorNotas(){
            NotasMusicales[] notas = new NotasMusicales[ MAX_MENU_NOTAS];
            notas[0] = NotasMusicales.DO;
            notas[1] = NotasMusicales.RE;
            notas[2] = NotasMusicales.MI;
            notas[3] = NotasMusicales.FA;
            notas[4] = NotasMusicales.SOL;
            notas[5] = NotasMusicales.LA;
            notas[6] = NotasMusicales.SI;
            return notas;
        }

        /**
         * Metodo para aumentar el numero de notas
         * @param tipoInstrumento
         * @param notas
         * @param piano
         * @param campana
         */
        public static void aumentoNotas(int tipoInstrumento,NotasMusicales[] notas,Piano piano,Campana campana){


            int nota;

            do {
                nota=pedirNota();
                if (nota!=-1){
                    switch (tipoInstrumento){
                        case (1):
                            piano.add(notas[nota]);
                            break;

                        case (2):
                            campana.add(notas[nota]);
                            break;
                    }
                }
            }while (nota != -1);
        }


        /**
         * Metodo para pedir nota, el -1 es para que de la posicion correcta de la nota elegida,
         * ya que se cuenta desde la posicion 0
         * @return
         */
        public static int pedirNota(){
            System.out.print(elegirNota());
            int nota = validarNumero(MIN_MENU, MAX_MENU_NOTAS);
            return nota-1;
        }

        /**
         * Metodo para interpretar las opciones elegidas por el usuario
         * @param tipoInstrumento
         * @param piano
         * @param campana
         */
        public static void interpretacion(int tipoInstrumento, Piano piano, Campana campana){
            switch (tipoInstrumento){
                case (1):
                    piano.interpretar();
                    break;

                case (2):
                    campana.interpretar();
                    break;
            }
        }

    /**
     * validacion de datos
     * @param minimo
     * @param maximo
     * @return
     */
        public static int validarNumero(int minimo,int maximo){
            int numero = 0;
            do {
                try {
                    numero=sc.nextInt();
                    if (numero<minimo || numero > maximo){
                        System.out.print("Introduzca valores entre " + minimo + " y " + maximo);
                    }
                }catch (Exception e){
                    System.out.print("Introduzca un valor valido: ");
                    sc.nextLine();
                }
            }while (numero<minimo || numero > maximo);
            return numero;
        }



}
