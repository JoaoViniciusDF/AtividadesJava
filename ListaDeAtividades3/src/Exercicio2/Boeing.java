package Exercicio2;

public class Boeing extends Aeronave {
    public Boeing(String identificador, Mediator mediator) {
        super(identificador, mediator);
    }

    public void receberMensagem(String mensagem) {
        System.out.println("[Boeing " + this.identificador + "]: Recebi a mensagem: " + mensagem);
    }
}
