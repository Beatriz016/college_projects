package sptech.projeto02;

public class Pais {
    private String nome;
    private int medalhasOuro;
    private int medalhaPrata;
    private int medalhaBronze;

    public Pais(String nome, int medalhasOuro, int medalhaPrata, int medalhaBronze) {
        this.nome = nome;
        this.medalhasOuro = medalhasOuro;
        this.medalhaPrata = medalhaPrata;
        this.medalhaBronze = medalhaBronze;
    }

    public Pais() {

    }

    public int getTotalMedalhas() {
        return this.medalhasOuro + this.medalhaPrata + this.medalhaBronze;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMedalhasOuro() {
        return medalhasOuro;
    }

    public void setMedalhasOuro(int medalhasOuro) {
        this.medalhasOuro = medalhasOuro;
    }

    public int getMedalhaPrata() {
        return medalhaPrata;
    }

    public void setMedalhaPrata(int medalhaPrata) {
        this.medalhaPrata = medalhaPrata;
    }

    public int getMedalhaBronze() {
        return medalhaBronze;
    }

    public void setMedalhaBronze(int medalhaBronze) {
        this.medalhaBronze = medalhaBronze;
    }
}
