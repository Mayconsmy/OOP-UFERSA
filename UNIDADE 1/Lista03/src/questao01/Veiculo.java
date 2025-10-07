package Lista03.src.questao01;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public double calcularIpva() {
        return this.preco * 0.04;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("IPVA: R$" + this.calcularIpva());
    }
}

