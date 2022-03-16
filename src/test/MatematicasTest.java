package test;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pruebas.Matematicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatematicasTest {

    @org.junit.jupiter.api.Test
    void multiplicar() {
         double x=2;
         double y=2;
         double resultadoEsperado=4;
         double resultado = Matematicas.multiplicar(x,y);

         Assert.assertTrue("resultado incorrecto",resultadoEsperado==resultado);



    }

    @Test
    void suma() {
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void esPar() {

       int num=2;
       boolean resultadoEsperado=true;
       boolean resultado=Matematicas.esPar(num);


       assertEquals(resultado,resultadoEsperado,"resultado NO ESPERADO" );
     }

     @Test
    void esPar2() {

        int num=3;
        boolean resultadoEsperado=true;
        boolean resultado=Matematicas.esPar(num);

       // Assert.assertTrue("resultado NO ESPERADO",resultadoEsperado==resultado);
         assertEquals(resultado,resultadoEsperado,"resultado NO ESPERADO" );
    }



}