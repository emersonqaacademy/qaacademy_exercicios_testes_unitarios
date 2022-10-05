package medium;

import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio09_medium {

    static Exercicio_09_medium ex09_medium;

    @BeforeClass
    public static void beforeClass(){
        ex09_medium = new Exercicio_09_medium();
    }

    @Test
    public void testRecebeNumeroAluno(){
        ex09_medium.recebeNumeroAluno();
    }

    @Test
    public void testRecebeImprimeNomeENumero(){
        ex09_medium.recebeImprimeNomeNumeroAluno();
    }

    @Test
    public void testRecebeNomeAluno(){
        ex09_medium.recebeAluno();
    }

}
