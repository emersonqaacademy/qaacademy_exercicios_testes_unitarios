package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio03_medium {
    static Exercicio_03_medium ex03_medium;

    @BeforeClass
    public static void beforClass(){
        ex03_medium = new Exercicio_03_medium();
    }

    @Test
    public void testSomaDosNumeros(){
        ex03_medium.somarNumerosAcumulados();
    }
}
