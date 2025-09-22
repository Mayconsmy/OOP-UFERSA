package Lista02.src;

import java.util.Scanner;

public class n5_questao04 {
    void run(){
        Scanner input = new Scanner(System.in);

        String[] nomes = new String[20];
        int[] idades = new int[20];
        String[] aptas;
        int cont = 0;
        for(int i = 0; i < 20; i++){
            System.out.printf("Candidata %d", i + 1);
            System.out.print("nome: ");
            nomes[i] = input.nextLine();
            System.out.print("idade: ");
            idades[i] = input.nextInt();
            input.nextLine();

            //verificar candidatas aptas
            if(idades[i] >= 18 && idades[i] <= 20){
                cont++;
            }
        }
        aptas = new String[cont];
        int index = 0;
        for(int i = 0; i < 20; i++){
            aptas[index] = nomes[i];
            index++;
        }
        System.out.printf("Total de candidatas aptas: %d",cont);
        if(cont > 0){
            System.out.print("Nome das candidatas aptas");
            for(String nome : aptas){
                System.out.print(nome + " ");
            }
        } else {
            System.out.print("Não existe candidatas aptas");
        }

        input.close();
    }
}
