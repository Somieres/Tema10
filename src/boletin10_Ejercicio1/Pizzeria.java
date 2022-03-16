package boletin10_Ejercicio1;
enum Tipo {MARGARITA,CUATROQUESOS,FUNGHI}
enum Estado {PEDIDA, SERVIDA}

 public class Pizzeria {

    protected Tipo tipo;
    protected Estado estadoPedido;
    protected static int contPedidos=0;
     protected static int contServidos=0;

     public Pizzeria(Tipo tipo, Estado estadoPedido) {
         this.tipo = tipo;
         this.estadoPedido = estadoPedido;
         contPedidos++;
     }

     public Tipo getTipo() {
         return tipo;
     }

     public void setTipo(Tipo tipo) {
         this.tipo = tipo;
     }

     public Estado getEstadoPedido() {
         return estadoPedido;
     }

     public void setEstadoPedido(Estado estadoPedido) {
         this.estadoPedido = estadoPedido;
     }

     public void servir(){
       this.estadoPedido=Estado.SERVIDA;
       contPedidos--;
       contServidos++;
   }

     @Override
     public String toString() {
         return "Pizzeria{" +
                 "tipo=" + tipo +
                 ", estadoPedido=" + estadoPedido +
                 '}';
     }
 }
