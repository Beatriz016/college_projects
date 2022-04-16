public class Caminhao extends  Automovel{
    private int qtdMarcha;
    private String tipoCaminhao;
    private double pesoCarga;
    private int qtdRoda;

    public Caminhao(String modelo, String marca, Integer anoLancamento, String cor, double preco, String placa, int qtdMarcha, String tipoCaminhao, double pesoCarga, int qtdRoda) {
        super(modelo, marca, anoLancamento, cor, preco, placa);
        this.qtdMarcha = qtdMarcha;
        this.tipoCaminhao = tipoCaminhao;
        this.pesoCarga = pesoCarga;
        this.qtdRoda = qtdRoda;
    }

    @Override
    public double getValorTotal() {
        return getPreco();
    }

    public int getQtdMarcha() {
        return qtdMarcha;
    }

    public void setQtdMarcha(int qtdMarcha) {
        this.qtdMarcha = qtdMarcha;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public int getQtdRoda() {
        return qtdRoda;
    }

    public void setQtdRoda(int qtdRoda) {
        this.qtdRoda = qtdRoda;
    }

    @Override
    public String toString() {
        return "Caminhao" +
                "\nQtd Marcha: " + qtdMarcha +
                "\nTipo Caminhao: " + tipoCaminhao +
                "\nPeso Carga: " + pesoCarga +
                "\nQtd Roda: " + qtdRoda +
                '\n' + super.toString() +
                "\n----------------";
    }
}
