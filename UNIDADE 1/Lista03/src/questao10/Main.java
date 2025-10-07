package Lista03.src.questao10;

public class Main {
    public static void main(String[] args) {
        double distanciaViagem = 200.0;

        System.out.println("onibus");
        Onibus onibus = new Onibus(44, 100, 3.0, 350000.0, 2);
        onibus.exibirDados();
        System.out.println("Custo da viagem de " + distanciaViagem + "km: R$" + onibus.calcularCustoViagem(distanciaViagem));

        System.out.println("\nmetro");
        Metro metro = new Metro(1000, 90, 8.0, 5000000.0, true);
        metro.exibirDados();
        System.out.println("Custo da viagem de " + distanciaViagem + "km: R$" + metro.calcularCustoViagem(distanciaViagem));
    }
}