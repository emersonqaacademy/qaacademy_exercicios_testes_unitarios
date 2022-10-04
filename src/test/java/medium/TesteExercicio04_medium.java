package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio04_medium {

    static Exercicio_04_medium ex04_medium;

    @BeforeClass
    public static void beforClass(){
        ex04_medium = new Exercicio_04_medium();
    }

    @Test
    public void testMultiplicacaoAteMil(){
        ex04_medium.multiplicaNumerosAteMil();
    }
}
