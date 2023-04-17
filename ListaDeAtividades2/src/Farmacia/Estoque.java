package Farmacia;

import java.util.ArrayList;

public class Estoque {
	protected ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	protected void adicionarProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	
	protected void removeProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
	
	protected void buscaProduto(String produto) {
		for(Produto lista: listaProdutos) {
			if(produto == lista.getNome()) {
			System.out.println("Produto  encontrado");
			System.out.println("Nome: "+ lista.getNome());
			}
		}
	}
	public void addQuantidadeP(Produto produto, int quantidade) {
        produto.setQuantidade(produto.getQuantidade() + quantidade);
		produto.DadosProduto();
    }
	public void removeQuantidadeP(Produto produto, int quantidade) {
        produto.setQuantidade(produto.getQuantidade() - quantidade);
		produto.DadosProduto();
    }
}
