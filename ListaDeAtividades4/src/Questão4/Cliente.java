package Questão4;

public class Cliente {
    Cartao cartaoDeDebito;

    public Cliente(Cartao cartaoDeCartao) {
        super();
        this.cartaoDeDebito = cartaoDeDebito;
    }

    public void requererValidacao(double valor) {
        cartaoDeDebito.validar(valor);
    }

}