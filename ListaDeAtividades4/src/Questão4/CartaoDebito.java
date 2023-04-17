package Questão4;

public class CartaoDebito implements Cartao {
    private Conta saldoConta;

    public CartaoDebito(Conta saldoConta) {
        super();
        this.saldoConta = saldoConta;
    }

    @Override
    public void validar(double valor) {
        System.out.println("Acesso validado.");
        saldoConta.validar(valor);
    }

}
