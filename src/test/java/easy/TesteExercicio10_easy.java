package easy;

import easy.Exercicio_10_1_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio10_easy {

    static Exercicio_10_1_easy ex_10_1_easy;
    static DecimalFormat df;

    @BeforeClass
    public static void beforeClass(){
        ex_10_1_easy = new Exercicio_10_1_easy();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testCalculaValorJuros(){
        String valorEsperado = "666,50";
        String valorAtual = df.format(ex_10_1_easy.calculaJuros(1333.00));

        Assert.assertEquals("Valor divergente", valorEsperado, valorAtual);
    }

    @Test
    public void testTotalComJuros(){
        String valorEsperado = "1.999,50";
        double valorJuros = ex_10_1_easy.calculaJuros(1333.00);
        String valorAtual = df.format(ex_10_1_easy.totalComJuros(valorJuros, 1333.00));

        Assert.assertEquals("Valor divergente", valorEsperado, valorAtual);
    }
}
