package Exercicio1;

public class Livraria {

    private LivroBuilder builder;

    public Livraria(LivroBuilder builder) {
        this.builder = builder;
    }

    public Livro AsCronicasDeGeloEfogo() {

        return builder.nome("A Guerra dos Tronos: As Crônicas de Gelo e Fogo volume 1")
                .autor("George R. R. Martin")
                .coAutor("Jeffrey Jones")
                .localLancamento("EUA")
                .editora("Bantam Spectra")
                .isbn("")
                .edicao(1)
                .ano(1996)
                .qtdPaginas(1206)
                .builder();

    }

}
