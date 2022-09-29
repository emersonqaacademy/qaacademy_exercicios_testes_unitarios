package easy;

import javax.swing.*;
import java.text.DecimalFormat;

public class Execucao_exercicios_easy {

    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercicio a ser executado: "));

        if (selecionaExercicio == 2){
            Exercicio_02_easy ex02_easy = new Exercicio_02_easy();
            //String palavra = ex02_easy.retornaPalavra(JOptionPane.showInputDialog("Digite uma palavra: "));
            String palavra = ex02_easy.retornaPalavra("teste.com");
            System.out.println(palavra);
        }

        if (selecionaExercicio == 3){
            Exercicio_03_easy ex03_easy = new Exercicio_03_easy();
            String primeiroNome = "Farofa";
            String segundoNome = "Arroz";

            System.out.println(ex03_easy.retornaValorTroca(primeiroNome, segundoNome));
        }

        if (selecionaExercicio == 4){
            Exercicio_04_easy ex04_easy = new Exercicio_04_easy();
            int numeroDigitado = 5;
            int dobroCalculado = ex04_easy.calcularDobro(numeroDigitado);
            System.out.println("O dobro de " + numeroDigitado + " é = " + dobroCalculado);
        }

        if (selecionaExercicio == 5){
            Exercicio_05_easy ex05_easy = new Exercicio_05_easy();
            int primeiroNumero = 10;
            int segundoNumero = 20;
            int terceiroNumero = 30;

            System.out.println("A soma dos numeros inseridos é: " + ex05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero));
            System.out.println("A subtracao dos numeros inseridos é: " + ex05_easy.subtracao(primeiroNumero, segundoNumero, terceiroNumero));
            System.out.println("A multiplicacao dos numeros inseridos é: " + ex05_easy.multiplicacao(primeiroNumero, segundoNumero, terceiroNumero));
            int soma = ex05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero);
            System.out.println("A media dos numeros inseridos é: " + ex05_easy.media(soma));
        }

        if (selecionaExercicio == 6){
            Exercicio_06_easy ex06_easy = new Exercicio_06_easy();
            double primeiraNota = 6;
            double segundaNota = 5;
            System.out.println(ex06_easy.verificaAprovacao(primeiraNota, segundaNota));
        }

        if (selecionaExercicio == 7){
            Exercicio_07_easy ex07_easy = new Exercicio_07_easy();
            double salario = 2500.00;
            double calculoInss = ex07_easy.calculaValorInss(salario);
            System.out.println("O valor a ser pago de INSS é: R$ " + calculoInss);
        }

        if (selecionaExercicio == 8){
            Exercicio_08_easy ex08_easy = new Exercicio_08_easy();
            double salario = 3000.00;
            double impostoDeRenda = ex08_easy.calculaImpostoDeRenda(salario);
            double salarioLiquido = ex08_easy.calculaSalarioLiquido(salario, impostoDeRenda);
            System.out.println("O imposto de renda sera: " + ex08_easy.calculaImpostoDeRenda(salario));
            System.out.println("O salario liquido sera: " + salarioLiquido);
        }

        if (selecionaExercicio == 9){
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 10:"));
            Exercicio_09_easy ex09_easy = new Exercicio_09_easy();
            ex09_easy.calculaTabuada(numeroDigitado);
        }

        if (selecionaExercicio == 10){
            double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor investido: "));
            DecimalFormat df = new DecimalFormat("#,###.##");

            Exercicio_10_1_easy ex10_easy = new Exercicio_10_1_easy();
            double valorJuros = ex10_easy.calculaJuros(valorInvestimento);
            String valorTotal = df.format(ex10_easy.totalComJuros(valorJuros, valorInvestimento));
            System.out.println("Valor investido: R$" + valorInvestimento + "\n" + "Valor juros: " + df.format(valorJuros));
            System.out.println("Valor total com juros: R$" + valorTotal);
        }

        if (selecionaExercicio == 11){
            int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
            Exercicio_11_easy ex11_easy = new Exercicio_11_easy();
            System.out.println("O total somado é: " + ex11_easy.somaAlgoritmo(numeroDigitado));
        }
        else if(selecionaExercicio > 11){
            System.out.println("Esse exercicio ainda não existe");
        }
    }
}