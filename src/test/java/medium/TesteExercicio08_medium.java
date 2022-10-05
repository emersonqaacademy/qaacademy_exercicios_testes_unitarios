package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio08_medium {

    static Exercicio_08_medium ex08_medium;
    static String[] vetorMesesEsperado;

    @BeforeClass
    public static void before(){
        ex08_medium = new Exercicio_08_medium();
        vetorMesesEsperado = new String[12];

        vetorMesesEsperado[0] = "Janeiro";
        vetorMesesEsperado[1] = "Fevereiro";
        vetorMesesEsperado[2] = "Março";
        vetorMesesEsperado[3] = "Abril";
        vetorMesesEsperado[4] = "Maio";
        vetorMesesEsperado[5] = "Junho";
        vetorMesesEsperado[6] = "Julho";
        vetorMesesEsperado[7] = "Agosto";
        vetorMesesEsperado[8] = "Setembro";
        vetorMesesEsperado[9] = "Outubro";
        vetorMesesEsperado[10] = "Novembro";
        vetorMesesEsperado[11] = "Dezembro";
    }

    @Test
    public void testeCriaVetorMeses() {
        String[] valorAtual = ex08_medium.criaVetorMeses();
        Assert.assertArrayEquals(vetorMesesEsperado, ex08_medium.criaVetorMeses());
    }

    @Test
    public void imprimeVetorMeses(){
        ex08_medium.imprimeValorVetor(vetorMesesEsperado);
    }
}
