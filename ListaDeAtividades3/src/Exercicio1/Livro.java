package Exercicio1;

public class Livro {
    String nome, autor, coAutor, localLancamento, editora, isbn;
    int edicao, ano, qtdPaginas;

    public Livro(String nome, String autor, String coAutor, String localLancamento, String editora, String isbn,
            int edicao, int ano, int qtdPaginas) {

        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.coAutor = coAutor;
        this.edicao = edicao;
        this.localLancamento = localLancamento;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
        this.isbn = isbn;

    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getCoAutor() {
        return coAutor;
    }

    public String getLocalLancamento() {
        return localLancamento;
    }

    public String getEditora() {
        return editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getAno() {
        return ano;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }


    @Override
    public String toString() {

        return nome + " - " + autor + " - " + coAutor + " - " + localLancamento + " - " + editora + " - " + isbn + " - " + edicao + " - " + ano + " - " + qtdPaginas;

    }

}

