public class Perfume extends Produto{
    private String fragance;

    public Perfume(Integer code, String descrition, Double price, String fragance) {
        super(code, descrition, price);
        this.fragance = fragance;
    }


    @Override
    public Double getValorTributo() {
        return getPrice() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume: " +
                "\nfragancia: " + fragance;
    }
}
