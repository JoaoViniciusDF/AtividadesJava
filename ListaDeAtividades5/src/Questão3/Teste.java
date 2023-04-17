package Questão3;

public class Teste {
	public static void main(String[] args) {

		Cinema cinema = new Cinema();

		Filme filme1 = new Filme("Matrix", 120, 1999, Categoria.AVENTURA);
		Filme filme2 = new Filme("Se beber, não case!", 140, 2009, Categoria.COMEDIA);
		Filme filme3 = new Filme("Orientado a Objetos", 180, 2023, Categoria.TERROR);

		cinema.addFilme(filme1);
		cinema.addFilme(filme2);
		cinema.addFilme(filme3);

		Sala sala7 = new Sala(7, 50);
		sala7.setFilme(filme1);
		cinema.addSala(sala7);

		Pessoa pessoa1 = new Pessoa(new Bilhete(123, new String()), 18);
		Pessoa pessoa2 = new Pessoa(new Bilhete(124, new String()), 21);
		Pessoa pessoa3 = new Pessoa(new Bilhete(125, new String()), 15);

		try {

			sala7.addPessoa(pessoa1);
			sala7.addPessoa(pessoa2);
			sala7.addPessoa(pessoa3);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}

		System.out.println("Filmes em cartaz:");

		for (Filme filme : cinema.getFilmes()) {

			System.out.println("- " + filme.getNome());

		}

		System.out.println("Pessoas na sala 7:");

		for (Pessoa pessoa : sala7.getPessoas()) {

			System.out.println("- Bilhete " + pessoa.getBilhete().getNumero());

		}

	}
}