package Exercicio5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        this.contatos.add(contato);
    }

    public void removerContato(Contato contato) {
        this.contatos.remove(contato);
    }

    public Iterator<Contato> iterator() {
        return new AgendaIterator(this.contatos);
    }
}
