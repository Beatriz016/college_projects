package sptech.projetojpa03.entidade;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity // do pacote javax.persistence
public class AnimalEstimacao {

    @Id // do pacote javax.persistence
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    //@NotEmpty
    @NotBlank  //serve apenas para texto, não existe número com espaço branco
    @Size(min = 3, max = 10) // size de caracteres
    private String nome;

    //@Past
    @PastOrPresent
    private LocalDate dataNascimento;

    //@DecimalMin("0.1")
    //@PositiveOrZero
    @Positive // aceita qualquer valor positivo apartir de zero ex : 0.1 ...
    @DecimalMax("70")
    private Double peso;

    private boolean castrado;

    @Email
    private String emailDono;

    @CPF
    @Size(max = 11, message = "informe somente os números")
    private String cpfDono;

    @Pattern(regexp = "(\\(?\\d{2}\\)?\\s)?(\\d{4,5}\\-\\d{4})" ,
            message = "Informe um telefone válido com ou sem DDD")
    private String telefoneDono;


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public String getEmailDono() {
        return emailDono;
    }

    public void setEmailDono(String emailDono) {
        this.emailDono = emailDono;
    }

    public String getCpfDono() {
        return cpfDono;
    }

    public void setCpfDono(String cpfDono) {
        this.cpfDono = cpfDono;
    }
}
