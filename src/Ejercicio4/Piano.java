package Ejercicio4;

public class Piano extends Instrumento{


        public Piano() {
            super();
        }

        @Override
        /**
         * Metodo para insertar en el array las notas musicales hasta un maximo de 100
         */
        public void add(NotasMusicales nota){
            if (contadorNotas<MAXIMO_NOTAS){
                this.notas[this.contadorNotas] = nota;
                this.contadorNotas++;
            }else System.out.println("No se pueden introducir más notas");
        }

        @Override
        /**
         * Metodo para interpretar las notas musicales
         */
        public void interpretar() {
            StringBuilder interpretacion = new StringBuilder();
            interpretacion.append(System.lineSeparator());
            for (int i = 0; i < this.notas.length; i++) {
                if (notas[i] != null){
                    switch (notas[i]){
                        case DO:
                            interpretacion.append("Pon ");
                            break;

                        case RE:
                            interpretacion.append("Pin ");
                            break;

                        case MI:
                            interpretacion.append("Pen ");
                            break;

                        case FA:
                            interpretacion.append("Pan ");
                            break;

                        case SOL:
                            interpretacion.append("Poon ");
                            break;

                        case LA:
                            interpretacion.append("Paan ");
                            break;

                        case SI:
                            interpretacion.append("Piin ");
                            break;
                    }
                }
            }
            interpretacion.append(System.lineSeparator());
            System.out.println(interpretacion);
        }


}
