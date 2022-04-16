import java.util.Scanner;

public class TestaCarrinho {

    public static void main(String[] args) {
        Scanner lerNumber = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        Integer opcoes = 0;

        while(opcoes != 6) {
        System.out.println("Menu Do vendedor");
        System.out.println("1 - Adicionar Livro" +
                "\n2 - Adicionar DVD" +
                "\n3 - Adicionar Servico" +
                "\n4 - Exibir itens do carrinho" +
                "\n5 - Exibir Total de Vendas" +
                "\n6 - Fim");
            System.out.println("---------------------");
            System.out.println("Digite um número:");

            opcoes = lerNumber.nextInt();

            switch (opcoes) {

                case 1:
                    System.out.println("codigo livro: ");
                    var codigoLivro = lerNumber.nextInt();

                    System.out.println("nome: ");
                    var nomeLivro = ler.nextLine();

                    System.out.print("preco: ");
                    var precoLivro = lerNumber.nextDouble();

                    System.out.print("autor: ");
                    var autor = ler.nextLine();

                    System.out.print("isbn: ");
                    var isbn = ler.nextLine();

                    Livro livro = new Livro(codigoLivro,nomeLivro,precoLivro,autor,isbn);
                    carrinho.adicionarVenda(livro);
                    opcoes = 0;
                    break;

                case 2 :
                    System.out.print("codigo DVD: ");
                    var codigoDvd = lerNumber.nextInt();

                    System.out.print("nome: ");
                    var nomeDvd = ler.nextLine();

                    System.out.print("preco: ");
                    var precoDvd = lerNumber.nextDouble();

                    System.out.print("gravadora: ");
                    var gravadora = ler.nextLine();

                    DVD dvd = new DVD(codigoDvd,nomeDvd,precoDvd,gravadora);
                    carrinho.adicionarVenda(dvd);
                    System.out.println("---------------------");

                    opcoes = 0;
                    break;

                case 3 :
                    System.out.print("descricao: ");
                    var descricao = ler.nextLine();

                    System.out.print("codigo: ");
                    var codigo = lerNumber.nextInt();

                    System.out.print("qtd Horas: ");
                    var qtdHoras = lerNumber.nextInt();

                    System.out.print("valor Horas: ");
                    var valorHora = lerNumber.nextDouble();

                    Servico servico = new Servico(descricao,codigo,qtdHoras,valorHora);
                    carrinho.adicionarVenda(servico);
                    System.out.println("---------------------");
                    opcoes = 0;

                    break;

                case 4 :
                    carrinho.exibItensCarrinho();
                    System.out.println("---------------------");
                    opcoes = 0;

                    break;

                case 5 :
                    System.out.println(carrinho.calcularTotaVenda());
                    System.out.println("---------------------");
                    opcoes = 0;

                    break;

                default :
                    break;
            }

        }
    }
}
