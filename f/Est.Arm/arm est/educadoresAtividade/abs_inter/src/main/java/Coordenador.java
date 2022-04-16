public class Coordenador extends Educador{
    private Integer qtdHorasCoordSemana;
    private double valorHoraCoord;

    public Coordenador(String nome, Integer qtdAulaSemana, double valorHoraAula, Integer qtdHorasCoordSemana, double valorHoraCoord) {
        super(nome, qtdAulaSemana, valorHoraAula);
        this.qtdHorasCoordSemana = qtdHorasCoordSemana;
        this.valorHoraCoord = valorHoraCoord;
    }

    public double calcularBonus() {
        return (((getQtdAulaSemana() * getValorHoraAula()) * (4.5 * 0.15 ))
                + ((qtdHorasCoordSemana * valorHoraCoord) * (4.5 * 0.2)));
    }

    @Override
    public String toString() {
        return "Coordenador" +
                "\nqtdHorasCoordSemana: " + qtdHorasCoordSemana +
                "\nvalorHoraCoord: " + valorHoraCoord;
    }
}
