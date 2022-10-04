package easy;

import easy.Exercicio_09_easy;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio09_easy {

    static Exercicio_09_easy ex09_easy;

    @BeforeClass
    public static void beforeClass(){
        ex09_easy = new Exercicio_09_easy();
    }

    @Test
    public void testeCalculaTabuada(){
        ex09_easy.calculaTabuada(5);
    }
}
