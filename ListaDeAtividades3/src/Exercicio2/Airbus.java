package Exercicio2;

public class Airbus extends Aeronave {
    public Airbus(String identificador, Mediator mediator) {
        super(identificador, mediator);
    }

    public void receberMensagem(String mensagem) {
        System.out.println("[Airbus " + this.identificador + "]: Recebi a mensagem: " + mensagem);
    }
}
