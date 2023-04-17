package Exercicio3;

public class EditorDeTexto {
    private String texto;
    private Memento memento;

    public EditorDeTexto() {
        this.texto = "";
    }

    public void inserirTexto(String texto) {
        this.salvarEstado();
        this.texto += texto;
    }

    public void apagarTexto(int quantidade) {
        if (this.texto.length() >= quantidade) {
            this.salvarEstado();
            this.texto = this.texto.substring(0, this.texto.length() - quantidade);
        }
    }

    public void desfazer() {
        if (this.memento != null) {
            this.texto = this.memento.getEstado();
            this.memento = null;
        }
    }

    public String getTexto() {
        return this.texto;
    }

    private void salvarEstado() {
        this.memento = new Memento(this.texto);
    }
}
