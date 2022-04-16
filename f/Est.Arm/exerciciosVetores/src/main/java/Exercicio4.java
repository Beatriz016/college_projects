import java.util.Scanner;

public class Exercicio4 {
    //4.  Elaborar um programa que solicita que o usuário digite 10 valores inteiros
    // e armazene esses valores em um vetor. Depois o programa deve solicitar que o
    // usuário digite um número qualquer e o programa deverá exibir quantas vezes
    // esse número ocorre no vetor.

    //Exemplo:  considere os números 3  7  9  3  7  1  3  3  5  8
    //o número 7 ocorre 2 vezes
    //o número 3 ocorre 4 vezes
    //o número 2 não ocorre nenhuma vez.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] searchNum = {1,2,3,4,2,6,7,2,9,9};

        System.out.println("Digite um número qualquer");
        int num = read.nextInt();

        int totalNum = 0;
        for(int i = 0; i < searchNum.length; i++) {

            if(num == searchNum[i]) {
                totalNum += 1;
            }
        }

        if(totalNum > 0) {
            System.out.println("O número " + num + " ocorre " + totalNum + " vezes");
        } else {
            System.out.println("O número " + num + " ocorre nenhuma vez");
        }

    }
}
