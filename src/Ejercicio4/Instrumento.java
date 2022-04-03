package Ejercicio4;

public abstract class Instrumento {

    protected final int MAXIMO_NOTAS = 100;
    protected int contadorNotas = 0;
    protected NotasMusicales[] notas = new NotasMusicales[MAXIMO_NOTAS];

    protected abstract void add(NotasMusicales nota);

    protected abstract void interpretar();
}



