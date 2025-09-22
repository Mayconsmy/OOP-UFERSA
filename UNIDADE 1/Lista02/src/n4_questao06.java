package Lista02.src;

import java.util.Scanner;

public class n4_questao06 {
    void run(){
        Scanner sc = new Scanner(System.in);
        int SumPares = 0, SumImpares = 0;

        while(true){
            System.out.print("Digite um numero positivo (negativo para sair): ");
            int num = sc.nextInt();
            if (num < 0){break;}

            if(num % 2 == 0){
                SumPares += num;
            } else {
                SumImpares += num;
            }

        }
        System.out.printf("A soma dos numeros Pares foi: %d\n", SumPares);
        System.out.printf("A soma dos numeros impares foi: %d\n", SumImpares);
    }
}
