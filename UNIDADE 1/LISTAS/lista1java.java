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
            converter_dolar_real = valordolar * cotacaodolar;
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
                    O tempo gasto na Corrida foi: %.2f minutos
                    A velocidade media da corrida foi: %.2f m/s
                    A distancia percorrida foi: %.2f m
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

        public static void questao11() {
            int A,B,N;
            System.out.println("Informe o primeiro numero: ");
            A = new Scanner(System.in).nextInt();
            System.out.println("Informe o segundo numero: ");
            B = new Scanner(System.in).nextInt();
            System.out.printf("""
                    valores antes da troca:
                    valor de A: %d
                    valor de B: %d
                    """,A,B);
            N = B;
            B = A;
            A = N;
            System.out.printf("""
                    valores depois da troca:
                    valor de A: %d
                    valor de B: %d
                    """,A,B);
        }

        public static void questao12() {
            int x;
            System.out.println("Informe um numero inteiro: ");
            x = new Scanner(System.in).nextInt();
            if (x >= 0) {
                System.out.printf("%d",x);
            }
            else {
                x = x*-1;
                System.out.printf("%d",x);
            }
        }

        public static void questao13() {
            Scanner sc = new Scanner(System.in);
            int[] numeros = new int[5];

            // Entrada dos números
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                numeros[i] = sc.nextInt();
            }

            // Ordenando por bubblesort
            for (int i = 0; i < numeros.length - 1; i++) {
                for (int j = 0; j < numeros.length - 1 - i; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        // Troca os elementos
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }

            System.out.print("\nOrdem crescente: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
            }

            System.out.print("\nOrdem decrescente: ");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        }

        public static void questao14() {
            int a,b,dif;
            System.out.println("informe um numero inteiro:");
            a = new Scanner(System.in).nextInt();
            System.out.println("Informe outro numero inteiro:");
            b = new Scanner(System.in).nextInt();
            if (a > b) {
                dif = a - b;
            }
            else {
                dif = b - a;
            }
            System.out.printf("A diferença dos numeros é %d", dif);
        }

        public static void questao15() {
            float nota1,nota2,nota3,nota4,reculp,result;
            System.out.println("Informe a primeira nota: ");
            nota1 = new Scanner(System.in).nextFloat();
            System.out.println("Informe a segunda nota: ");
            nota2 = new Scanner(System.in).nextFloat();
            System.out.println("Informe a terceira nota: ");
            nota3 = new Scanner(System.in).nextFloat();
            System.out.println("Informe a quarto nota: ");
            nota4 = new Scanner(System.in).nextFloat();
            result = (nota1 + nota2 + nota3 + nota4) / 4;
            if (result >= 7) {
                System.out.println("Aluno APROVADO!");
            }
            else {
                System.out.println("Aluno na quarta prova, por favor informe a nota da recuperação: ");
                reculp = new Scanner(System.in).nextFloat();
                result = (nota1 + nota2 + nota3 + nota4 + reculp)/4;
                if (result >= 7) {
                    System.out.println("Aluno APROVADO!");
                }
                else {
                    System.out.println("Aluno REPROVADO!");
                }
            }

        }

        public static void questao16() {
            int n1,n2;
            System.out.println("Informe um numero inteiro: ");
            n1 = new Scanner(System.in).nextInt();
            System.out.println("Informe outro numero inteiro: ");
            n2 = new Scanner(System.in).nextInt();
            if (n1 > n2) {
                System.out.printf("%d é o maior numero", n1);
            }
            else if (n1 < n2) {
                System.out.printf("%d é o maior numero", n2);
            }
            else {
                System.out.printf("%d é igual a %d", n1, n2);
            }
        }

        public static void questao17() {
            int n1;
            System.out.println("Informe um numero inteiro: ");
            n1 = new Scanner(System.in).nextInt();
            if (n1 >= 0 && n1 <= 9){
                System.out.print("Valor valido!");
            }
            else  {
                System.out.print("Valor invalido!");
            }
        }

        public static void questao18() {
            int CODIGO;
            System.out.println("Informe um numero inteiro entre 1 e 3");
            CODIGO = new Scanner(System.in).nextInt();
            System.out.print("Valor valido!");
            if (CODIGO >= 1 && CODIGO <= 3){
                switch (CODIGO) {
                    case 1:
                        System.out.println("UM");
                    break;
                    case 2:
                        System.out.println("DOIS");
                    break;
                    case 3:
                        System.out.println("TRES");
                    break;
                }
            }
            else {
                System.out.print("Valor invalido!");
            }
        }

        public static void questao19() {
            int ladoA,ladoB,ladoC;
            System.out.println("Informe o lado A do triangulo: ");
            ladoA = new Scanner(System.in).nextInt();
            System.out.println("Informe o lado B do triangulo: ");
            ladoB = new Scanner(System.in).nextInt();
            System.out.println("Informe o lado C do triangulo: ");
            ladoC = new Scanner(System.in).nextInt();
            if(ladoA < ladoB + ladoC && ladoB < ladoC + ladoA && ladoC < ladoA + ladoB) {
                if(ladoA == ladoB && ladoB == ladoC) {
                    System.out.println("TRIANGULO EQUILATERO");
                }
                else if(ladoA == ladoB || ladoA == ladoC) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
                else {
                    System.out.println("TRIANGULO É ESCALENO");
                }
            }
            else{
                System.out.print("ERROR");
            }
        }

        public static void questao20() {
            int A,B,C,maior;

            do {
                System.out.println("Informe um valor maior q zero ");
                A = new Scanner(System.in).nextInt();
                if(A <= 0) System.out.println("tente novamente");
            }while(A <= 0);

            do {
                System.out.println("Informe um valor maior q zero ");
                B = new Scanner(System.in).nextInt();
                if(B <= 0) System.out.println("tente novamente");
            }while(B <= 0);

            do {
                System.out.println("Informe um valor maior q zero ");
                C = new Scanner(System.in).nextInt();
                if(C <= 0) System.out.println("tente novamente");
            }while(C <= 0);

            maior = A;
            if(B > maior) {
                maior = B;
            }
            if(C > maior){
                maior = C;
            }

            int menor = A;
            if(B < menor) {
                menor = B;
            }
            if(C < menor){
                menor = C;
            }

            int mult = maior * menor;
            float div = maior / menor;
            System.out.printf("Maior valor %d\n",maior);
            System.out.printf("Menor valor %d\n",menor);
            System.out.printf("menor * maior = %d\n", mult);
            System.out.printf("menor / menor = %.2f", div);
        }

        public static void questao21() {
            int n1;
            System.out.println("Informe um numero inteiro: ");
            n1 = new Scanner(System.in).nextInt();
            if (n1 >= 0){
                System.out.print("numero positivo: ");
            }
            else{
                System.out.print("numero negativo: ");
            }
        }

        public static void questao22() {
            int n1,A = 0,B = 0;
            System.out.println("Informe um numero inteiro: ");
            n1 = new Scanner(System.in).nextInt();
            if (n1 >= 0){
                A = n1;
            }
            else{
                B = n1;
            }
            System.out.printf("A = %d e B = %d",A,B);
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
//        lista1java.questao11();
//        lista1java.questao12();
//        lista1java.questao13();
//        lista1java.questao14();
//        lista1java.questao15();
//        lista1java.questao16();
//        lista1java.questao17();
//        lista1java.questao18();
//        lista1java.questao19();
//        lista1java.questao20();
//        lista1java.questao21();
//        lista1java.questao22();

    }
//NOME: Maycon Soares Maia
//MATRICULA: 2024010450
