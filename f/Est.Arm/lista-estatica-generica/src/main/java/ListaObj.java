import java.util.Arrays;

public class ListaObj <T>{
    private T[] vetor;
    private int nroElem;

    public ListaObj(int tmoMaximo) {
        this.vetor = (T[]) new Object[tmoMaximo];
        this.nroElem = nroElem;
    }

    public void adiciona(T elemento) {

        if (nroElem < vetor.length) {
            vetor[nroElem++] = elemento;

        } else {
            System.out.println("lista cheia");
        }

    }


    public void exibe() {
        for (int i = 0; i < nroElem; i++) {

            System.out.println(vetor[i]);
        }
    }


    public int busca(T v) {
        //boolean achei = false;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i].equals(v)) {
                //System.out.println("indice: " + i);
                return i;
                //achei = true;
            }
        }
        //achei = false;
        return -1;
    }

    public boolean removePeloIndice(int indice) {
        if(indice < 0 || indice >= nroElem) {
            System.out.println("indice não encontrado ou inválido");
            return false;
        }

        for(int i = indice; i < nroElem; i++) {
            vetor[i] = vetor[i + 1];
        }

        nroElem--;
        return true;
    }

    public boolean removeElemento(T elemento) {
        if(removePeloIndice(busca(elemento))) {
            System.out.println("elemento removido");
            return true;
        }
        System.out.println("elemento não encontrado");
        return false;
    }

    public boolean substitui(T valorAntigo, T valorNovo) {
        for(int i = 0; i < nroElem; i++) {
            if(vetor[i].equals(valorAntigo)) {
                System.out.println("Valor alterado");
                vetor[i] = valorNovo;
                return true;
            }
        }

        System.out.println("Valor não encontrado");
        return false;
    }

    public Integer contaOcorrencias(int valor) {
        int total = 0;
        for(int i = 0; i < nroElem; i++) {
            if(vetor[i].equals(valor)) {
                total++;
            }
        }

        return total;
    }

    public boolean adicionaInicio(T elemento) {
        if (nroElem < vetor.length) {
            for (int i = nroElem - 1; i >= 0; i--) {
//                vetor[nroElem] = elemento;
//                int aux = vetor[i];
//                vetor[i] = vetor[i + 1];
//                vetor[i + 1] = aux;
                vetor[i + 1] = vetor[i];
            }
            vetor[0] = elemento;
            nroElem++;
            return true;
        }

        System.out.println("Lista Cheia");
        return false;

    }

    public int getTamanho() {
        return nroElem;
    }

    public T getElemento(int indice) {
        if(indice < 0 || indice >= nroElem) {
            return null;
        }

        return vetor[indice];
    }

    public void limpa() {
        nroElem = 0;
    }

    @Override
    public String toString() {
        return "ListaEstatica" +
                "vetor: " + Arrays.toString(vetor) +
                "nroElem: " + nroElem;
    }
}
