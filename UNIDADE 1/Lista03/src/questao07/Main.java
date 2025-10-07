package Lista03.src.questao07;

public class Main {
    public static void main(String[] args) {
        System.out.println("futebol");
        Futebol fut = new Futebol("Futebol", 22, 90, "Muito Alta", "105m x 68m");
        fut.exibirRegras();

        System.out.println("\nbasquete");
        Basquete basq = new Basquete("Basquete", 10, 50, "media", 3.00);
        basq.exibirRegras();
    }
}
