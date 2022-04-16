public abstract class Automovel implements Vendavel{
    private String modelo;
    private String marca;
    private Integer anoLancamento;
    private String cor;
    private double preco;
    private String placa;

    public Automovel(String modelo, String marca, Integer anoLancamento, String cor, double preco, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoLancamento = anoLancamento;
        this.cor = cor;
        this.preco = preco;
        this.placa = placa;
    }


    // funções automovel

    public boolean estadoAutomovel = false;
    public Integer marchaAutoMovel = 0;


    public void ligar() {
        estadoAutomovel = true;
        System.out.println("Carro Ligado");
    }

    public void acelerar() {

        if(marchaAutoMovel >= 3) {
            System.out.println("Não é possivel acelerar mais");
        } else {
            marchaAutoMovel++;
            System.out.println("Acelerou: " + marchaAutoMovel);
        }
    }

    public void frear() {
        if(marchaAutoMovel >= 2) {
            marchaAutoMovel--;
            System.out.println("freando: " + marchaAutoMovel);
        }

    }

    public void desligar() {
        if(estadoAutomovel) {
            if(marchaAutoMovel > 1){
                System.out.println("Pare o Automovel para poder desligar");

            } else if(marchaAutoMovel == 1) {
                marchaAutoMovel = 0;
                System.out.println("Carro desligado");
                estadoAutomovel = false;
            }

        } else if(!estadoAutomovel){
            System.out.println("Carro já está desligado");
        }

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                "\nMarca: " + marca +
                "\nAno Lancamento: " + anoLancamento +
                "\nCor: " + cor +
                "\nPreco: " + preco +
                "\nPlaca: " + placa;
    }
}
