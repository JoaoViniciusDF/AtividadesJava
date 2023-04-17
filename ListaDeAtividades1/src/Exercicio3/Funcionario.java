package Exercicio3;

public class Funcionario {
	private String nome, titulo;
	private int tempoDeServico;
	private double salarioAtual;

	
	//Construtor
	public Funcionario(String nome, String titulo, int tempoDeServico, double salarioAtual) {
		this.nome = nome;
		this.titulo = titulo;
		this.tempoDeServico = tempoDeServico;
		this.salarioAtual = salarioAtual;
	}

	
	//Get and Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTempoDeServico() {
		return tempoDeServico;
	}

	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}

	public double getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	
	
	//Métodos
	public double bonusPorTitulo() {

		if(this.titulo == "tecnico") {
			this.salarioAtual = salarioAtual + (salarioAtual * 0.01);
		}
		else if(this.titulo == "graduado") {
			this.salarioAtual = salarioAtual + (salarioAtual * 0.1);
		}
		else if(this.titulo == "mestrado") {
			this.salarioAtual = salarioAtual + (salarioAtual * 0.1);
		}
		else if(this.titulo == "doutorado") {
			this.salarioAtual = salarioAtual + (salarioAtual * 0.2);
		}
		
		return salarioAtual;
		
	}
	
	public double bonusPorTempoServico() {
		
		this.salarioAtual = salarioAtual + (salarioAtual * (0.0001 * tempoDeServico));
		return salarioAtual;
		
	}
	

}
