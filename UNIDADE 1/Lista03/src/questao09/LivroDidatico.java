package Lista03.src.questao09;

public class LivroDidatico extends Livro {
    private String disciplina;

    public LivroDidatico(String titulo, String autor, int anoPublicacao, double preco, String disciplina) {
        super(titulo, autor, anoPublicacao, preco);
        this.disciplina = disciplina;
    }

    @Override
    public double calcularMultaAtraso(int dias) {
        return 1.00 * dias;
    }

    @Override
    public void exibirFichaCatalografica() {
        super.exibirFichaCatalografica();
        System.out.println("Disciplina: " + this.disciplina);
    }
}
