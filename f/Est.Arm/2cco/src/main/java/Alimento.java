public class Alimento extends Produto {
    private Integer quantityVitamin;

    public Alimento(Integer code, String descrition, Double price, Integer quantityVitamin) {
        super(code, descrition, price);
        this.quantityVitamin = quantityVitamin;
    }

    @Override
    public Double getValorTributo() {
        return getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento: " +
                "Quantidade Vitamina: " + quantityVitamin +
                "tributo:" + getValorTributo() +
                super.toString();
    }
}
