package medium;

import javax.swing.*;
public class Exercicio_05_medium {

    public int verificaMenorNumero() {
        int numeroDigitado, i = 1, menorNumero = 0;

        while(i <= 5){
            numeroDigitado = lerNumeroDigitado();
            if (numeroDigitado < menorNumero || i == 1){
                menorNumero = numeroDigitado;
            }
            i++;
        }
        return menorNumero;
    }

    private int lerNumeroDigitado(){
        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        return numeroDigitado;
    }
}
