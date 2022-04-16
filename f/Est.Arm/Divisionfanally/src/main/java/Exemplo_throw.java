import javax.swing.*;

public class Exemplo_throw {
    public static void main(String[] args) {
        float nota1 = Float.parseFloat(
                JOptionPane.showInputDialog("Digite a nota 1 (entre 0 e 10)"));

        float nota2 = Float.parseFloat(
                JOptionPane.showInputDialog("Digite a nota 2 (entre 0  e 10)"));


        try {
            if (nota1 < 0 || nota1 > 10) {
                throw new LimiteUltrapassadoExeption("Nota 1: valor fora dos limites!");
            }

            if (nota2 < 0 || nota2 > 10) {
                throw new LimiteUltrapassadoExeption("Nota 2: valor fora dos limites!");
            }

            JOptionPane.showMessageDialog(null,
                    "Média = " + (nota1 + nota2)/2);
        }catch (LimiteUltrapassadoExeption erro) {
            JOptionPane.showMessageDialog(null,"" +
                    erro,"Erro", JOptionPane.ERROR_MESSAGE);
        }

    }
}
