package Exercicio5;

public class Teste {

	public static void main(String[] args) {
	    Agenda agenda = new Agenda();

	    Contato contato1 = new Contato("João", "034994875569", "joaovinicius@email.com");
	    Contato contato2 = new Contato("Maria", "034995278849", "mariaeduarda@email.com");
	    Contato contato3 = new Contato("Jonathan", "034997648389", "jonathan@email.com");

	    agenda.adicionarContato(contato1);
	    agenda.adicionarContato(contato2);
	    agenda.adicionarContato(contato3);

	    System.out.println("Contatos na agenda antes da remoção:");
	    for (int i = 0; i < agenda.getContatos().size(); i++) {
	        Contato contato = agenda.getContatos().get(i);
	        System.out.println("Nome: " + contato.getNome());
	        System.out.println("Número: " + contato.getNumero());
	        System.out.println("E-mail: " + contato.getEmail());
	        System.out.println("---------------------------------------------------------");
	    }

	    agenda.removerContato("Maria");

	    System.out.println("\n\nContatos na agenda depois da remoção:");
	    for (int i = 0; i < agenda.getContatos().size(); i++) {
	        Contato contato = agenda.getContatos().get(i);
	        System.out.println("Nome: " + contato.getNome());
	        System.out.println("Número: " + contato.getNumero());
	        System.out.println("E-mail: " + contato.getEmail());
	        System.out.println("---------------------------------------------------------");
	    }

	    Contato contatoBuscado = agenda.buscarContato("João");
	    System.out.println("Contato buscado: ");
	    System.out.println("Nome: " + contatoBuscado.getNome());
	    System.out.println("Número: " + contatoBuscado.getNumero());
	    System.out.println("E-mail: " + contatoBuscado.getEmail());
	}
}
