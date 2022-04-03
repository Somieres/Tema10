package Ejercicio4;

public class Campana extends Instrumento {

    /**
     * Metodo constructor
     */
    public Campana() {
        super();
    }

    @Override
    /**
     * Metodo para añadir las notas musicales hasta un maximo de 100 en el array
     */
    public void add(NotasMusicales nota){
        if (contadorNotas<MAXIMO_NOTAS){
            this.notas[this.contadorNotas] = nota;
            this.contadorNotas++;
        }else System.out.println("No se pueden introducir más notas");
    }

    @Override
    /**
     * Metodo para interpretar las notas
     */
    public void interpretar() {
        StringBuilder interpretacion = new StringBuilder();
        interpretacion.append(System.lineSeparator());
        for (int i = 0; i < this.notas.length; i++) {
            if (notas[i] != null) {
                switch (notas[i]) {
                    case DO:
                        interpretacion.append("Ton ");
                        break;
                    case RE:
                        interpretacion.append("Tan ");
                        break;
                    case MI:
                        interpretacion.append("Tin ");
                        break;
                    case FA:
                        interpretacion.append("Taan ");
                        break;
                    case SOL:
                        interpretacion.append("Tooon ");
                        break;
                    case LA:
                        interpretacion.append("Pam ");
                        break;
                    case SI:
                        interpretacion.append("Piim ");
                        break;
                }
            }
        }
        interpretacion.append(System.lineSeparator());
        System.out.println(interpretacion);
    }
}
