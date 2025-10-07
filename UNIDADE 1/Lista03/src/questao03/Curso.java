package Lista03.src.questao03;

public class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected double preco;
    protected String nivel;

    public Curso(String nome, int cargaHoraria, double preco, String nivel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public double calcularDesconto() {
        return this.preco * 0.10;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga Horária: " + this.cargaHoraria + "h");
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Desconto: R$" + this.calcularDesconto());
    }
}