package Farmacia;

import java.util.ArrayList;

public class Farmacia {

	ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
	
	public void cadastraCliente(Cliente cliente) {
		listaCliente.add(cliente);
	}
	
	public void verificarCadastro(Cliente cliente) {
	for(Cliente lista: listaCliente) {
		if(cliente.getNome() == lista.getNome()) {
			System.out.println("Cliente possui cadastro");
		}
		else {
			System.out.println("Cliente não possui cadastro");
		}
	}

	}

}
