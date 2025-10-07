package Lista03.src.questao04;

public class Main {
    public static void main(String[] args) {
        System.out.println("imovel padrao");
        Imovel imovel = new Imovel("Rua Deide costa, 101", 100.0, 4, 102000.0);
        imovel.exibirCaracteristicas();

        System.out.println("\napartamento");
        Apartamento ap = new Apartamento("Av. Independencia, 103", 85.0, 3, 450000.0, 10, 600.0);
        ap.exibirCaracteristicas();

        System.out.println("\ncasa");
        Casa casa = new Casa("Rua do padre, 123", 200.0, 4, 800000.0, 50.0, true);
        casa.exibirCaracteristicas();
    }
}
