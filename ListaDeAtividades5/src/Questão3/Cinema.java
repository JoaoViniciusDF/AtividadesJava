package Questão3;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Sala> salas = new ArrayList<Sala>();
    private List<Filme> filmes = new ArrayList<Filme>();

    public void addSala(Sala sala) {
        this.salas.add(sala);
    }

    public void addFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public List<Filme> getFilmes() {
        return this.filmes;
    }

    public List<Sala> getSalas() {
        return this.salas;
    }

    public Sala getSala(int numero) {
        for (Sala sala : this.salas) {
            if (sala.getNumero() == numero) {
                return sala;
            }
        }
        return null;
    }
}
