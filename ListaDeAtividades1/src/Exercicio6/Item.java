package Exercicio6;

public class Item {
	private String nome;	
	private int quantidade;
	private double precoUnitario;
	
	
	public Item(String nome, int quantidade, double precoUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
