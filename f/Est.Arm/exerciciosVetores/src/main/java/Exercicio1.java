public class Exercicio1 {

    //1. Escreva um programa que leia 7 números e armazene-os em um vetor.
    // Depois, o programa deve percorrer o vetor exibindo os números na ordem em que foram inseridos.
    // E depois, deve percorrer o vetor de trás para frente, exibindo os números na ordem inversa
    // em que foram inseridos (dica: utilize o for ao contrário).

    public static void main(String[] args) {
        int[] readList = {1,2,3,4,5,6,7};

        for(int i = 0; i < readList.length; i++) {
            System.out.println(readList[i]);

        }

        System.out.println("-----Lista Inversa-----");

        for(int i = readList.length - 1; i >= 0; i--) {
            System.out.println(readList[i]);
        }
    }





}
