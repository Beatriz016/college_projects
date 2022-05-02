import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void gravarRegistro(String registro, String nomeArq) {
        BufferedWriter saida = null;

        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        }
        catch(IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e);
        }

        try {
            saida.append(registro + "\n");
            saida.close();
        }
        catch(IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e);
        }
    }

    public static void gravarArquivoTxt(List<Filme> lista, String nomeArq) {
        int contaRegistroCorpo = 0;

        String header = "00Filmes";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        gravarRegistro(header, nomeArq);

        String corpo;
        for (Filme filme : lista) {
            corpo = "02";
            corpo += String.format("%-50.50s", filme.getNome());
            corpo += String.format("%05d",filme.getNota());
            corpo += String.format("-10.10s",filme.getGenero());
            corpo += String.format("%05d",filme.getIdade());

            contaRegistroCorpo++;
            gravarRegistro(corpo, nomeArq);
        }

        String trailer = "01";
        trailer += String.format("%010d", contaRegistroCorpo);
        gravarRegistro(trailer, nomeArq);
    }

    public static void lerArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String nome, genero;
        Integer nota, idade;
        int contaRegistroCorpoLido = 0;
        int qtdRegistroCorpoGravado;

        List<Filme> listaLida = new ArrayList<>();

        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        }
        catch(IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e);
        }

        try {
            registro = entrada.readLine();

            while (registro != null) {
                tipoRegistro = registro.substring(0,2);
                if(tipoRegistro.equals("00")) {
                    System.out.println("É um registro de header");
                    System.out.println("Tipo de Arquivo: " + registro.substring(2,6));
                    System.out.println("Ano e Semestre: " + registro.substring(6,11));
                    System.out.println("Data e Hora da Gravação: " + registro.substring(11,30));
                    System.out.println("Versão de Layout: " + registro.substring(30,32));
                }

                else if(tipoRegistro.equals("01")) {
                    System.out.println("É um registro de trailer");
                    qtdRegistroCorpoGravado = Integer.parseInt(registro.substring(2,12));
                    if (contaRegistroCorpoLido == qtdRegistroCorpoGravado) {
                        System.out.println("Quantidade de registros lidos é compativel com a quantidade" +
                                "de registros gravados");
                    } else {
                        System.out.println("Quantidade de registros lidos não é compativel com a quantidade" +
                                "de registros gravadps");
                    }
                }

                else if (tipoRegistro.equals("02")) {
                    System.out.println("É um registro de corpo");
//                    nome = registro.substring().trim();
//                    nota = registro.substring().trim();
//                    genero = registro.substring().trim();
//                    idade = registro.substring().trim();
//                    contaRegistroCorpoLido++;
//
//                    Filme filme = new Filme(nome, nota, genero, idade);
//                    listaLida.add(filme);
                }
                else {
                    System.out.println("Tipo de registro inválido");
                }

                registro = entrada.readLine();
            }
            entrada.close();
        }
        catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e);
        }

        System.out.println("\nConteúdo da lista lida:");
        for (Filme filme : listaLida) {
            System.out.println(filme);
        }

    }

    public static void main(String[] args) {
        List<Filme> lista = new ArrayList<>();

        lista.add(new Filme("O show de Truman",10,"Comédia",14));
        lista.add(new Filme("Shazam",7,"Ficção Cientifica",12));
        lista.add(new Filme("Esqueceram de mim",9,"Comédia",10));

        for(Filme filme : lista) {
            System.out.println(filme);
        }
    }
}
