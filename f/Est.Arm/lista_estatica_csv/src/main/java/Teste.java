import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Teste {

    public static void gravaArquivoCsv(ListaObj<Produto> lista, String nomeArquivo) {
        FileWriter gravaArquivo = null;
        Formatter escreveArquivo = null;

        Boolean deuRuim = false;
        nomeArquivo += ".csv";


        try {
            gravaArquivo = new FileWriter(nomeArquivo);
            escreveArquivo = new Formatter(gravaArquivo);
        }
        catch(IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }


        try {
            for(int i = 0; i < lista.getTamanho(); i++) {
                Produto prod = lista.getElemento(i);
                escreveArquivo.format("%d;%s;%7.2f;%s;%7.2f\n",prod.getCodProduto(),prod.getNome(),
                        prod.getPreco(),prod.getAvaliacao(), prod.calculaFaturamento());
            }
        }
        catch(FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
        }

        finally {
            escreveArquivo.close();

            try {
                gravaArquivo.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }

            if (deuRuim) {
                System.exit(1);
            }

        }
    }

    public static void lerArquivoCsv(String nomeArquivo) {
        FileReader abrirParaLeitura = null;
        Scanner lerArquivo = null;

        Boolean deuruim = false;
        nomeArquivo += ".csv";

        try {
            abrirParaLeitura = new FileReader(nomeArquivo);
            lerArquivo = new Scanner(abrirParaLeitura).useDelimiter(";\\n");
        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
           // System.out.printf("%6s %-14s %7s %7s %14s\n","CÓDIGO","NOME","PREÇO","NOTA","FATURAMENTO");
            while (lerArquivo.hasNext()) {
                int codigo = lerArquivo.nextInt();
                String nome = lerArquivo.next();
                Double preco = lerArquivo.nextDouble();
                int nota = lerArquivo.nextInt();

                System.out.printf("%6d %-14s %7.2f %14s\n",codigo,nome,preco,nota);
            }
        }

        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuruim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuruim = true;
        }

        finally {
            lerArquivo.close();

            try {
                abrirParaLeitura.close();
            }

           catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuruim = true;
            }

            if (deuruim) {
                System.exit(1);
            }
        }
    }


    public static void main(String[] args) {
        ListaObj <Produto> listaProduto = new ListaObj<>(5);

        Produto produto =  new Produto(123,"Notebook",10.50,3);
        Produto produto02 =  new Produto(456,"Mouse",2.50,1);
        Produto produto03 =  new Produto(789,"Teclado",10.40,3);
        Produto produto04 =  new Produto(444,"TV",150.56,5);
        Produto produto05 =  new Produto(101,"Mousepad",40.55,4);


        System.out.printf("%6s %-14s %7s %7s %14s\n","CÓDIGO","NOME","PREÇO","NOTA","FATURAMENTO");

        listaProduto.adiciona(produto);
        listaProduto.adiciona(produto02);
        listaProduto.adiciona(produto03);
        listaProduto.adiciona(produto04);
        listaProduto.adiciona(produto05);

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

        listaProduto.exibe();
        gravaArquivoCsv(listaProduto, "produtos");
        lerArquivoCsv("produtos");
    }

}
