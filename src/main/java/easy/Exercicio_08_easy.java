package easy;

import javax.swing.*;

public class Exercicio_08_easy { //Inicio algoritmo
    public double calculaImpostoDeRenda(double salario) {

        double impostoRenda = 0;

        if (salario <= 1903.98){
            impostoRenda =  0;
        }
        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoRenda =  (salario * 0.075) - 142.79;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda =  (salario * 0.15) - 354.80;
        }
        if (salario >= 3751.06 && salario <= 4664.68){
            impostoRenda =  650.00;
        }
        if (salario > 4664.68) {
            impostoRenda =  (salario * 0.275) - 869.36;
        }
        return impostoRenda;
    }

    public double calculaSalarioLiquido(double salario, double impostoRenda){
        return salario - impostoRenda;
    }
} //Fim algoritmo
