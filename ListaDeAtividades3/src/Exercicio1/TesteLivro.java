package Exercicio1;

public class TesteLivro {
    public static void main(String[] args) {
        LivroBuilder builder = new LivroBuilder();
        Livraria livraria = new Livraria(builder);

        // Criando um livro
        Livro AsCronicasDeGeloEfogo = livraria.AsCronicasDeGeloEfogo();
        System.out.println(AsCronicasDeGeloEfogo);

    }
}
