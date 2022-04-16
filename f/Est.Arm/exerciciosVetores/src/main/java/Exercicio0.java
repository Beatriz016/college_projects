import java.util.Scanner;

public class Exercicio0 {

    // Desafio 3
    // Criar um 4o vetor de Strings, já inicializado com os nomes
    // dos dias da semana: "Domingo", "Segunda", "Terça", etc
    // Solicitar que o usuário digite um número inteiro de 1 a 7
    // Enquanto o número não for de 1 a 7, fique num loop até
    // que o número seja válido
    // Exiba o dia da semana correspondente, sendo que 1 é Domingo,
    // 2 é Segunda, etc

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);


        String[] weekDay = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sabado"};
        Integer option = 0;

       do {
           System.out.println("Digite um número de 1 á 7: ");
           option = leitor.nextInt();

       } while (option < 1 || option > 7);


        for (int i = 0; i < weekDay.length; i++) {
            if(option == i) {
                System.out.println(weekDay[i - 1]);
            }

        }

        if(option == 7) {
            System.out.println(weekDay[6]);
        }

    }

}
