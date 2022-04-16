import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Iescola> listaFuncionarios;

    public ControleBonus() {
        this.listaFuncionarios = listaFuncionarios;
        listaFuncionarios = new ArrayList<>();
    }

    public void adicionarFunc(Iescola f) {
        listaFuncionarios.add(f);
    }

    public void existe() {
        for(Iescola f : listaFuncionarios) {
            System.out.println(f);
        }
    }


    public double CalcularTotalBonus() {
        double total = 0.0;
        for(var i = 0; i < listaFuncionarios.size(); i++) {
            total += listaFuncionarios.get(i).getValorBonus();
        }

        return total;
    }

    @Override
    public String toString() {
        return "ControleBonus" +
                "listaFuncionarios: " + listaFuncionarios +
                "bonus total: " + CalcularTotalBonus();
    }
}

