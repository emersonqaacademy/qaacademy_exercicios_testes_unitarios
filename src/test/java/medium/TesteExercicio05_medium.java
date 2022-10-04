package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio05_medium {

    static Exercicio_05_medium ex05_medium;

    @BeforeClass
    public static void beforClass(){
        ex05_medium = new Exercicio_05_medium();
    }

    @Test
    public void testVerificaMenorNumero(){
        int valorEsperado = 3;
        int valorAtual = ex05_medium.verificaMenorNumero();
        Assert.assertEquals("Valor diferente do informado", valorEsperado, valorAtual);
    }
}
