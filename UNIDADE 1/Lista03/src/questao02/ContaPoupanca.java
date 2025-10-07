package Lista03.src.questao02;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldo, String titular, double taxaRendimento) {
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        this.saldo += this.saldo * this.taxaRendimento;
    }
}