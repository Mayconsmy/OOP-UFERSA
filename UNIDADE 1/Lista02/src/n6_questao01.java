package Lista02.src;

import java.util.Scanner;

public class n6_questao01 {
    public static double reajuste(double salario, double reajuste){
        double ValorReajuste = salario * (reajuste / 100);
        return salario + ValorReajuste;
    }
    void run(){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe seu salário: \n");
        float salario = input.nextFloat();
        System.out.print("Informe o indice de reajuste: \n");
        float reajuste = input.nextFloat();
        double SalarioAtual = reajuste(salario, reajuste);
        double Aumento = SalarioAtual - salario;
        System.out.printf("Valor do salario antes do reajuste: %.2f\n", salario);
        System.out.printf("Valor do salario depois do reajuste: %.2f\n", SalarioAtual);
        System.out.printf("Valor do aumento no salário: %.2f", Aumento);
    }
}
