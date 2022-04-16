public class App {
    public static void main(String[] args) {
        ControleBonus  bonus = new ControleBonus();
        Professor professor = new Professor("Henrique",3,1000.00);
        Coordenador coordenador = new Coordenador("Beatriz",2,200,3,200.00);

        bonus.adicionaEducador(professor);
        bonus.adicionaEducador(coordenador);
        System.out.println("adicionando educadores");

        System.out.println("----exibe---------------");
        bonus.exibe();

        System.out.println("---------total-----------");

        System.out.println("total bonus: " + bonus.calculaTotal());

    }
}
