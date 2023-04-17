package Farmacia;

import java.util.ArrayList;

public final class Compra {
	private String data;
	private Produto produto;
	private ArrayList<Produto> listaCompra = new ArrayList<Produto>();
	private Farmaceutico farm;	

	public Compra( String data, Produto produto, Farmaceutico farm) {
		super();
		this.data = data;
		this.produto = produto;
		this.farm= farm;
	}
	public Compra( String data, Produto produto) {
		super();
		this.data = data;
		this.produto = produto;
	}
	public void addListaDeCompra(Produto produto) {
		listaCompra.add(produto);
	}
	double total = 0;
	
	public void calculaTotal( ) {
		//for(Produto lista: listaCompra) {
		///	total+= lista.getPreco();
		//}
	System.out.println("\nValor total da compra: "+total);
	}
	
	public void desconto(Produto produto, Cliente cliente) {
		double desconto=0;
		
			if(cliente.getIdade()>60) {
				desconto = 0.1;
				double x = produto.getPreco() - (produto.getPreco()*desconto);
				total+=x;
				System.out.println("Desconto de Idoso: " + desconto);
				System.out.println("Desconto dado ao medicamento: " + x);
			}
			else if(cliente.getIdade()>17) {
				desconto = 0.05;
				double x = produto.getPreco() - (produto.getPreco()*desconto);
				total+=x;
				System.out.println("Desconto de Adulto: " + desconto);
				System.out.println("total com o desconto da compra: " + x);
			}
			
			else {
				System.out.println("Não possui desconto!");
				total+= produto.getPreco();
			}
	}

	public String getData() {
		return data;
	}

	public void getProduto() {
		System.out.println(produto.getNome());
	}
	
	public void getFarmaceutico() {
		try {
		    System.out.println("Farmacêutico responsável: " + farm.getNome());
		} catch (NullPointerException e) {
		    System.out.println("Não possui Farmaceutico Registrado");
		}
	}
	
	
}
