public class BrinquedoAlugado implements IVendavel{
    private Integer codigo;
    private String nome;
    private Double valorHora;
    private Integer qtdHoraAlugada;

    public BrinquedoAlugado(Integer codigo, String nome, Double valorHora, Integer qtdHoraAlugada) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorHora = valorHora;
        this.qtdHoraAlugada = qtdHoraAlugada;
    }


    public Double getRenda() {
        return valorHora * qtdHoraAlugada;
    }

    @Override
    public Double getValorImposto() {
        return getRenda() * 0.10;
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

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getQtdHoraAlugada() {
        return qtdHoraAlugada;
    }

    public void setQtdHoraAlugada(Integer qtdHoraAlugada) {
        this.qtdHoraAlugada = qtdHoraAlugada;
    }

    @Override
    public String toString() {
        return "BrinquedoAlugado" +
                "\nvalorHora: " + valorHora +
                "\nqtdHoraAlugada: " + qtdHoraAlugada +
                "\n" + "-------";
    }
}
