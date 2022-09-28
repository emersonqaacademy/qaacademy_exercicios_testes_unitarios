package easy;

import javax.swing.*;

public class Exercicio_10_easy {//Inicio algoritmo

    static double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
    public static void main(String[] args) {

        valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor:"));
        valorJuros = (10 * taxaJuros) * valorInvestimento;
        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor investido R$" + valorInvestimento);
        System.out.println("Valor juros R$"+ valorJuros);
        System.out.println("Valor Total com juros R$" + valorTotal);
    }
} //Fim algoritmo
