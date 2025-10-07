package Lista03.src.questao05;

public class Smartphone extends ProdutoEletronico {
    private double tamanhoTela;
    private int capacidadeBateria;

    public Smartphone(String marca, String modelo, double preco, int voltagem, double tamanhoTela, int capacidadeBateria) {
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return this.preco * 0.20;
    }

    @Override
    public void exibirEspecificacoes() {
        super.exibirEspecificacoes();
        System.out.println("Tamanho da Tela: " + this.tamanhoTela + "\"");
        System.out.println("Bateria: " + this.capacidadeBateria + "mAh");
    }
}
