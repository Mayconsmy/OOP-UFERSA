package Lista03.src.questao01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Veiculo");
        Veiculo veiculo = new Veiculo("Fiat", "uno", 2005, 15000.00);
        veiculo.exibirDetalhes();

        System.out.println("\nmoto");
        Moto moto = new Moto("Honda", "Fan 125", 2003, 6000.00, 500);
        moto.exibirDetalhes();

        System.out.println("\ncaminhao");
        Caminhao caminhao = new Caminhao("Mercedez", "Benz", 2014, 450000.00, 50.0);
        caminhao.exibirDetalhes();
    }
}