public class testeBonus {
    public static void main(String[] args) {

       ControleBonus controle = new ControleBonus();

        Professor professor = new Professor("Beatriz",10,200.00);
        Coordenador coordenador = new Coordenador("Carlos",10,250);

        controle.adicionarFunc(professor);
        controle.adicionarFunc(coordenador);
        System.out.println("adicionando funcionarios ...");

        System.out.println("-------------------------");

        System.out.println("Lista de Funcionarios com Bonus");
        controle.existe();

        System.out.println("-------------------------");

        System.out.println("Calculo total de Bonus");
        System.out.println(controle.CalcularTotalBonus());

    }
}
