package Questão3;

public class Pessoa {
    private Bilhete bilhete;
    private int idade;
    
    public Pessoa(Bilhete bilhete, int idade) {
        this.bilhete = bilhete;
        this.idade = idade;
    }
    
    public Bilhete getBilhete() {
        return bilhete;
    }
    
    public int getIdade() {
        return idade;
    }
}

