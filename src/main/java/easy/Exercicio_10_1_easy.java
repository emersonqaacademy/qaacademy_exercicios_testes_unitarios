package easy;

public class Exercicio_10_1_easy {

    public double calculaJuros(double valorInvestimento){
        int ano = 1;
        double taxaJuros = 0.05, valorJuros = 0;

        while (ano <=10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano++;
        }
        return valorJuros;
    }
    public double totalComJuros(double valorJuros, double valorInvestimento){
        double valorTotal = valorJuros + valorInvestimento;
        return valorTotal;
    }

}
