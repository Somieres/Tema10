package boletin10_Ejercicio1;
enum Tipo {MARGARITA,CUATROQUESOS,FUNGHI}
enum Estado {PEDIDA, SERVIDA}

 public class Pizzeria {

    private Tipo tipo;
    private Estado estadoPedido;
     static int contPedidos=0;
     static int contServidos=0;

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

       contServidos++;
   }

     @Override
     public String toString() {
         return "La pizza " + "tipo=" + tipo +
                 ", estadoPedido=" + estadoPedido +
                 '}';
     }
 }
