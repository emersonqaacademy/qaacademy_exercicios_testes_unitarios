package medium;

public class Exercicio_10_1_medium {


    public int[] calculaTermoFibonacci(int elemento) {

        int i = 2;
        int fibonacci[] = new int[elemento];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }

        return fibonacci;
    }

    public void imprimeVetor(int[] vetor) {
        int i = 0;
        while (i < vetor.length) {
            System.out.println("Termo: " + (i + 1) + ", valor: " + vetor[i]);
            i++;
        }
    }
}
