package Questão3;

public class Bilhete {
    private int numero;
    private String data;
    
    public Bilhete(int numero, String string) {
        this.numero = numero;
        this.data = string;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getData() {
        return data;
    }
}

