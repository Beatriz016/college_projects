public class Aluno {
    private int ra;
    private String nome;
    private Double nota;

    public Aluno(int ra, String nome, Double nota) {
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
       return String.format("%10d %-30s %5f",ra,nome,nota);
        //return String.format("%06d %-14s %7.2f %7d %14.3f",codProduto, nome, preco,avaliacao,calculaFaturamento());
    }
}
