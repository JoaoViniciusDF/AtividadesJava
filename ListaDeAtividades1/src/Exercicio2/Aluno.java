package Exercicio2;

import java.util.ArrayList;


public class Aluno {
	private String nome;
	private double media = 0;
	private ArrayList<Nota> listaDeNotas = new ArrayList<>();
	
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Nota> getListaDeNotas() {
		return listaDeNotas;
	}

	public void adicionarNotas(Nota nota) {
		this.listaDeNotas.add(nota);
	}
	
	
	
	public void calcularMedia() {
		for(Nota nota : listaDeNotas) {
	    double notaAtual = nota.getValor();

	    media += (notaAtual) / listaDeNotas.size();
	    }
		
	    System.out.println("Média: " + media);
	    
	    if (media >= 9 && media <= 10) {
	      System.out.println("Conceito: A");
	    } else if (media >= 8 && media < 9) {
	      System.out.println("Conceito: B");
	    } else if (media >= 7 && media < 8) {
	      System.out.println("Conceito: C");
	    } else if (media >= 6 && media < 7) {
	      System.out.println("Conceito: D");
	    } else {
	      System.out.println("Reprovado");
	    }
	}
}
