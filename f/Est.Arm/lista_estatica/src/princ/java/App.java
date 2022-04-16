public class App {
    public static void main(String[] args) {
        ListaEstatica listaEstatica = new ListaEstatica(10);

        // ADICIONANDO ITENS NA LISTA
        System.out.println("adicionando itens na lista...");
        listaEstatica.adiciona(2);
        listaEstatica.adiciona(3);
        listaEstatica.adiciona(10);
        listaEstatica.adiciona(13);
        listaEstatica.adiciona(16);
        listaEstatica.adiciona(13);

        // EXIBINDO ITENS DA LISTA
        System.out.println("Itens adicionados:");
        listaEstatica.exibe();


        System.out.println("---");


        // BUSCANDO PELO INDICE
        System.out.println("buscando número pelo indice: ");
        System.out.println(listaEstatica.busca(3));

        System.out.println("---");

        // buscando com indice invalido
        System.out.println(listaEstatica.busca(6));


        System.out.println("---");


        // REMOVENDO PELO INDICE
        System.out.println("Removendo elemento pelo indice");
        System.out.println(listaEstatica.removePeloIndice(1));
        System.out.println("indice removido");

        System.out.println("---");

        // tentando remover com indice que não existe
        System.out.println(listaEstatica.removePeloIndice(6));

        System.out.println("---");

        System.out.println("lista atual: ");
        listaEstatica.exibe();


        System.out.println("---");


        // REMOVENDO ELEMENTO DA LISTA
        System.out.println("Removendo elemento da lista");
        System.out.println(listaEstatica.removeElemento(2));

        System.out.println("---");

        // removendo elemento que não existe
        System.out.println(listaEstatica.removeElemento(15));

        System.out.println("---");

        System.out.println("Lista Atual: ");
        listaEstatica.exibe();


        System.out.println("---");


        // SUBSTITUINDO ELEMENTO DA LISTA
        System.out.println(listaEstatica.substitui(10,8));

        System.out.println("---");

        // substituindo valor inválido
        System.out.println(listaEstatica.substitui(2,3));

        System.out.println("---");

        System.out.println("lista atual: ");
        listaEstatica.exibe();


        System.out.println("---");

        //CONTANDO A QUANTIDADE DE OCORRENCIAS DE UM VALOR DENTRO DA LISTA
        System.out.println("Quantidade de vezes que o 13 aparece na lista");
        System.out.println(listaEstatica.contaOcorrencias(13));


        System.out.println("---");


        //ADICIONANDO VALOR NO INICIO DA LISTA
        System.out.println("adicionando no inicio");
        System.out.println(listaEstatica.adicionaInicio(20));

        System.out.println("---");

        listaEstatica.exibe();
    }

}
