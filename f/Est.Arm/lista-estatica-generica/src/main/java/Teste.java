public class Teste {
    public static void main(String[] args) {
        ListaObj <String> lista = new ListaObj<>(5);

        Produto produto =  new Produto(123,"Notebook",10.50,3);
        Produto produto02 =  new Produto(456,"Mouse",2.50,1);
        Produto produto03 =  new Produto(789,"Teclado",10.40,3);
        Produto produto04 =  new Produto(444,"TV",150.56,5);
        Produto produto05 =  new Produto(101,"Mousepad",40.55,4);


        System.out.printf("%6s %-14s %7s %7s %14s\n","CÓDIGO","NOME","PREÇO","NOTA","FATURAMENTO");


        produto.comprar(2);
        System.out.println(produto);

        produto02.comprar(10);
        System.out.println(produto02);produto05.comprar(10);

        produto03.comprar(15);
        System.out.println(produto03);

        produto04.comprar(12);
        System.out.println(produto04);

        produto05.comprar(10);
        System.out.println(produto05);


    }

}
