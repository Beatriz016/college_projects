public class Professor extends FuncionarioBonus{
    private int qtdAulasSemana;
    private double valorHoraAula;

    public Professor(String nome, int qtdAulasSemana, double valorHoraAula) {
        super(nome);
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double getValorBonus() {
        return  (qtdAulasSemana * valorHoraAula) * (4.5 * 0.15);
    }

    @Override
    public String toString() {
        return "Professor " +
                "\n" + "nome: " + getNome() +
                "\nqtdAulasSemana: " + qtdAulasSemana +
                "\nvalorHoraAula: " + valorHoraAula + "\n";
    }
}
