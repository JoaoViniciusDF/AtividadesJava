package Questão1;

import java.util.ArrayList;

public class Vendedor {
	private String nome;
	private int cpf;
	private Endereco endereco;
	private ArrayList<Venda> listaVendas = new ArrayList<Venda>();
	
	
	public Vendedor(String nome, int cpf, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public int getCpf() {
		return cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}	
	
	
	public void addVenda(Venda venda) {
		this.listaVendas.add(venda);
	}

	public double totalVendas() {
		double valorTotal = 0.0;
		for(Venda venda: listaVendas) {
			valorTotal += venda.getValor();
		}
		return valorTotal;
	}

	
}
