package Lista03.src.questao05;

public class ProdutoEletronico {
    protected String marca;
    protected String modelo;
    protected double preco;
    protected int voltagem;

    public ProdutoEletronico(String marca, String modelo, double preco, int voltagem) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }

    public double calcularGarantiaEstendida() {
        return this.preco * 0.15;
    }

    public void exibirEspecificacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Voltagem: " + this.voltagem + "V");
        System.out.println("Garantia Estendida: R$" + this.calcularGarantiaEstendida());
    }
}
