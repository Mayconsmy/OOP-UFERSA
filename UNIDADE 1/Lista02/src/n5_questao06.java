package Lista02.src;

import java.util.Scanner;
import java.util.Random;
public class n5_questao06 {
    void run(){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int tentativa;
        int tentativas = 0;
        int nsort = rand.nextInt(101);
        System.out.print("""
                JOGO DA ADIVINHACAO
                Tente adivinhar o numero sorteado entre 0 e 100
                """);

        do {
            System.out.print("Informe sua tentativa: ");
            tentativa = input.nextInt();
            if(tentativa < nsort){
                System.out.printf("O numero sorteado é maior q %d", tentativa);
            } else if ( tentativa > nsort){
                System.out.printf("O numero sorteado é menor q %d", tentativa);
            } else {
                System.out.printf("Congratulations! você acertou o numero(%d)!",nsort);
            }
            tentativas++;
        }while (tentativa != nsort);
    }
}
