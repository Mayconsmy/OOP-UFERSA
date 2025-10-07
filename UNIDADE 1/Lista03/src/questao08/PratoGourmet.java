package Lista03.src.questao08;

import java.util.List;

public class PratoGourmet extends Prato {
    private String chefResponsavel;

    public PratoGourmet(String nome, double preco, int tempoPreparo, List<String> ingredientes, String chefResponsavel) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.chefResponsavel = chefResponsavel;
    }

    @Override
    public double calcularTaxaServico() {
        return this.preco * 0.15;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Chef: " + this.chefResponsavel);
    }
}
