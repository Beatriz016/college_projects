public class DVD extends Produto{
    private String gravadora;

    public DVD(int codigo, String nome, Double precoCusto, String gravadora) {
        super(codigo, nome, precoCusto);
        this.gravadora = gravadora;
    }

    public Double getValorVenda() {
        return getPrecoCusto() * 0.20;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return "DVD" +
                "\n" + super.toString() +
                "\ngravadora: " + gravadora;
    }
}
