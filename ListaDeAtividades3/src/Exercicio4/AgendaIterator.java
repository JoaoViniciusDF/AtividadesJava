package Exercicio5;
import java.util.Iterator;

public class AgendaIterator implements Iterator<Contato> {
    private List<Contato> contatos;
    private int index;

    public AgendaIterator(List<Contato> contatos) {
        this.contatos = contatos;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.contatos.size();
    }

    @Override
    public Contato next() {
        if (!hasNext()) {
            return null;
        }
        Contato contato = this.contatos.get(index);
        this.index++;
        return contato;
    }
}
