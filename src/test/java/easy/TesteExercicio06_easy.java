package easy;

import easy.Exercicio_06_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio06_easy {

    static Exercicio_06_easy ex06_easy;

    @BeforeClass
    public static void beforeClass(){
        ex06_easy = new Exercicio_06_easy();
    }

    @Test
    public void testAprovado(){
        String msgAtual = ex06_easy.verificaAprovacao(6, 6);
        String msgEsperada = "Voce esta Aprovado";

        Assert.assertEquals("Valor diferente do esperado", msgEsperada, msgAtual);
    }

    @Test
    public void testReprovado(){
        String msgAtual = ex06_easy.verificaAprovacao(4, 4);
        String msgEsperada = "Voce esta Reprovado";

        Assert.assertEquals("Valor diferente do esperado", msgEsperada, msgAtual);
    }

    @Test
    public void testExame(){
        String msgAtual = ex06_easy.verificaAprovacao(5, 5);
        String msgEsperada = "Ficou para exame";

        Assert.assertEquals("Valor diferente do esperado", msgEsperada, msgAtual);
    }
}
