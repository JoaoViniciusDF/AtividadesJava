package Farmacia;

public class Farmaceutico {
	private final String nome;
	private String cpf;
	
	public Farmaceutico(String nome, String cpf) {
		this.nome=nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	
}
