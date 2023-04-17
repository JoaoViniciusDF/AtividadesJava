package Exercicio5;

public abstract class BaseRobo implements Robo {
    protected String cor;
    protected int tamanho;
    protected int velocidade;
    protected int capacidade;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Robo clone() {
        try {

            return (Robo) super.clone();

        } catch (CloneNotSupportedException e) {

            return null;

        }
    }

    public String getInfo() {

        return "cor: " + cor + ", tamanho: " + tamanho + ", velocidade: " + velocidade + ", capacidade: " + capacidade;

    }
}
