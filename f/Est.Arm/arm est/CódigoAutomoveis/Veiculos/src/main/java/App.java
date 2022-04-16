import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        CorretoraAutomoveis corretora = new CorretoraAutomoveis();

        Moto moto1 = new Moto("Motinha 2000","toyota",2020,"azul",1000.00,
                "A20B","Sim","Esporte");


        Caminhao caminhao1 = new Caminhao("Caminhao 300","Toyota",2019,"Vermelho",
                15000.00,"ABC12",6,"Carreta",200.00,8);

        Caminhao caminhao2 = new Caminhao("Caminhao 400","Toyota",2020,"Azul",
                25000.00,"CDE07",6,"Carreta",200.00,8);


        System.out.println("--- Adicionando Automoveis ---");
        corretora.adicionarAutomovel(moto1);
        corretora.adicionarAutomovel(caminhao1);
        corretora.adicionarAutomovel(caminhao2);

        System.out.println("--- Lista de Automoveis---");
        corretora.listarAutomovel();

        System.out.println("--- Total de Veiculos Cadastrados no Sistema ---");
        corretora.calcTotalVeiculos();

        System.out.println("--- Verificando Placa ---");

        String opcao = "s";
        while(!opcao.equalsIgnoreCase("n")) {
            System.out.println("Digite número da placa : ");
            var placaAuto= ler.nextLine();
            corretora.verificarPlaca(placaAuto);

            System.out.println("----------");

            System.out.println("Deseja procurar mais uma placa ? s = sim / n = não");
            opcao = ler.nextLine();

            while(!opcao.equalsIgnoreCase("n") && !opcao.equalsIgnoreCase("s")) {
                System.out.println("opção inválida");
                System.out.println("Digite novamente :");
                opcao = ler.nextLine();
            }
        }


        System.out.println("--- Verificando Quantidade Por Modelo ---");
        corretora.verificarExiste("Motinha 2000");

        System.out.println("--- verificando quantidade de caminhões ---");
        corretora.qtdCaminhao();

        System.out.println("--- verificando quantidade de Motos ---");
        corretora.qtdMoto();

        System.out.println("--- Valor Total dos Produtos Cadastrados ---");
        System.out.println(corretora.calcTotalPreco());

        System.out.println("--- Comprar Automovel ---");
        corretora.comprarAutomovel("CDE07");

        System.out.println("--- Sistema Atual ---");
        corretora.calcTotalVeiculos();
        corretora.listarAutomovel();


        System.out.println("--- Test Drive ---");

        caminhao2.ligar();

        caminhao2.acelerar();
        caminhao2.acelerar();
        caminhao2.acelerar();
        caminhao2.acelerar();

        caminhao2.frear();

        caminhao2.desligar();

        caminhao2.frear();

        caminhao2.desligar();
        caminhao2.desligar();

    }
}
