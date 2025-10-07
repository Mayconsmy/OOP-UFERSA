package Lista03.src.questao07;

public class Basquete extends Esporte {
    private double alturaCesta;

    public Basquete(String nome, int numeroJogadores, int duracaoPartida, String popularidade, double alturaCesta) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }

    @Override
    public double calcularCustoEquipamento() {
        return 400.00;
    }

    @Override
    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Altura da Cesta: " + this.alturaCesta + "m");
    }
}
