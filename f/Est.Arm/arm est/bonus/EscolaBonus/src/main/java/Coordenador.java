public class Coordenador extends FuncionarioBonus{

    private int qtdCoordSemana;
    private double valorCoordHoras;

    public Coordenador(String nome, int qtdCoordSemana, double valorCoordHoras) {
        super(nome);
        this.qtdCoordSemana = qtdCoordSemana;
        this.valorCoordHoras = valorCoordHoras;
    }

    public double getValorBonus() {
        return (qtdCoordSemana * valorCoordHoras) * (4.5 * 0.2);
    }

    @Override
    public String toString() {
        return "Coordenador" +
                "\n" + "nome: " + getNome() +
                "\nqtdCoordSemana: " + qtdCoordSemana +
                "\nvalorCoordHoras: " + valorCoordHoras + "\n";
    }
}
