package Lista03.src.questao06;

public class Filme extends Midia {
    private String diretor;
    private String genero;

    public Filme(String titulo, int anoLancamento, int duracao, double preco, String diretor, String genero) {
        super(titulo, anoLancamento, duracao, preco);
        this.diretor = diretor;
        this.genero = genero;
    }

    @Override
    public double calcularPrecoAluguel() {
        return this.preco * 0.15;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Gênero: " + this.genero);
    }
}
