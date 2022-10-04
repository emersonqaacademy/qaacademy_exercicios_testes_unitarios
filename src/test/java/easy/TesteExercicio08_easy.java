package easy;

import easy.Exercicio_08_easy;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;

public class TesteExercicio08_easy {

    static Exercicio_08_easy ex08_easy;
    static DecimalFormat df;

    @BeforeClass
    public static void before(){
        ex08_easy = new Exercicio_08_easy();
        df = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeCalculaImpostoPrimeiraFaixa(){
        String valorEsperado = "0.0";
        Double valorAtual = ex08_easy.calculaImpostoDeRenda(1903.98);

        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }

    @Test
    public void testeCalculaImpostoSegundaFaixaPrimeiraCondicao(){
        String valorEsperado = "0.0";
        Double valorAtual = (ex08_easy.calculaImpostoDeRenda(1903.99));

        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }

    @Test
    public void testeCalculaImpostoSegundaFaixaSegundaCondicao(){
        String valorEsperado = "69,20";
        String valorAtual = df.format((ex08_easy.calculaImpostoDeRenda(2826.65)));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeCalculaImpostoTerceiraFaixaPrimeiraCondicao(){
        String valorEsperado = "69,20";
        String valorAtual = df.format((ex08_easy.calculaImpostoDeRenda(2826.66)));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeCalculaImpostoTerceiraFaixaSegundaCondicao(){
        String valorEsperado = "207,86";
        String valorAtual = df.format((ex08_easy.calculaImpostoDeRenda(3751.05)));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeCalculaImpostoQuartaFaixaPrimeiraCondicao(){
        String valorEsperado = "207,86";
        String valorAtual = df.format((ex08_easy.calculaImpostoDeRenda(3751.06)));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeCalculaImpostoQuartaFaixaSegundaCondicao(){
        String valorEsperado = "413,42";
        String valorAtual = df.format((ex08_easy.calculaImpostoDeRenda(4664.68)));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeCalculaImpostoQuintaFaixa(){
        String valorEsperado = "413,43";
        String valorAtual = df.format((ex08_easy.calculaImpostoDeRenda(4664.69)));

        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeCalculaSalarioLiquido(){
        String valorEsperado = "1.992,80";
        String valorAtual = df.format((ex08_easy.calculaSalarioLiquido(2000.00, ex08_easy.calculaImpostoDeRenda(2000.00))));

        Assert.assertEquals(valorEsperado, valorAtual);
    }
}
