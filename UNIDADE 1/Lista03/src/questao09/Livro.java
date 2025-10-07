package Lista03.src.questao09;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;
    protected double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public double calcularMultaAtraso(int dias) {
        return 2.00 * dias;
    }

    public void exibirFichaCatalografica() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.anoPublicacao);
        System.out.println("Preço: R$" + this.preco);
    }
}
