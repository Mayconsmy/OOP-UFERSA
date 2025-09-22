package Lista02.src;

import java.util.Scanner;

public class n6_questao04 {
    public static boolean equilatero(double lado1, double lado2, double lado3) {
        return (lado1 == lado2) && (lado2 == lado3);
    }
    public static boolean isoscele(double lado1, double lado2, double lado3) {
        return (lado1 == lado2) && (lado2 != lado3) ||
                (lado1 == lado3) && (lado1 != lado2) ||
                (lado2 == lado3) && (lado2 != lado1);
    }
    public static boolean escaleno(double lado1, double lado2, double lado3) {
        return (lado1 != lado2) && (lado1 != lado3) && (lado3 != lado2);
    }

    void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:  ");
        double lado1 = input.nextDouble();
        System.out.println("Digite o segundo lado:  ");
        double lado2 = input.nextDouble();
        System.out.println("Digite o terceiro lado:  ");
        double lado3 = input.nextDouble();

        boolean equilatero = equilatero(lado1, lado2, lado3);
        boolean isoscele = escaleno(lado1, lado2, lado3);
        boolean escaleno = isoscele(lado1, lado2, lado3);

        System.out.println("Classificação do Triângulo: ");
        System.out.printf("Lados: %.1f %.1f %.1f\n", lado1, lado2, lado3);

        if (equilatero) {
            System.out.print("Equilátero: Possui todos os três lados com a mesma medida.\n");
        } else if (isoscele){
            System.out.print("Isósceles: Tem dois lados com a mesma medida e um lado com medida diferente.\n");
        } else if (escaleno) {
            System.out.print("Escaleno: Apresenta todos os três lados com medidas diferentes.\n");
        }


    }
}
