public class Servico implements Vendavel{
    private String descricao;
    private int codigo;
    private int qtdHoras;
    private Double valorHoras;

    public Servico(String descricao, int codigo, int qtdHoras, Double valorHoras) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHoras = valorHoras;
    }

    @Override
    public Double getValorVenda() {
        return this.qtdHoras * this.valorHoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public String toString() {
        return "Servico" +
                "\ndescricao" + descricao +
                "\ncodigo" + codigo +
                "\nqtdHoras=" + qtdHoras +
                "\nvalorHoras=" + valorHoras;
    }
}
