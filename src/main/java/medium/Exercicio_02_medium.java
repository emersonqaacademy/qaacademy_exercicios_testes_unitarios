package medium;

public class Exercicio_02_medium {
    public double calculaInvestimentoJurosCompostos(double valorInvestimento) {
        double taxaJuros = 0.05, totalAtualizadoComJuros;
        int i = 1, tempoInvestido = 10;
        totalAtualizadoComJuros = valorInvestimento;

        while (i <= tempoInvestido) {
            totalAtualizadoComJuros = (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
            i++;
        }
        return totalAtualizadoComJuros - valorInvestimento;
    }

    public double calculaValorTotalInvestimento(double valorInvestimento, double valorJuros) {
        return valorInvestimento + valorJuros;
    }
}
