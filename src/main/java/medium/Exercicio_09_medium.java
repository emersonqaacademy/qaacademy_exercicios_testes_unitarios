package medium;

import javax.swing.*;

public class Exercicio_09_medium {

    public void recebeImprimeNomeNumeroAluno() {

        String[] nomeAlunosVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];
        int i = 0;

        while (i < 5) {
            nomeAlunosVetor[i] = recebeAluno();
            numeroAlunosVetor[i] = recebeNumeroAluno();
            i++;
        }
        imprimeNomeENumero(nomeAlunosVetor, numeroAlunosVetor);
    }

    public void imprimeNomeENumero(String[] vetorNomes, int[] vetorNumeros) {
        int i = 0;
        while (i < 5) {
            System.out.println("Nome do aluno: " + vetorNomes[i] + " - Numero do aluno: " + vetorNumeros[i]);
            i++;
        }
    }

    public int recebeNumeroAluno() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno: "));
    }

    public String recebeAluno() {
        return JOptionPane.showInputDialog("Digite o nome do aluno: ");
    }
}
