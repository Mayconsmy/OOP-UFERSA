package Lista03.src.questao08;

import java.util.List;

public class Prato {
    protected String nome;
    protected double preco;
    protected int tempoPreparo;
    protected List<String> ingredientes;

    public Prato(String nome, double preco, int tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public double calcularTaxaServico() {
        return this.preco * 0.10;
    }

    public void exibirCardapio() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Tempo de Preparo: " + this.tempoPreparo + " min");
        System.out.println("Ingredientes: " + this.ingredientes);
        System.out.println("Taxa de Serviço: R$" + this.calcularTaxaServico());
    }
}
