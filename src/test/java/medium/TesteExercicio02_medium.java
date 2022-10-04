package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio02_medium {

    static Exercicio_02_medium ex02_medium;
    static DecimalFormat df;

    @BeforeClass
    public static void beforClass(){
        ex02_medium = new Exercicio_02_medium();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testCalculaJurosCompostos(){
        String valorEsperado = "628,89";
        String valorAtual = df.format(ex02_medium.calculaInvestimentoJurosCompostos(1000));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testCalculaValorTotal(){
        String valorEsperado = "1.628,89";
        double valorJuros = ex02_medium.calculaInvestimentoJurosCompostos(1000);
        String valorAtual = df.format(ex02_medium.calculaValorTotalInvestimento(1000, valorJuros));
        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
