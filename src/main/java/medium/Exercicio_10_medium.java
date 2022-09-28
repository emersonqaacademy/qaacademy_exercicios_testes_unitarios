package medium;

public class Exercicio_10_medium {

    public static void main(String[] args) {
        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i < 10; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            System.out.println(fibonacci[i]);
        }
    }

    public String testeMetodo(){
        return null;
    }
}

