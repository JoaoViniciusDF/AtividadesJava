package Exercicio5;
public class Teste {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        agenda.adicionarContato(new Contato("João", "123456"));
        agenda.adicionarContato(new Contato("Maria", "654321"));

        Iterator<Contato> iterator = agenda.iterator();

        while (iterator.hasNext()) {

            Contato contato = iterator.next();
            System.out.println(contato.getNome() + " - " + contato.getTelefone());

        }

    }
}
