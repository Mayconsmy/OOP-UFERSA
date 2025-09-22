package Lista02.src;

import java.util.Scanner;

public class n4_questao05 {
    void run(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Informe um numero para ver a sua tabuada: ");
        num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d",num,i,(num*i));
        }
    }
}
