package sptech.example.c102211004beatrizvitoriacardoso.entidade;

public class Usuarios {
    private String nome;
    private String senha;
    private String usuario;

    public Usuarios(String nome, String senha, String usuario) {
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
