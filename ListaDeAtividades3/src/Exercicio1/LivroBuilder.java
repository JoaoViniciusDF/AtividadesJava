package Exercicio1;

public class LivroBuilder implements LivroInterface {
    String nome, autor, coAutor, localLancamento, editora, isbn;
    int edicao, ano, qtdPaginas;

    @Override
    public LivroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public LivroBuilder autor(String autor) {
        this.autor = autor;
        return this;
    }

    @Override
    public LivroBuilder coAutor(String coAutor) {
        this.coAutor = coAutor;
        return this;
    }

    @Override
    public LivroBuilder localLancamento(String localLancamento) {
        this.localLancamento = localLancamento;
        return this;
    }

    @Override
    public LivroBuilder editora(String editora) {
        this.editora = editora;
        return this;
    }

    @Override
    public LivroBuilder isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    @Override
    public LivroBuilder edicao(int edicao) {
        this.edicao = edicao;
        return this;
    }

    @Override
    public LivroBuilder ano(int ano) {
        this.ano = ano;
        return this;
    }

    @Override
    public LivroBuilder qtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
        return this;
    }

    @Override
    public Livro builder() {
        return new Livro(nome, autor, coAutor, localLancamento, editora, isbn, edicao, ano, qtdPaginas);
    }

}
