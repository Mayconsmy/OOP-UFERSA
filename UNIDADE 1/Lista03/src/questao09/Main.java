package Lista03.src.questao09;

public class Main {
    public static void main(String[] args) {
        int diasAtraso = 10;

        System.out.println("livro didatico");
        LivroDidatico didatico = new LivroDidatico("Cálculo Vol. 1", "James Stewart", 2010, 150.0, "Matemática");
        didatico.exibirFichaCatalografica();
        System.out.println("Multa por " + diasAtraso + " dias de atraso: R$" + didatico.calcularMultaAtraso(diasAtraso));

        System.out.println("\nlivro raro");
        LivroRaro raro = new LivroRaro("Dom Quixote 1ª Edição", "Miguel de Cervantes", 1605, 5000.0, true);
        raro.exibirFichaCatalografica();
        System.out.println("Multa por " + diasAtraso + " dias de atraso: R$" + raro.calcularMultaAtraso(diasAtraso));
    }
}
