package Lista02.src;

import java.util.Scanner;

public class n6_questao02 {
    public static int verifica(int n1) {
        if(n1%2==0) {
            System.out.printf("%d é par!",n1);
        } else {
            System.out.printf("%d é impar",n1);
        }
        return n1;
    }

    void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int n1 = input.nextInt();
        verifica(n1);
    }
}
