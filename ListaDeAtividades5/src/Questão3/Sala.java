package Questão3;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int numero;
    private int capacidadeMaxima;
    private Filme filme;
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Sala(int numero, int capacidadeMaxima) {
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public Filme getFilme() {
        return this.filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void addPessoa(Pessoa pessoa) {
        if (this.pessoas.size() < this.capacidadeMaxima) {
            if (pessoa.getIdade() >= 18 && this.filme.getCategoria() != Categoria.TERROR) {
                for (Pessoa p : this.pessoas) {
                    if (p.getBilhete().getNumero() == pessoa.getBilhete().getNumero()) {
                        System.out.println("Já existe uma pessoa com esse bilhete nesta sala");
                        return;
                    }
                }
                this.pessoas.add(pessoa);
            } else {
                System.out.println("Não é permitido");
            }
        } else {
            System.out.println("A sala está cheia");
        }
    }
}