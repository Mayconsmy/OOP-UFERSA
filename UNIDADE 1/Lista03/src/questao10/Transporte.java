package Lista03.src.questao10;

public class Transporte {
    protected int capacidadePassageiros;
    protected int velocidadeMaxima;
    protected double consumo;
    protected double preco;

    public Transporte(int capacidadePassageiros, int velocidadeMaxima, double consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }

    public double calcularCustoViagem(double distancia) {
        return (distancia / this.consumo) * 5.50;
    }

    public void exibirDados() {
        System.out.println("Capacidade: " + this.capacidadePassageiros + " passageiros");
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + this.consumo + " km/l");
        System.out.println("Preço: R$" + this.preco);
    }
}