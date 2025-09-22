package Lista02.src;

import java.util.Scanner;

public class n4_questao02 {
    void run(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("informe quantos numeros deseja processar");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.printf("Informe o %dº numero:",i);
            int result = sc.nextInt();

            long fat = 1;
            for(int j = 1; j <= result; j++){
                fat *= j;
            }

            System.out.printf("O fatorial de %d é %d",num,result );
        }
    }
}
