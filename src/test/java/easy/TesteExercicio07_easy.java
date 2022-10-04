package easy;

import easy.Exercicio_07_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio07_easy {

    static Exercicio_07_easy ex07_easy;
    static DecimalFormat df;

    @BeforeClass
    public static void beforeClass(){
        ex07_easy = new Exercicio_07_easy();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeSalarioPrimeiraFaixa(){
        String valorEsperado = "78,38";
        String valorAtual = df.format(ex07_easy.calculaValorInss(1045.00));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioSegundaFaixaPrimeiraCondicao(){
        String valorEsperado = "94,05";
        String valorAtual = df.format(ex07_easy.calculaValorInss(1045.01));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioSegundaFaixaSegundaCondicao(){
        String valorEsperado = "188,06";
        String valorAtual = df.format(ex07_easy.calculaValorInss(2089.60));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioTerceiraFaixaPrimeiraCondicao(){
        String valorEsperado = "250,75";
        String valorAtual = df.format(ex07_easy.calculaValorInss(2089.61));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioTerceiraFaixaSegundaCondicao(){
        String valorEsperado = "376,13";
        String valorAtual = df.format(ex07_easy.calculaValorInss(3134.40));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuartaFaixaPrimeiraCondicao(){
        String valorEsperado = "438,82";
        String valorAtual = df.format(ex07_easy.calculaValorInss(3134.41));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuartaFaixaSegundaCondicao(){
        String valorEsperado = "854,15";
        String valorAtual = df.format(ex07_easy.calculaValorInss(6101.06));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioQuintaFaixa(){
        String valorEsperado = "854,15";
        String valorAtual = df.format(ex07_easy.calculaValorInss(6101.07));

        Assert.assertEquals("Valor diferente do esperado", valorEsperado, valorAtual);
    }

}
