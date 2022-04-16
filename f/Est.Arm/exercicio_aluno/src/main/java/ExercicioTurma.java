import java.util.Scanner;

public class ExercicioTurma {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] names = new String[10];
        String[] classes = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nome do " + (i + 1) + "º Aluno: ");
            names[i] = read.next();

            System.out.println("Sua turma: ");
            classes[i] = read.next();
        }


        System.out.println("Quantidade de Alunos");

        String[] t1 = new String[10];
        String[] t2 = new String[10];

        int total = 0;
        for (int i = 0; i < names.length; i++) {
            total += 1;

            if (classes[i].equalsIgnoreCase("t1")) {
                t1[i] = names[i];

            } else if (classes[i].equalsIgnoreCase("t2")) {
                t2[i] = names[i];
            }

        }

        System.out.println("Total de Alunos: " + total);

        System.out.println("-------");

        System.out.println("Alunos T1: ");
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (t1[i] == null) {
                    String aux = t1[i];
                    t1[i] = t1[j];
                    t1[j] = aux;
                }
            }

            System.out.println(t1[i]);

        }

        System.out.println("Alunos T2");
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (t2[i] == null) {
                    String aux = t2[i];
                    t2[i] = t2[j];
                    t2[j] = aux;
                }
            }

            System.out.println(t1[i]);

        }
    }
}

