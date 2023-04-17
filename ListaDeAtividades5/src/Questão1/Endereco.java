package Questão1;

public class Endereco {
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getUf() {
		return uf;
	}
	
	
}
