public class BrinquedoIngresso implements IVendavel{
    private Integer codigo;
    private String nome;
    private Double valorIngresso;
    private Integer qtdIngressoVendido;

    public BrinquedoIngresso(Integer codigo, String nome, Double valorIngresso, Integer qtdIngressoVendido) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorIngresso = valorIngresso;
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    public Double getRenda() {
        return valorIngresso * qtdIngressoVendido;
    }

    @Override
    public Double getValorImposto() {
        return getRenda() * 0.15;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Integer getQtdIngressoVendido() {
        return qtdIngressoVendido;
    }

    public void setQtdIngressoVendido(Integer qtdIngressoVendido) {
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    @Override
    public String toString() {
        return "BrinquedoIngresso: " +
                "\nvalorIngresso:" + valorIngresso +
                "\nqtdIngressoVendido:" + qtdIngressoVendido +
                "\n" + "----------";
    }
}
