public abstract class FuncionarioBonus implements Iescola {
    private String nome;

    public FuncionarioBonus(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
