import java.util.ArrayList;
import java.util.List;

public class CorretoraAutomoveis {

    private List<Automovel> listaAutomoveis;

    public CorretoraAutomoveis() {
        this.listaAutomoveis = listaAutomoveis;
        listaAutomoveis = new ArrayList<>();
    }

    // Adicionar Automovel
    public void adicionarAutomovel(Automovel a) {
        listaAutomoveis.add(a);
    }


    // Listar Automoveis
    public void listarAutomovel() {
       for(Automovel veiculo : listaAutomoveis) {
           System.out.println(veiculo);
       }
    }


    // Calcular Total de Veiculos
    public Integer calcTotalVeiculos() {
        Integer total = 0;

        for(Automovel veiculo : listaAutomoveis) {
            total++;
        }

        System.out.println(total + " Veiculos Cadastrados");
        return total;
    }


    // Verificar Placa
    public void verificarPlaca(String placa) {
        Boolean existe = false;

        for(var i = 0; i < listaAutomoveis.size(); i++) {

            Automovel automovel = listaAutomoveis.get(i);

            if(automovel.getPlaca().equals(placa)) {
                existe = true;
                System.out.println("Placa encontrada no nosso sistema");
            }
        }

        if(!existe) {
            System.out.println("Número de Placa não encontrado no nosso sistema");
        }

    }


    // Comprar Automovel
    public void comprarAutomovel(String placas) {

        for(var index = 0; index < listaAutomoveis.size(); index++) {
            Automovel v = listaAutomoveis.get(index);
            if (placas.equalsIgnoreCase(v.getPlaca())) {
                listaAutomoveis.remove(v);
                System.out.println("modelo: " + v.getModelo() + " vendido com sucesso");
            }
        }

    }


    // Verificar se automovel existe por modelo
    public void verificarExiste(String modelo) {
        Boolean existeModelo = false;
        int contadorModelo = 0;

        for(Automovel a : listaAutomoveis) {
            if(a.getModelo().equals(modelo)) {
                contadorModelo += 1;
                System.out.println("Restam " + contadorModelo + modelo);
                existeModelo = true;
            }
        }

        if(!existeModelo) {
            System.out.println("Modelo não encontrado no sistema");
        }
    }


    //Verificar quantidade de Caminhões
    public void qtdCaminhao() {
        int totalCaminhao = 0;

        for(Automovel caminhao : listaAutomoveis) {
            if(caminhao instanceof Caminhao) {
                totalCaminhao += 1;
                System.out.println("Modelo: " + caminhao.getModelo());
            }
        }

        System.out.println("Quantidade: " + totalCaminhao);

    }


    // Verificar quantidade de motos
    public void qtdMoto() {
        int totalMoto = 0;

        for(Automovel moto : listaAutomoveis) {
            if(moto instanceof Moto) {
                totalMoto += 1;
                System.out.println("Modelo: " + moto.getModelo());
            }
        }

        System.out.println("Quantidade: " + totalMoto);
    }

    // Calcula Ganho com a venda de todos os produtos cadastrados
    public double calcTotalPreco() {
        double totapPreco = 0;
        for(Vendavel p : listaAutomoveis) {
            totapPreco += p.getValorTotal();
        }

        return totapPreco;
    }

    @Override
    public String toString() {
        return "CorretoraAutomoveis" +
                "listaAutomoveis: " + listaAutomoveis;
    }

}
