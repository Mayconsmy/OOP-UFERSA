package Lista03.src.questao04;

public class Imovel {
    protected String endereco;
    protected double area;
    protected int numeroQuartos;
    protected double preco;

    public Imovel(String endereco, double area, int numeroQuartos, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
    }

    public double calcularTaxaAdministracao() {
        return this.preco * 0.08;
    }

    public void exibirCaracteristicas() {
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Área: " + this.area + "m²");
        System.out.println("Quartos: " + this.numeroQuartos);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Taxa de Administração: R$" + this.calcularTaxaAdministracao());
    }
}
