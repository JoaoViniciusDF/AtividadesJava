package Exercicio5;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    
    //Construtor
    public Agenda() {
        this.contatos = new ArrayList<Contato>();
    }

    
    //Get and Set
    public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
    
    
    
    //Métodos
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contatos.remove(i);
                break;
            }
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void modificarNumero(String nome, String novoNumero) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contato.setNumero(novoNumero);
        }
    }

}