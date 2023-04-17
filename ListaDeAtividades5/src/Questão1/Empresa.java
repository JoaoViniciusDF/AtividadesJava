package Questão1;

import java.util.ArrayList;

public class Empresa {
	private String razaoSocial;
	private int anoFundacao;
	private Endereco enderecoSede;
	private ArrayList<Vendedor> listaVendedores = new ArrayList<Vendedor>();
	
	public Empresa(String razaoSocial, int anoFundacao, Endereco enderecoSede) {
		this.razaoSocial = razaoSocial;
		this.anoFundacao = anoFundacao;
		this.enderecoSede = enderecoSede;
	}
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public Endereco getEnderecoSede() {
		return enderecoSede;
	}

	public void setEnderecoSede(Endereco enderecoSede) {
		this.enderecoSede = enderecoSede;
	}
	
	public Endereco getEndereco() {
		return this.enderecoSede;
	}
	
	public void adicionarVendedor(Vendedor vendedor) {
		listaVendedores.add(vendedor);
	}
	
	public int totalVendedores() {
		return listaVendedores.size();
		
	}

	public ArrayList<Vendedor> getListaVendedores() {
		return listaVendedores;
	}

	public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
		this.listaVendedores = listaVendedores;
	}
	
	
	
	
	
}
