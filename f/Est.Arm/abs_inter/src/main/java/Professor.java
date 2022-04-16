public class Professor extends Educador{

    public Professor(String nome, Integer qtdAulaSemana, double valorHoraAula) {
        super(nome, qtdAulaSemana, valorHoraAula);
    }

    @Override
    public double calcularBonus() {
        return (getQtdAulaSemana() * getValorHoraAula()) * (4.5 * 0.15);
    }


}
