package Lista02.src;

import java.util.Scanner;

public class n4_questao11 {
    void run() {
        Scanner input = new Scanner(System.in);
        int n,soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe um numero inteiro positivo: ");
            n = input.nextInt();

            if(n < 0){
                System.out.print("Numero invalido!");
                break;
            }

            soma += n;

            if (n < menor) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }
        }
        float media = (float) soma / 10;
        System.out.printf("O maior valor é %d\n", maior);
        System.out.printf("O menor valor é %d\n", menor);
        System.out.printf("A media dos numeros é %.2f\n", media);
    }
}
