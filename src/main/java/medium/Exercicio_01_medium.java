package medium;

public class Exercicio_01_medium { //Inicio algoritmo

    public void exibeParOuImpar(int valorInformado) {

        while (valorInformado <= 100) {
            if (valorInformado % 2 == 0) {
                System.out.println("Este numero:" + valorInformado + " é PAR");
            } else {
                System.out.println("Este numero:" + valorInformado + " é IMPAR");
            }
            valorInformado++;
        }
    }
} //Fim algoritmo - commit
