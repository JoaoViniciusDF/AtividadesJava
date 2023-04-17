package Exercicio3;

public class Contador extends Funcionario{
	private final int numeroDeRegistro;
	private static int quantidadeDeFuncionario;
	
	public Contador(String nome, String titulo, int tempoDeServico, double salarioAtual, int numeroDeRegistro) {
		super(nome, titulo, tempoDeServico, salarioAtual);
		this.numeroDeRegistro = numeroDeRegistro;
		Contador.quantidadeDeFuncionario++;
	}

	public static int getQuantidadeDeFuncionario() {
		return quantidadeDeFuncionario;
	}

	public int getNumeroDeRegistro() {
		return numeroDeRegistro;
	}
	
}
