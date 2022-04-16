public abstract  class Produto implements Vendavel{
    private int codigo;
    private String nome;
    private Double precoCusto;

    public Produto(int codigo, String nome, Double precoCusto) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        return "Produto" +
                "\ncodigo: " + codigo +
                "\nnome: " + nome +
                "\nprecoCusto=" + precoCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
