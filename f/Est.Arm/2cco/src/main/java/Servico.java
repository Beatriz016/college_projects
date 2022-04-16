public class Servico implements Tributavel {
    private String descrition;
    private Double price;

    public Servico(String descrition, Double price) {
        this.descrition = descrition;
        this.price = price;
    }

    @Override
    public Double getValorTributo() {
        return price * 0.12;
    }

    @Override
    public String toString() {
        return "Servico: " +
                "\ndescrition: " + descrition +
                "\nprice: " + price;
    }
}

