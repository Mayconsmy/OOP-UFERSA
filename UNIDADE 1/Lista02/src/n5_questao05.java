package Lista02.src;

import java.util.Scanner;

public class n5_questao05 {
    void run(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("informe o tamanho dos vetores (tamanho maximo : 50)");
        do {
            n = input.nextInt();
            if (n <= 0 || n > 50){
                System.out.print("Numero invalido");
            }

        } while(n <= 0 || n > 50);
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("%dº valor do vetor 1", i + 1);
            v1[i] = input.nextInt();
            System.out.printf("%dº valor do vetor 2", i + 1);
            v2[i] = input.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < n; i++){
            if (v1[i] == v2[i]){
                cont++;
            }
        }
        System.out.printf("Os vetores possuem %d valores identicos",cont);
    }
}
