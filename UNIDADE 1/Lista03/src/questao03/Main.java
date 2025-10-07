package Lista03.src.questao03;

public class Main {
    public static void main(String[] args) {
        System.out.println("curso padrao");
        Curso curso = new Curso("php basico", 30, 100.0, "Básico");
        curso.exibirInformacoes();

        System.out.println("\ncurso presencial");
        CursoPresencial presencial = new CursoPresencial("sql avançado", 60, 200.0, "Avançado", "Sala 1");
        presencial.exibirInformacoes();

        System.out.println("\ncurso online");
        CursoOnline online = new CursoOnline("AWS", 80, 300.0, "Intermediario/avançado", "Udemy");
        online.exibirInformacoes();
    }
}
