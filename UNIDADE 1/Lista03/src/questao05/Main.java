package Lista03.src.questao05;

public class Main {
    public static void main(String[] args) {
        System.out.println("smartphone");
        Smartphone celular = new Smartphone("samsung", "Galaxy S23", 4500.0, 110, 6.1, 3900);
        celular.exibirEspecificacoes();

        System.out.println("\nnotebook");
        Notebook notebook = new Notebook("Dell", "XPS 15", 9800.0, 220, "Intel Core i7", 16);
        notebook.exibirEspecificacoes();
    }
}
