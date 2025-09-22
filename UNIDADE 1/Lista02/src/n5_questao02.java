package Lista02.src;

import java.util.Scanner;

public class n5_questao02 {
    void run(){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho dos vetores");
        int n = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        //lendo os vetores
        System.out.print("Insira os elementos do Vetor X");
        for(int i = 0; i < n; i++){
            System.out.printf("x[%d] = ",i+1);
            x[i] = input.nextInt();
        }
        System.out.print("Insira os elementos do Vetor Y");
        for(int i = 0; i < n; i++){
            System.out.printf("y[%d] = ",i+1);
            y[i] = input.nextInt();
        }
        // produto escalar
        int prodt_escalar = 0;
        for(int i = 0; i < n; i++){
            prodt_escalar += x[i] * y[i];
        }
        System.out.printf("O produto escalar dos vetores é: %d", prodt_escalar);
    }
}
