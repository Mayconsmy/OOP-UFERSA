package Lista02.src;

import javax.print.DocFlavor;
import java.util.Scanner;

public class n4_questao12 {
    void run(){
        Scanner input = new Scanner(System.in);
        boolean executando = false;
        int indice;
        while(executando){
            System.out.print("Informe o indice de poluição: ");
            indice = input.nextInt();
            if(indice == 0.0){break;}
            if(indice >= 0.05 && indice <= 0.25){
                System.out.print("índice de poluição aceitáve");
            } else if (indice >= 0.3 && indice < 0.4) {
                System.out.print("indústrias do 1º grupo são intimadas a suspenderem suas atividades");
            } else if (indice >= 0.4 && indice < 0.5) {
                System.out.print("indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades");
            } else if (indice >= 0.5) {
                System.out.print("indústrias do 1º 2º e 3º grupo são intimadas a suspenderem suas atividades");
            } else {
                System.out.print("Valor Inválido");
            }


            System.out.print("Deseja encerrar o programa? (press 'S')");
            String opcao = input.next();
            if(opcao.equalsIgnoreCase("S")){
                System.out.print("Encerrando o programa");
                break;
            }
        }
    }
}
