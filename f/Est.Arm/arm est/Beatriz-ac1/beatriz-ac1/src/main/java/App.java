public class App {
    public static void main(String[] args) {

        ControleImposto controle = new ControleImposto();

        BrinquedoIngresso brinquedoIngresso = new BrinquedoIngresso(12,"Montanha Russa",20.00,
                12);

        BrinquedoAlugado brinquedoAlugado = new BrinquedoAlugado(11,"Bicicleta",5.00,2);

        Socio socio = new Socio("Maria",5.000);

        System.out.println("Adicionando itens na lista");
        controle.adicionar(brinquedoAlugado);
        controle.adicionar(brinquedoIngresso);
        controle.adicionar(socio);

        System.out.println("--- Total Imposto ---");
        System.out.println(controle.totalImposto());

        System.out.println("--- Exibe ---");
        controle.exibe();


        /* Poderia existir uma classe funcionarios onde é calculado o seu imposto, essa classe
        * implementaria a classe Ivendavel e seu imposto seria de 15% da sua renda*/

    }
}
