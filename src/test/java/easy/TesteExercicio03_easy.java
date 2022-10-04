package easy;

import easy.Exercicio_03_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteExercicio03_easy {

    @Test
    public void testRetornaValorTrocado(){
        Exercicio_03_easy ex03_easy = new Exercicio_03_easy();
        String msgEsperada = "Primeiro valor digitado: segundoValor\nSegundo valor digitado: primeiroValor";
        String msgAtual = ex03_easy.retornaValorTroca("primeiroValor", "segundoValor");

        Assert.assertEquals("Valor diferente do esperado", msgEsperada, msgAtual);
    }
}
