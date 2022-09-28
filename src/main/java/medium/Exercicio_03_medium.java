package medium;

public class Exercicio_03_medium { //Inicio Algoritmo


    public void somarNumerosAcumulados() {
        int i = 0 , soma = 0;
        while (i<1000){ //Inicio enquanto
            soma = soma+i;
            System.out.println(soma);
            i++;
            if (soma >= 1500){ //Inicio SE
                break;
            }//Fim SE
        }//Fim enquanto

    }
} //Fim algoritmo
