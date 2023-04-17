package Farmacia;

	public abstract class Produto {
	private String nome;
	private double preco;
	private String marca;
	private final String dataFabricacao;
	private final String validade;
	private TipoProduto tipo;
	private int quantidade;
	
	Produto(String nome, double preco, String marca, String dataFabricacao, String validade, TipoProduto tipo, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.dataFabricacao = dataFabricacao;
		this.validade = validade;
		this.tipo = tipo;
		this.quantidade=quantidade;
	}
	final void DadosProduto() {
		tipoProduto();
		nomeProduto();
		precoProd();
		marcaProd();
		dataFabri();
		dataValidade();
		receita();
		categoria();
		quantidade();
	}
	final void tipoProduto() {
		System.out.println("Tipo de Produto: "+ tipo );
	}
	final void nomeProduto() {
		System.out.println("Nome do Produto: "+ nome );
	}
	final void precoProd() {
		System.out.println("Preço do Produto: "+ preco);
	}
	final void marcaProd() {
		System.out.println("Marca do Produto:: "+ marca );
	}
	final void dataFabri() {
		System.out.println("Data Fabricação: "+ dataFabricacao);
	}	
	
	final void dataValidade() {
		System.out.println("Data Validade: "+ validade);
	}	
	final void quantidade() {
		System.out.println("Quantidade: "+ quantidade);
	}	
	protected abstract void receita();
	protected abstract void categoria();
	
	
	//////////////////////////////////////////////////////
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public String getValidade() {
		return validade;
	}
	public TipoProduto getTipo() {
		return tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
