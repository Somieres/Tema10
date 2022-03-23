package boletin10_Ejercicio1;

public class Main_Ejercicio1 {

    public static void main(String[] args) {
        // Se crean 3 Pizzas

        Pizza pizza1=new Pizza(Tipo.CUATROQUESOS, Estado.PEDIDA, TamaNoPizza.FAMILIAR);
        Pizza pizza2=new Pizza(Tipo.MARGARITA, Estado.PEDIDA, TamaNoPizza.MEDIANA);
        Pizza pizza3=new Pizza(Tipo.FUNGHI, Estado.PEDIDA, TamaNoPizza.FAMILIAR);

        // Creamos 2 paninnis

        Paninni paninni1=new Paninni(Tipo.CUATROQUESOS,Estado.PEDIDA, TamannoPaninni.ALMERIA);
        Paninni paninni2=new Paninni(Tipo.MARGARITA,Estado.PEDIDA, TamannoPaninni.SEVILLA);

        // servimos dos pizzas y 1 paninni

        pizza1.servir();
        pizza2.servir();
        paninni1.servir();

        // Imprimimos el resumen
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(paninni1);
        System.out.println(paninni2);
        System.out.println("El total de pizzas pedidas es: " +Pizza.contPizzaPedida);
        System.out.println("El total de pizzas servidas es: " +Pizza.contPizzaServida);
        System.out.println("El total de paninnis pedidos es: " + Paninni.contPaninniPedido);
        System.out.println("El total de paninnis pedidos es: " + Paninni.contPaninniServido);
       // System.out.println("El total de pedidos es "+ Pizzeria.contPedidos);
        System.out.println("El total de servidos es "+ Pizzeria.contServidos);
    }


}
