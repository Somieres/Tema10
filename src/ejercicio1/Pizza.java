package ejercicio1;

enum TamaNoPizza{MEDIANA, FAMILIAR}


public class Pizza extends Pizzeria{

    protected TamaNoPizza tamanno;
    protected static int contPizzaPedida=0;
    protected static int contPizzaServida=0;

    public Pizza(Tipo tipo, Estado estadoPedido, TamaNoPizza tamanno) {
        super(tipo, estadoPedido);
        this.tamanno = tamanno;
        contPizzaPedida++;
    }

    @Override
    public void servir() {
        super.servir();
        contPizzaServida++;
        contPizzaPedida--;
    }

    @Override
    public String toString() {
        return "La pizza pedia es: " + super.toString()+ " y el tamaño es " + this.tamanno;
    }
}
