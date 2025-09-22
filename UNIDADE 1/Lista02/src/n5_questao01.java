package Lista02.src;

import java.util.Scanner;

public class n5_questao01 {
    void run(){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor");
        int tam = input.nextInt();
        int[] n = new int[tam];

        for(int i = 0; i < tam; i++){
            System.out.printf("Digite o %dº numero: ",(i + 1));
            n[i] = input.nextInt();
        }

        //ordem inversa
        System.out.print("Ordem inversa: ");
        for(int i = tam - 1; i >= 0; i--){
            System.out.print(n[i] + " ");
        }
    }
}
