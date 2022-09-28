package easy;

import javax.swing.*;

public class Exercicio_11_easy {

    public int somaAlgoritmo(int numeroDigitado){
        int i = 1;

        while (i <= 100) {

            numeroDigitado = numeroDigitado + 2;
            System.out.println(numeroDigitado);
            i++;
        }
        return numeroDigitado;
    } // Fim enquanto

}