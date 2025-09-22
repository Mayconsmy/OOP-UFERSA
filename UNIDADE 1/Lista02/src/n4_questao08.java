package Lista02.src;

import java.util.Scanner;

public class n4_questao08 {
    void run(){
        Scanner input = new Scanner(System.in);

        boolean executando = true;
        int n1,qtdalunos = 0;
        float somanotas = 0;
        while(executando){
            System.out.print("Informe sua matricula(apenas numeros)");
            int matricula = input.nextInt();
            System.out.print("\nInforme a nota na prova");
            n1 = input.nextInt();
            somanotas += n1;
            qtdalunos++;
            System.out.print("\npressione 0 para encerrar o calculo das medias");
            int n = input.nextInt();
            if(n == 0){ executando = false; }
        }
        float media =  somanotas/qtdalunos;
        System.out.printf("A media das notas foi: %.2f\n", media);
    }
}
