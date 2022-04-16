import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v) {
        //Exibe o vetor
        for(int i = 0; i < v.length; i++ ) {
            System.out.println("v["+i+"]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //criacao de um objeto leitor
        Scanner leitor = new Scanner(System.in);

        //Criação de um vetor de 5 inteiros
//        int[] vetor = new int[5];

        //criação de um segundo vetor de inteiros, com lista d inicializadores
        // o vetor ja "nasce" com valores
//        int[] vet2 = {100,200,300,400,500,600,700,};

        //criação de um terceiro vetor de Strings
        //String[] vet3 = new String[];

        //Atribuição de valores para o vetor
//        for(int i = 0; i < vetor.length; i++) {
//            vetor[i] = i * 10;
//        }

        //exibe o vetor
//        exibeVetor(vetor);

        // exibe o vetor vet2
//        exibeVetor(vet2);

        //loop para preencher o vetor com valores
//        for(int i = 0; i < vetor.length; i++) {
//            System.out.println("Digite o valor para o vetor[" + i + "]");
//            vetor[i] = leitor.nextInt();
//        }
       // for(String nome : vet3) {
        //    System.out.println(nome + "\t");
      // }

        //Desafio 1
        // exibir a soma dos elementos do vetor
        int vetor01[] = {12,20,15,12,45,12,6};

        int valorTotal = 0;
        for(int i = 0; i < vetor01.length; i++ ) {
            valorTotal += vetor01[i];
        }
        System.out.println(valorTotal);
        System.out.println("-------");


        //DESAFIO 2
        // exibir os elementos pares do vetor
        for(int i = 0; i < vetor01.length; i++) {
            if(vetor01[i] % 2 == 0) {
                System.out.println(vetor01[i]);
            }
        }

        System.out.println("-------");

        //DESAFIO 3
        // Criar um 4 vetor de Strings, já inicializado com os nomes
        // dos dias da semana: "Domingo", "Segunda", "Terça", etc
        // Solicitar que o usuario digite um número inteiro de  1 a 7
        // enquanto o número não for de 1 a 7, fique num loop até
        // que o número seja válido
        // exiba o dia da semana correspondente, sendo que 1 é domingo,
        // 2 é segunda, etc

        String[] vetor04 = {"Domingo", "Segunda","Terça","Quarta","Quinta","Sexta","Sabado"};



        do {
            System.out.println("Digite um número de 1 - 7");
            int semana = leitor.nextInt();

        } while(semana < 7 || semana > 1) {
            for(int i = 0; i < vetor04.length; i++) {
                if(semana == vetor04[i + 1]) {
                    System.out.println(vetor04[i];
                }
            }
        }


    }




}
