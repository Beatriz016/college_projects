public class AlunoPos extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double monografia;

    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double monografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.monografia = monografia;
    }

    @Override
    public Double calcularMedia() {
        return (nota1 + nota2 + monografia) / 3;
    }

    @Override
    public String toString() {
        return "AlunoPos" +
                "\nnota1: " + nota1 +
                "\nnota2: " + nota2 +
                "\nmonografia:" + monografia +
                "\nmedia: " + calcularMedia();
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMonografia() {
        return monografia;
    }

    public void setMonografia(Double monografia) {
        this.monografia = monografia;
    }
}
