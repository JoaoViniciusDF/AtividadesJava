package Exercicio2;

public class Teste {
    public static void main(String[] args) {

        ControladorDeTrafego mediator = new ControladorDeTrafego();

        Airbus airbus1 = new Airbus("433", mediator);
        Airbus airbus2 = new Airbus("126", mediator);
        Boeing boeing1 = new Boeing("941", mediator);

        airbus1.enviarMensagem("Posição: x=1555, y=2200");
        boeing1.enviarMensagem("Posição: x=3000, y=4090");

    }

}
