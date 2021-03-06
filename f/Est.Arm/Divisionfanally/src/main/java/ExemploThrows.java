import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploThrows {

    public static int divide(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numerador, denominador, resultado;
        boolean continua = true;

        do {

            try {
                System.out.println("Digite o valor do numerador: ");
                numerador = leitor.nextInt();

                System.out.println("Digite o valor do denominador: ");
                denominador = leitor.nextInt();

                resultado = divide(numerador, denominador);
                System.out.println(numerador + "/" + denominador + " = " + resultado);

                continua = false;
            }

            catch (InputMismatchException erro) {
                System.out.println("Exeção: " + erro);
                System.out.println("Você deve digitar um valor inteiro. Tente novamente!");
                leitor.nextLine(); // descarta o restante do buffer livre
            }

            catch (ArithmeticException erro) {
                System.out.println("Exeção: " + erro);
                System.out.println("O denominador não pode ser zero. Tente novamente");
            }

        } while (continua);
    }
}
