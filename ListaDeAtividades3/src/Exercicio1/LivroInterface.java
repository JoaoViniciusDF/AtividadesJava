package Exercicio1;

public interface LivroInterface {

    LivroBuilder nome(String nome);

    LivroBuilder autor(String autor);

    LivroBuilder coAutor(String coAutor);

    LivroBuilder localLancamento(String localLancamento);

    LivroBuilder editora(String editora);

    LivroBuilder isbn(String isbn);

    LivroBuilder edicao(int edicao);

    LivroBuilder ano(int ano);

    LivroBuilder qtdPaginas(int qtdPaginas);

    Livro builder();

}
