package boletin10_Ejercicio1;

enum TamannoPaninni{ALMERIA, GRANADA, SEVILLA}
public class Paninni extends Pizzeria{


    protected TamannoPaninni tamaño;
    protected static int contPaninniPedido=0;
    protected static int contPaninniServido=0;



    public Paninni(Tipo tipo, Estado estadoPedido, TamannoPaninni tamaño) {
        super(tipo, estadoPedido);
        this.tamaño = tamaño;
        contPaninniPedido++;
    }

    public Paninni(Tipo tipo, Estado estadoPedido) {
        super(tipo, estadoPedido);
        contPaninniPedido++;
    }

    @Override
    public void servir() {
        super.servir();
        contPaninniServido++;
        contPaninniPedido--;
    }

    @Override
    public String toString() {
        return "La pizza pedia es: " + super.toString()+ " y el tamaño es " + this.tamaño;
    }
}
