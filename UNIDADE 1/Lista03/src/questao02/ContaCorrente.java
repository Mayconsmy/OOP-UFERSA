package Lista03.src.questao02;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, String titular, double limiteChequeEspecial) {
        super(numeroConta, saldo, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= (this.saldo + this.limiteChequeEspecial)) {
            this.saldo -= valor;
        } else {
            System.out.println("Limite de saque excedido.");
        }
    }
}