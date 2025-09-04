package LISTAS;

import java.util.Scanner;

public class lista1java {
    public class condicionais {
        public static void questao1() {
            int qtdmin, qtdmax;

            System.out.println("Digite a quantidade minima: ");
            qtdmin = new Scanner(System.in).nextInt();
            System.out.println("Digite a quantidade maxima: ");
            qtdmax = new Scanner(System.in).nextInt();
            double estoquemedio = (float)(qtdmin + qtdmax) / 2;
            System.out.printf("O estoque calculado foi: %.2f", estoquemedio);

        }

        public static void questao2() {
            double cotacaodolar, valordolar, converter_dolar_real;

            System.out.println("Digite a cotação atual do dolar: ");
            cotacaodolar = new Scanner(System.in).nextDouble();
            System.out.println("Digite um valor em dolar: ");
            valordolar = new Scanner(System.in).nextDouble();
            converter_dolar_real = valordolar / cotacaodolar;
            System.out.printf("\nO valor em reais é: %.2f", converter_dolar_real);
        }

        public static void questao3() {
            int idvendedor, codpeca, qtdvendida;
            double precounitario, comissao;

            System.out.println("Informe o id do vendedor: ");
            idvendedor = new Scanner(System.in).nextInt();
            System.out.println("Informe o codigo da peça: ");
            codpeca = new Scanner(System.in).nextInt();
            System.out.println("Informe o preço Unitario da peça: ");
            precounitario = new Scanner(System.in).nextDouble();
            System.out.println("Informe a quantidade de peças vendidas: ");
            qtdvendida = new Scanner(System.in).nextInt();
            comissao = (qtdvendida*precounitario)*0.05;
            System.out.printf("Sua commissão de venda foi: %.2f", comissao);

        }

        public static void questao4() {
            int soma, mult, valorA, valorB, valorC, valorD;
            System.out.printf("""
                    \n
                    Informe o valor de A:
                    Informe o valor de B:
                    Informe o valor de C:
                    Informe o valor de D:
                    """);
            valorA = new Scanner(System.in).nextInt();
            valorB = new Scanner(System.in).nextInt();
            valorC = new Scanner(System.in).nextInt();
            valorD = new Scanner(System.in).nextInt();

            soma = (valorA+valorB)+(valorA+valorC)+(valorA+valorD)+(valorB+valorC)+(valorB+valorD)+(valorC+valorD);
            mult = (valorA*valorB)+(valorA*valorC)+(valorA*valorD)+(valorB*valorC)+(valorB*valorD)+(valorC*valorD);

            System.out.printf("""
                    \n
                    O valor da Soma distrubutiva é: %d
                    O valor da multiplicação distributiva é: %d
                    """, soma, mult);

        }

        public static void questao5() {

        }

        public static void questao6() {
        }

        public static void questao7() {
        }

        public static void questao8() {
        }

        public static void questao9() {
        }

        public static void questao10() {
        }
    }
}