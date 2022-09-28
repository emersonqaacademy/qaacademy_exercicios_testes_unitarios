package medium;

public class Exercicio_04_medium {
    public void multiplicaNumerosAteMil() {
        int i = 1, resultadoMultiplicacao = 1;

        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao);
                if (resultadoMultiplicacao >= 1000) {
                    resultadoMultiplicacao = 1;
                    System.out.println("O resultado voltou a ser: " + resultadoMultiplicacao);
                }
            i++;
        }

    }
}
