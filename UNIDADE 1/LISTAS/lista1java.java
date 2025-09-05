import java.util.Scanner;

public class lista1java {
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
            System.out.print("""
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
            float tempogasto, velocmed, distancia, litros_usados;
            System.out.println("Informe o tempo gasto na viagem: ");
            tempogasto = new Scanner(System.in).nextFloat();
            System.out.println("Informe a velocidade media: ");
            velocmed = new Scanner(System.in).nextFloat();
            distancia = velocmed *  tempogasto;
            litros_usados = distancia/12;
            System.out.printf("""
                    O tempo gasto na Corrida foi: %f
                    A velocidade media da corrida foi: %f
                    A distancia percorrida foi: %.2f
                    A quantidade de litros usados foi:  %.2f
                    """,tempogasto, velocmed, distancia, litros_usados);
        }

        public static void questao6() {
            int fahrenheit, celsius;
            System.out.println("Informe a temperatura em Celsius: ");
            celsius = new Scanner(System.in).nextInt();
            fahrenheit = (9*celsius+160)/5;
            System.out.printf("A temperatura convertida de celsius para fahrenheit é: %d", fahrenheit);
        }

        public static void questao7() {
            int fahrenheit, celsius;
            System.out.println("Informe a temperatura em fahrenheit: ");
            fahrenheit = new Scanner(System.in).nextInt();
            celsius = (fahrenheit-32)*5/9;
            System.out.printf("A temperatura convertida de fahrenheit para celsius é: %d", celsius);
        }

        public static void questao8() {
            float raio,altura;
            double volume;
            System.out.println("Informe a raio da lata: ");
            raio = new Scanner(System.in).nextFloat();
            System.out.println("Informe a altura da lata: ");
            altura = new Scanner(System.in).nextFloat();
            volume = 3.14159*raio*raio*altura;
            System.out.printf("O volume da lata é: %.2f", volume);
        }

        public static void questao9() {
            int anos,meses,dias,idade;
            System.out.println("Informe quantos anos você tem: ");
            anos = new Scanner(System.in).nextInt();
            System.out.println("Informe quantos meses você tem: ");
            meses = new Scanner(System.in).nextInt();
            System.out.println("Informe quantos dias você tem: ");
            dias = new Scanner(System.in).nextInt();
            idade = anos*365+meses*30+dias;
            System.out.printf("Sua idade expressa em dias é: %d", idade);
        }

        public static void questao10() {
            int n1,n2;
            System.out.println("Informe um numero inteiro: ");
            n1 = new Scanner(System.in).nextInt();
            System.out.println("Informe outro numero inteiro: ");
            n2 = new Scanner(System.in).nextInt();
            if (n1>=n2){
                System.out.printf("%d é maior ou igual a %d", n1, n2);
                if (n1 == n2){
                    System.out.printf("%d é igual a %d", n1, n2);
                }
                if (n1 != n2){
                    System.out.printf("%d é diferente de %d", n1, n2);
                }
            }
            else {
                System.out.printf("%d é menor ou igual a %d", n1, n2);
            }

        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        lista1java.questao1();
//        lista1java.questao2();
//        lista1java.questao3();
//        lista1java.questao4();
//        lista1java.questao5();
//        lista1java.questao6();
//        lista1java.questao7();
//        lista1java.questao8();
//        lista1java.questao9();
//        lista1java.questao10();
    }