package Lista02.src;

import java.util.Scanner;

public class n3_questao01 {

    void run(){
        Scanner input = new Scanner(System.in);
        int n1, n2, escolha;
        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = input.nextInt();
        System.out.print("""
                Escolha a operação:
                1 - Adição
                2 - Subtracao
                3 - Multiplicacao
                4 - Divisao
                0 - Sair
                """);
        escolha = input.nextInt();
        switch (escolha) {
            case 1:
                System.out.printf("O Resultado de %d + %d = %d\n", n1, n2, (n1 + n2));
                break;
            case 2:
                System.out.printf("O Resultado de %d - %d = %d\n", n1, n2, (n1 - n2));
                break;
            case 3:
                System.out.printf("O Resultado de %d * %d = %d\n", n1, n2, (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Divisão invalida");
                    break;
                }
                System.out.printf("O Resultado de %d / %d = %d\n", n1, n2, (n1 / n2));
                break;
            case 0:
                System.out.print("Encerrando o programa...");
                break;
        }
    }
}
