package Exercicio2;

public abstract class Aeronave {
    protected String identificador;
    protected Mediator mediator;

    public Aeronave(String identificador, Mediator mediator) {
        this.identificador = identificador;
        this.mediator = mediator;
    }

    public void enviarMensagem(String mensagem) {
        this.mediator.enviar(mensagem, this);
    }

    public abstract void receberMensagem(String mensagem);
}
