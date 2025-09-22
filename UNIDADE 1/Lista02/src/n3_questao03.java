package Lista02.src;
import java.util.Scanner;

public class n3_questao03 {
    void run(){
        Scanner input = new Scanner(System.in);
        float h, pesoideal = 0;
        int sexo;

        System.out.print("""
                Informe 1 para Sexo Masculino
                Informe 2 para Sexo Feminino
                """);

        sexo = input.nextInt();
        System.out.print("\nInforme sua altura: ");
        h = input.nextFloat();
        if(sexo == 1){
            pesoideal = (float) (72.7 * h) - 58;
        } else if (sexo == 2) {
            pesoideal = (float) (62.1 * h) - 44;
        }
        System.out.printf("Seu peso ideal é %.2f",pesoideal);
    }
}
