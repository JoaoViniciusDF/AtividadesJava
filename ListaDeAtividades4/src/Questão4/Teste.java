package Questão4;

public class Teste {
    public static void main(String[] args) {

        Conta conta = new Conta(1000);
        Cartao cartaoDebito = new CartaoDebito(conta);
        Cliente cliente = new Cliente(cartaoDebito);
        cliente.requererValidacao(100);

    }
}