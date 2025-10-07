package Lista03.src.questao10;

public class Onibus extends Transporte {
    private int numeroEixos;

    public Onibus(int capacidadePassageiros, int velocidadeMaxima, double consumo, double preco, int numeroEixos) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        double custoBase = super.calcularCustoViagem(distancia);
        return custoBase * 0.80; // 20% de desconto
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de Eixos: " + this.numeroEixos);
    }
}
