package Lista03.src.questao08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("prato vegano");
        PratoVegano vegano = new PratoVegano("Moqueca", 55.0, 30, Arrays.asList("Palmito", "Leite de Coco", "Azeite de Dendê"), "Selo Vegano Brasil");
        vegano.exibirCardapio();

        System.out.println("\nprato gourmet");
        PratoGourmet gourmet = new PratoGourmet("Risoto de Camarão", 95.0, 40, Arrays.asList("Arroz Arbóreo", "Camarão", "Vinho Branco"), "Chef Fogaça");
        gourmet.exibirCardapio();
    }
}
