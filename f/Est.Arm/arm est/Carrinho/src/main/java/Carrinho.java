import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> listaVendas;

    public Carrinho() {
        this.listaVendas = listaVendas;
        listaVendas = new ArrayList<>();
    }

    public void adicionarVenda(Vendavel t) {
        listaVendas.add(t);
    }


    public Double calcularTotaVenda() {
        Double vendas = 0.0;


        for(Vendavel t : listaVendas ) {
            vendas += t.getValorVenda();
        }

        /* for(var i = 0; i < listaVendas.size(); i++) {
            vendas += listaVendas.get(i).getValorVenda();
        }*/

        return vendas;
    }


    public void exibItensCarrinho() {
        for(Vendavel t : listaVendas) {
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "Carrinho" +
                "\nlistaVendas:" + listaVendas +
                "\nTotal Venda: " + calcularTotaVenda();
    }
}
