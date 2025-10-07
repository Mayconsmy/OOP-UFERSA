package Lista03.src.questao06;

public class Midia {
    protected String titulo;
    protected int anoLancamento;
    protected int duracao;
    protected double preco;

    public Midia(String titulo, int anoLancamento, int duracao, double preco) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }

    public double calcularPrecoAluguel() {
        return this.preco * 0.10;
    }

    public void exibirInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de Lançamento: " + this.anoLancamento);
        System.out.println("Duração: " + this.duracao + " min");
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Preço do Aluguel: R$" + this.calcularPrecoAluguel());
    }
}
