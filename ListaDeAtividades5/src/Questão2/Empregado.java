package Questão2;

public class Empregado {
	private String nome;
	private double salario;
	private int anoContratacao;
	
	public Empregado(String nome, double salario, int anoContratacao) {
		this.nome = nome;
		this.salario = salario;
		this.anoContratacao = anoContratacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAnoContratacao() {
		return anoContratacao;
	}
	
	public String exibirDados() {
		return String.format("Nome: %s \nSalário: %s \nAno da contratação: %s\n", this.nome, this.salario, this.anoContratacao);
	}
}
