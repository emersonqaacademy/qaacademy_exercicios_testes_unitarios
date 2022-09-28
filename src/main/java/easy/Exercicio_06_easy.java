package easy;

public class Exercicio_06_easy { //Inicio algoritmo

    public String verificaAprovacao(double primeiraNota, double segundaNota) {
        double mediaNotas;
        mediaNotas = (primeiraNota + segundaNota) / 2;

        if (mediaNotas > 5) { //Inicio SE
            return ("Voce esta Aprovado");
        } // Fim SE
        else if (mediaNotas >=0 && mediaNotas < 5) {
            return("Voce esta Reprovado");
        }else {
            return("Ficou para exame");
        }
    }
} //Fim algoritmo
