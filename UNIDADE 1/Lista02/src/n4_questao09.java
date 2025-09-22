package Lista02.src;

import java.util.Scanner;

public class n4_questao09 {
    void run(){
        Scanner input = new Scanner(System.in);
        int n;
        int n_min = Integer.MAX_VALUE;
        int n_max = Integer.MIN_VALUE;
        System.out.print("Informe um numero positivo\n(informe um negativo para encerrar)");

        while(true){
            n = input.nextInt();
            if(n < 0){break;}
            if(n < n_min){
                n_min = n;
            }
            if(n > n_max){
                n_max = n;
            }
        }
        System.out.printf("Menor numero: %d", n_min);
        System.out.printf("Maior numero: %d", n_max);
    }
}
