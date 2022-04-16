public class TesteAluno {
    public static void main(String[] args) {
        AlunoGraduacao aluno1 = new AlunoGraduacao( 2211004,"Beatriz",5.0,8.0);
        AlunoFundamental aluno2 = new AlunoFundamental(122345,"Marcos",5.5,7.50,10.0,5.0);
        AlunoPos aluno3 = new AlunoPos(54321,"Maria",9.7,4.9,5.5);
        Escola escola = new Escola("Foquinha Azul");

        System.out.println("------Cadastrando Alunos------");
        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);

        System.out.println("------Exibe Todos------");
        escola.exibeTodos();
        System.out.println("------Alunos Graduação------");
        escola.exibeAlunosGraduacao();
        System.out.println("------Aprovados------");
        escola.exibeAprovados();
        System.out.println("-------Buscar Aluno-----");
        escola.buscarAluno(122345);

    }
}
