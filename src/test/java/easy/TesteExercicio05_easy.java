package easy;

import easy.Exercicio_05_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio05_easy {

    static Exercicio_05_easy ex05_easy;

    @BeforeClass
    public static void beforeClass(){
        ex05_easy = new Exercicio_05_easy();
    }

    @Test
    public void testSoma(){
        int valorEsperado = 15;
        int valorAtual = ex05_easy.soma(5, 5, 5);

        Assert.assertEquals("Valor esperado, diferente do atual", valorEsperado, valorAtual);
    }

    @Test
    public void testSubtracao(){
        int valorEsperado = 6;
        int valorAtual = ex05_easy.subtracao(10, 2, 2);

        Assert.assertEquals("Valor esperado, diferente do atual", valorEsperado, valorAtual);
    }

    @Test
    public void testMultiplicacao(){
        int valorEsperado = 8;
        int valorAtual = ex05_easy.multiplicacao(2, 2, 2);

        Assert.assertEquals("Valor esperado, diferente do atual", valorEsperado, valorAtual);
    }

    @Test
    public void testMedia(){
        int soma = ex05_easy.soma(10, 2, 3);
        int valorAtual = ex05_easy.media(soma);
        int valorEsperado = 5;

        Assert.assertEquals("Valor esperado, diferente do atual", valorEsperado, valorAtual);
    }
}
