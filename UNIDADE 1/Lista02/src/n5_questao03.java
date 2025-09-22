package Lista02.src;

import java.util.Scanner;

public class n5_questao03 {
    void run(){
        Scanner input = new Scanner(System.in);
        int x, maio = 0, menor = 0, igual = 0;
        int[] vet = new int[10];

        for(int i = 0; i < 10; i++){
            int num;
            do {
                System.out.printf("numero %dº:  ", i + 1);
                num = input.nextInt();
                if(num <= 0){
                    System.out.print("Número invalido!");
                }
            } while(num <= 0);
            vet[i] = num;
        }
        do{
            System.out.print("Informe o numero X(positivo)");
            x = input.nextInt();
            if(x <= 0){
                System.out.print("Número invalido!");
            }
        }while(x <= 0);

        for(int i = 0; i < vet.length; i++ ){
            if(vet[i] > x){
                maio++;
            } else if(vet[i] < x){
                menor++;
            } else {
                igual++;
            }
        }
        System.out.printf("Qtd de numeros maiores q X: %d", maio);
        System.out.printf("Qtd de numeros menores q X: %d", menor);
        System.out.printf("Qtd de numeros iguais a X: %d", igual);
    }
}
