import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;

     private List<Aluno> listaAlunos;

    public Escola(String nome) {
        this.nome = nome;
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno a) {
        listaAlunos.add(a);
    }

    public void exibeTodos() {
        for(Aluno a : listaAlunos) {
            System.out.println("Escola: " + nome + "\n" + a.getNome() + "\n" + a);
        }
    }

    public void exibeAlunosGraduacao() {

        for(Aluno a : listaAlunos) {
            if(a instanceof AlunoGraduacao) {
                System.out.println("Escola: " + nome + "\n" + a.getNome() + "\n" + a);
            }
        }

    }

    public void exibeAprovados() {
        for(Aluno a : listaAlunos) {
            if(a.calcularMedia() >= 6) {
                System.out.println("Escola: " + nome + "\n" + a.getNome() + "\n" + a);
            }
        }
    }

    public void buscarAluno(Integer ra) {
        Boolean existe = false;
        for(var i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);

            if (aluno.getRa().equals(ra)) {
                System.out.println("Escola: " + nome + "\n" + aluno.getNome() + "\n" + aluno);
                existe = true;
            }
        }


        if(!existe) {
            System.out.println("Aluno não encontrado");
        }
    }

}


