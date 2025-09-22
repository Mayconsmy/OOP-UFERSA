package Lista02.src;

import java.util.Scanner;

public class n4_questao07 {
    void run(){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Informe um numero entre 1 e 9");
        n = input.nextInt();

        if(n <= 0 || n >= 10){
            System.out.print("Número inválido!");
            return;
        }

        if (n % 2 == 0){n++;}

        int soma = 0,contador = 0,atual = n;

        while(contador < 20){
            soma += atual * atual;
            atual += 2;
            contador++;
        }
        System.out.printf("\nA Soma total dos 20 primeiros impares é %d",soma);
    }
}
