import java.util.Scanner;

public class Exercicio3 {
    //3.  Escreva um programa que cria um vetor para armazenar 10 Strings.
    // O programa deve solicitar que o usuário digite 10 nomes, que devem ser armazenados nesse vetor.
    //Depois, o programa deve pedir que se digite um nome qualquer.
    // O programa deverá pesquisar se esse nome está no vetor.
    //Se estiver, deve exibir a mensagem: “Nome encontrado no índice x”,
    // sendo x o índice do nome no vetor, senão deve exibir uma mensagem de “Nome não encontrado”.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] names = {"Beatriz","Vitória","Enzo","Maria","Daniel","Benjamin","Pedro","Lucas","Roberta","Carol"};

        System.out.println("Digite um nome qualquer");
        String name = read.nextLine();

        boolean exist = false;
        for(int i = 0; i < names.length; i++) {
            if(name.equalsIgnoreCase(names[i])) {
                System.out.println("Nome encontrado no índice " + i);
                exist = true;
            }
        }

        if(!exist) {
            System.out.println("Nome não encontrado");
        }

    }

}


