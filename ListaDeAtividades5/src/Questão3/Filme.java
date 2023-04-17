package Questão3;

public class Filme {
    private String nome;
    private int duracao;
    private int anoLancamento;
    private Categoria categoria;

    public Filme(String nome, int duracao, int anoLancamento, Categoria categoria) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
