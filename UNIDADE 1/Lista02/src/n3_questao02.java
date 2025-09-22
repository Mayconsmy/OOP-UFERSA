package Lista02.src;

import java.util.Scanner;

public class n3_questao02 {

    public void multiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.printf("%d é múltiplo de %d\n", n1, n2);
        } else if (n2 % n1 == 0) {
            System.out.printf("%d é múltiplo de %d\n", n2, n1);
        } else {
            System.out.println("Nenhum número é múltiplo do outro.");
        }
    }

    public void pares(int n1, int n2){
        if (n1 % 2 == 0) {
            System.out.printf("%d é par",n1);
        } else if (n2 % 2 == 0){
            System.out.printf("%d é par",n2);
        }else{
            System.out.print("Nenhum numero informado é par");
        }
    }

    public void media(int n1, int n2){
        int media = (n1 + n2) / 2;
        if (media >= 7) {
            System.out.print("Você esta acima da média");
        } else{
            System.out.print("Você esta abaixo da média");
        }
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.print("""
                1 – Verificar se um dos números lidos é ou não múltiplo do outro
                2 – Verificar se os dois números lidos são pares
                3 – Verificar se a média dos dois números é maior ou igual a 7.
                4 – Sair
               """);
        opcao = input.nextInt();
        return opcao;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        boolean executando = true;
        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = input.nextInt();

        do{
            int opcao = menu();

            switch (opcao){
                case 1:
                    multiplo(n1, n2);
                break;
                case 2:
                    pares(n1, n2);
                break;
                case 3:
                    media(n1, n2);
                break;
                case 4:
                    System.out.print("Saindo...");
                    executando = false;
            }
        } while (executando);
    }

}
