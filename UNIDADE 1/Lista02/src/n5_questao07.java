package Lista02.src;

import java.util.Scanner;

public class n5_questao07 {
    void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro caractere entre A-Z ");
        char primeirocaracter = input.next().toUpperCase().charAt(0);

        System.out.print("Digite o Segundo caractere entre A-Z ");
        char segundocaracter = input.next().toUpperCase().charAt(0);

        if(primeirocaracter < 'A' || primeirocaracter > 'Z' || segundocaracter < 'A' || segundocaracter > 'Z'){
            System.out.print("Caracter Invalido!");
        }
        if(primeirocaracter >= segundocaracter){
            int qtd = segundocaracter-primeirocaracter-1;
            System.out.printf("Existem %d caracteres entre %s e %S",qtd,primeirocaracter,segundocaracter);
        }
    }
}
