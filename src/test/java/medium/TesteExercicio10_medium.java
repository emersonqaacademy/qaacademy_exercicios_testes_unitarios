package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio10_medium {

    static Exercicio_10_1_medium ex10_1_medium;
    static long[] fibonnaciEsperado;

    @BeforeClass
    public static void beforeClass(){
        ex10_1_medium = new Exercicio_10_1_medium();
        fibonnaciEsperado = new long[10];

        fibonnaciEsperado[0] = 0;
        fibonnaciEsperado[1] = 1;
        fibonnaciEsperado[2] = 1;
        fibonnaciEsperado[3] = 2;
        fibonnaciEsperado[4] = 3;
        fibonnaciEsperado[5] = 5;
        fibonnaciEsperado[6] = 8;
        fibonnaciEsperado[7] = 13;
        fibonnaciEsperado[8] = 21;
        fibonnaciEsperado[9] = 34;
    }

    @Test
    public void testFibonnaci(){
        Assert.assertArrayEquals(fibonnaciEsperado, ex10_1_medium.calculaTermoFibonacci(10));
    }

    @Test
    public void testImprimeVetor(){
        ex10_1_medium.imprimeVetor(fibonnaciEsperado);
    }
}
