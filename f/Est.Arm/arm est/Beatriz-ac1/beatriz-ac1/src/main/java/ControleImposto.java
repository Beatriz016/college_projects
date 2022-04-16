import java.util.ArrayList;
import java.util.List;

public class ControleImposto {
    private List<IVendavel> listaVendavel;

    public ControleImposto() {
        this.listaVendavel = listaVendavel;
        listaVendavel = new ArrayList<>();
    }

    public void adicionar(IVendavel a) {
        listaVendavel.add(a);
    }

    public Double totalImposto() {
        Double total = 0.0;
        for(IVendavel imposto : listaVendavel) {
            total += imposto.getValorImposto();
        }
       return total;
    }

    public void exibe() {
        for(IVendavel temImposto : listaVendavel) {
            System.out.println(temImposto);
        }
    }

    @Override
    public String toString() {
        return "ControleImposto" +
                "\nlistaVendavel: " + listaVendavel;
    }
}
