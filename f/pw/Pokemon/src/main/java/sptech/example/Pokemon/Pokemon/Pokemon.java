package sptech.example.Pokemon.Pokemon;

public class Pokemon {
    private String nome;
    private String tipo;
    private boolean capturado;
    private double forca;

    public Pokemon(String nome, String tipo, boolean capturado, double forca) {
        this.nome = nome;
        this.tipo = tipo;
        this.capturado = capturado;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }
}
