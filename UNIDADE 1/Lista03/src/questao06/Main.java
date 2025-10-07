package Lista03.src.questao06;

public class Main {
    public static void main(String[] args) {
        System.out.println("filme");
        Filme filme = new Filme("Castelo Infinito(Demon Slayer)", 2025, 180, 50.0, "Haruo Sotozaki", "Crime");
        filme.exibirInfo();

        System.out.println("\nserie");
        Serie serie = new Serie("Game of Thrones", 2011, 45, 120.0, 8, 12);
        serie.exibirInfo();
    }
}
