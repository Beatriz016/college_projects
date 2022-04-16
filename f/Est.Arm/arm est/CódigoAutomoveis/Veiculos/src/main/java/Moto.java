public class Moto extends Automovel{

    private String bau;
    private String tipoMoto;

    public Moto(String modelo, String marca, Integer anoLancamento, String cor, double preco, String placa, String bau, String tipoMoto) {
        super(modelo, marca, anoLancamento, cor, preco, placa);
        this.bau = bau;
        this.tipoMoto = tipoMoto;
    }

    @Override
    public double getValorTotal() {
        return getPreco();
    }



    public String isBau() {
        return bau;
    }



    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }

    @Override
    public String toString() {
        return "Moto" +
                "\nbau: " + bau +
                "\ntipoMoto: " + tipoMoto +
                "\n" + super.toString() +
                "\n" + "-----------------";
    }
}
