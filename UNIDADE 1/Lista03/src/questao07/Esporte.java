package Lista03.src.questao07;

public class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected int duracaoPartida;
    protected String popularidade;

    public Esporte(String nome, int numeroJogadores, int duracaoPartida, String popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento() {
        return 500.00;
    }

    public void exibirRegras() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Jogadores: " + this.numeroJogadores);
        System.out.println("Duração: " + this.duracaoPartida + " min");
        System.out.println("Popularidade: " + this.popularidade);
        System.out.println("Custo base do equipamento: R$" + this.calcularCustoEquipamento());
    }
}
