package Farmacia;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;

	
	private ArrayList<Compra> historicoCompra = new ArrayList<Compra>();
	
	public Cliente(String nome, String sobrenome, String cpf, int idade) {
	
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.idade = idade;
	}
		
		public void historicoCompra(Compra compra ) {
			historicoCompra.add(compra);
		}

		public void apresentaHistorico() {
			for(Compra lista: historicoCompra) {
				System.out.println("\nProduto:");
				lista.getProduto();
				System.out.println("Data: "+ lista.getData());
				lista.getFarmaceutico();
			}
		}
		
		public String getNome() {
			return nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public String getCpf() {
			return cpf;
		}

		public int getIdade() {
			return idade;
		}
	
		
}
