public abstract class Educador {
    private String nome;
    private Integer qtdAulaSemana;
    private double valorHoraAula;

    public Educador(String nome, Integer qtdAulaSemana, double valorHoraAula) {
        this.nome = nome;
        this.qtdAulaSemana = qtdAulaSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public abstract double calcularBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAulaSemana() {
        return qtdAulaSemana;
    }

    public void setQtdAulaSemana(Integer qtdAulaSemana) {
        this.qtdAulaSemana = qtdAulaSemana;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "Educador" +
                "\nnome: " + nome +
                "\nqtdAulaSemana: " + qtdAulaSemana +
                "\nvalorHoraAula: " + valorHoraAula;
    }
}
