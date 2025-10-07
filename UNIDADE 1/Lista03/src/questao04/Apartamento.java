package Lista03.src.questao04;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCondominio;

    public Apartamento(String endereco, double area, int numeroQuartos, double preco, int andar, double valorCondominio) {
        super(endereco, area, numeroQuartos, preco);
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    @Override
    public double calcularTaxaAdministracao() {
        return this.preco * 0.06;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Andar: " + this.andar);
        System.out.println("Condomínio: R$" + this.valorCondominio);
    }
}
