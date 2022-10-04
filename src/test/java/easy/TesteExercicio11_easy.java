package easy;

import easy.Exercicio_11_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio11_easy {

    static Exercicio_11_easy ex11_easy;

    @BeforeClass
    public static void beforeClass(){
        ex11_easy = new Exercicio_11_easy();
    }

    @Test
    public void testeDoisMaisDois(){
        int valorEsperado = 210;
        int valorAtual = ex11_easy.somaAlgoritmo(10);

        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
