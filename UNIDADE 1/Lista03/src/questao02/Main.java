package Lista03.src.questao02;

public class Main {
    public static void main(String[] args) {
        System.out.println("dados da Conta Corrente");
        ContaCorrente cc = new ContaCorrente("546-4", 1500.0, "maycon soares", 300.0);
        cc.consultarSaldo();
        cc.sacar(1000.0);
        cc.consultarSaldo();
        cc.depositar(400.0);
        cc.consultarSaldo();

        System.out.println("\ndados da Conta Poupança");
        ContaPoupanca cp = new ContaPoupanca("123-4", 2500.0, "Bruno Borges", 0.05);
        cp.consultarSaldo();
        cp.aplicarRendimento();
        cp.consultarSaldo();
        cp.sacar(150.0);
        cp.consultarSaldo();
    }
}