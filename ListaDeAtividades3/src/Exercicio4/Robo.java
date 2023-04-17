package Exercicio5;

public interface Robo extends Cloneable {
    void setCor(String cor);

    void setTamanho(int tamanho);

    void setVelocidade(int velocidade);

    void setCapacidade(int capacidade);

    Robo clone();

    String getInfo();
}
