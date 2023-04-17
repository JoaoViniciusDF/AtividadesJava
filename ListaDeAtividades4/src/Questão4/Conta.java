package Questão4;

public class Conta implements Cartao {
    private double saldo;
    private double valorDeDeposito;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    // sobrescrita de metodos da interface
    @Override
    public void validar(double valor) {
        if (saldo > valor) {
            saldo -= valor;
            System.out.println("Valor debitado: " + valor + "\nSaldo restante: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // gets
    public double getSaldo() {
        return saldo;
    }

    // metodos de conta
    public double depositar(double valorDeDeposito) {
        saldo = saldo + valorDeDeposito;
        return saldo;
    }

}
