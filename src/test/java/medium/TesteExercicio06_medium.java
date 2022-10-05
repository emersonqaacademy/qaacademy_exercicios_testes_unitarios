package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio06_medium {
    static Exercicio_06_medium ex_06_medium;

    @BeforeClass
    public static void before() {
        ex_06_medium = new Exercicio_06_medium();
    }

    @Test
    public void testFatorial(){
        int valorEsperado = 120;
        int valorAtual = ex_06_medium.calculaFatorial(5);
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
