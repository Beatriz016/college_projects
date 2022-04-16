public class Livro extends Produto{

    private String autor;
    private String isbn;

    public Livro(int codigo, String nome, Double precoCusto, String autor, String isbn) {
        super(codigo, nome, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    public Double getValorVenda() {
        return getPrecoCusto() * 0.10;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro" +
                "\n" + super.toString() +
                "\nautor: " + autor +
                "\nisbn: " + isbn;
    }
}
