package boletin10_Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzeriaTest {


     @Test
    void servir() {

         Pizzeria papaFritaPizzeria=new Pizzeria(Tipo.CUATROQUESOS,Estado.PEDIDA);
        int contadorAntes=Pizzeria.contServidos;
        papaFritaPizzeria.servir();
        assertEquals(contadorAntes++,Pizzeria.contServidos,"ESTA MAL");

    }
}