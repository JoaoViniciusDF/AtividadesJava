package Exercicio3;

public class Memento {
    private String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
