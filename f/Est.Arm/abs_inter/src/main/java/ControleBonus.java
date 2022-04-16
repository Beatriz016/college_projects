import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Educador> listaEducdores;

    public ControleBonus() {
        this.listaEducdores = listaEducdores;
        listaEducdores = new ArrayList<>();
    }

    public void adicionaEducador(Educador e ) {
        listaEducdores.add(e);
    }

    public void exibe() {
        for(Educador e : listaEducdores) {
            System.out.println(e);
        }
    }

    public double calculaTotal() {
        double total = 0;
        for (Educador e : listaEducdores) {
            total += e.calcularBonus();
        }
        return total;
    }

    @Override
    public String toString() {
        return "ControleBonus" +
                "\nlistaEducdores: " + listaEducdores +
                "\nTotal Bonus: " + calculaTotal();
    }
}
