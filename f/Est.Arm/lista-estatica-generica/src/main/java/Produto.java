public class Produto {

    private int codProduto;
    private String nome;
    private Double preco;
    private int avaliacao;
    private int quantidadeVendida;

    public Produto(int codProduto, String nome, Double preco, int avaliacao) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.quantidadeVendida = 0;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    //4) Criar o método comprar(), que recebe a quantidade comprada e
    // aumenta a quantidade de produtos vendidos


    public void comprar(int qtdComprada) {
        quantidadeVendida += qtdComprada;
    }

    //5) Criar método calcularFaturamento(), que multiplica a
    // quantidade de produtos vendida pelo preço e retorna o valor calculado

    public double calculaFaturamento() {
        return quantidadeVendida * preco;
    }

    //6) O toString() da classe produto deve formatar a exibição utilizando o String.format, seguindo os critérios abaixo:
    //
    //A coluna  que exibe o  código do produto deve conter 6 dígitos com zeros a esquerda do código
    //A coluna com nome do produto deve conter 14 caracteres alinhados a esquerda
    //A coluna de preço deve conter 7 dígitos alinhados à direita e com 2 casas decimais
    //A coluna de avaliação deve conter 7 dígitos alinhados à direita
    //A coluna de faturamento deve conter 14 dígitos alinhados à direita e com 3 casas decimais


    @Override
    public String toString() {
        System.out.println("faturamento" + calculaFaturamento());
        return String.format("%06d %-14s %7.2f %7s %14.3f",
                codProduto, nome, preco,"*".repeat(avaliacao),calculaFaturamento());
    }
}
