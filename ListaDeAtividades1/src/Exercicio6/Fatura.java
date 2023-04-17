package Exercicio6;

import java.util.ArrayList;

public class Fatura {
	private ArrayList<Item> itens = new ArrayList<Item>();
	private String nome;
	private String cpf;
	
	public Fatura(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public double obterPreco() {
		double somatorio = 0.0;
		for(Item i: itens) {
			somatorio += (i.getPrecoUnitario() * i.getQuantidade());
		}
		return somatorio;
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}
}
