package Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ControladorDeTrafego implements Mediator {
    private List<Aeronave> aeronaves;

    public ControladorDeTrafego() {
        this.aeronaves = new ArrayList<>();
    }

    public void registrarAeronave(Aeronave aeronave) {
        this.aeronaves.add(aeronave);
    }

    public void enviar(String mensagem, Aeronave remetente) {
        for (Aeronave aeronave : this.aeronaves) {
            if (aeronave != remetente) {
                aeronave.receberMensagem(mensagem);
            }
        }
    }
}
