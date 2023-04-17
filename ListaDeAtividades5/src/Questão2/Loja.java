package Questão2;

import java.util.ArrayList;

public class Loja {
	private String nome;
	private ArrayList<Empregado> listaEmpregados = new ArrayList<Empregado>();
	
	
	public ArrayList<Empregado> getListaEmpregados() {
		return listaEmpregados;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Loja(String nome) {
		this.nome = nome;
	}

	public void addEmpregado(Empregado empregado) {
		listaEmpregados.add(empregado);
	}



	public void listarEmpregados() {
		System.out.println("FUNCIONÁRIOS DA LOJA: " + getNome() + "\n\n" + this.nome);
		for(Empregado empregado: listaEmpregados) {			
			System.out.println(empregado.exibirDados());			
		}
		System.out.println("---------------------------------------------------------");
	}

	
	
}
