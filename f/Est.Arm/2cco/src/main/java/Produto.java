public abstract class Produto implements Tributavel {
    private Integer code;
    private String descrition;
    private Double price;

    public Produto(Integer code, String descrition, Double price) {
        this.code = code;
        this.descrition = descrition;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\ncodigo: " + code +
                "\ndescricao: " + descrition  +
                "\npreco: " + price;
    }

    public Double getPrice() {
        return price;
    }
}

