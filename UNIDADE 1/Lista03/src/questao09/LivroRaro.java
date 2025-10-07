package Lista03.src.questao09;

public class LivroRaro extends Livro {
    private boolean edicaoLimitada;

    public LivroRaro(String titulo, String autor, int anoPublicacao, double preco, boolean edicaoLimitada) {
        super(titulo, autor, anoPublicacao, preco);
        this.edicaoLimitada = edicaoLimitada;
    }

    @Override
    public double calcularMultaAtraso(int dias) {
        return 5.00 * dias;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Edição Limitada: " + (this.edicaoLimitada ? "Sim" : "Não"));
    }
}
