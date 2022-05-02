public class Filme {
    private String nome;
    private Integer nota;
    private String genero;
    private Integer idade;

    public Filme(String nome, Integer nota, String genero, Integer idade) {
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Filme: " +
                "nome: " + nome +
                "nota: " + nota +
                "genero: " + genero +
                "idade: " + idade;
    }
}
