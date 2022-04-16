import java.util.Scanner;

public class Exercicio2 {
    //2.  Escreva um programa que cria um vetor para armazenar 10 inteiros.
    // O programa deve solicitar que o usuário digite 10 números, que devem ser
    // armazenados nesse vetor.
    //O programa deverá calcular a média dos números digitados e exibir a média.
    //Depois, deverá exibir os números que estão no vetor que estão acima da média.


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] average = new int[10];


        System.out.println("Digite 10 números");

        for(int i = 0; i < average.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número");
            average[i] = read.nextInt();
        }

        System.out.println("-----Médias-----");

        for(int i = 0; i < average.length; i++) {
            System.out.println("Valor Média do número " + (i + 1));
            System.out.println(average[i] / 3);
        }

        System.out.println("----Acima da média-----");

        for(int i = 0;  i < average.length; i++) {
            int totalAvg = average[i] / 3;

            if(totalAvg >= 5) {
                System.out.println("número " + (i + 1) + " Acima da média");
                System.out.println(totalAvg);
            }
        }

    }
}
