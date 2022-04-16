public class TesteTributo {

    public static void main(String[] args) {
        Alimento alimento = new Alimento(1,"Banana",10.00,10);
        Perfume perfume = new Perfume(1,"Perfume",35.99,"Rosas");
        Servico servico = new Servico("servico",1.000);
        Tributo tributo = new Tributo();

        tributo.adicionarTributavel(alimento);
        tributo.adicionarTributavel(perfume);
        tributo.adicionarTributavel(servico);

        System.out.println("Total Tributo: " + tributo.calcularTotalTributo());


    }
}
