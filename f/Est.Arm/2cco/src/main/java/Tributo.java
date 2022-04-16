import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> listaTributos;

    public Tributo() {
        this.listaTributos = new ArrayList<>();
    }

    public void adicionarTributavel(Tributavel t) {
        this.listaTributos.add(t);
    }

    public Double  calcularTotalTributo() {
        Double total = 0.0;

        for(Tributavel t : listaTributos) {
            total += t.getValorTributo();
        }
        return total;
    }
}
