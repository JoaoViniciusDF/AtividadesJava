package Farmacia;

public class Medicamento extends Produto{

	private String tipoMedicamento;
	private String receita;
	 
	
	public Medicamento(String nome, double preco, String marca, String dataFabricacao, String validade,
			TipoProduto tipo,int quantidade, String tipoMedicamento, String receita) {
		super(nome, preco, marca, dataFabricacao, validade, tipo, quantidade);
		this.tipoMedicamento = tipoMedicamento;
		this.receita = receita;
	}

	protected  void receita() {
		System.out.println("Receita médica: "+ receita);
	}
	protected  void categoria() {
		System.out.println("Categoria de medicamento: "+ tipoMedicamento);
	}
	
}
