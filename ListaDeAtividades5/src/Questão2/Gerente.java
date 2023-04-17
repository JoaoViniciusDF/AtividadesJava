package Questão2;

public class Gerente extends Empregado{
	private Empregado [] listaSubordinados = new Empregado [2];
	private Secretaria secretaria;
	
	public Gerente(String nome, double salario, int anoContratacao) {
		super(nome, salario, anoContratacao);
		
	}
	
	public Secretaria getSecretaria() {
		return secretaria;
	}

	public void addSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	public void addSubordinado(Empregado empregado) {
		if(listaSubordinados[0].equals(null)) {
			listaSubordinados[0] = empregado;
		}
		else if(listaSubordinados[1].equals(null)) {
			listaSubordinados[1] = empregado;
		}
		else {
			System.out.println("A lista de subordinados está completa.");
		}
	}
	
	public void aumentarSalario(Empregado empregado, double aumento){
		if(listaSubordinados[0].equals(empregado)) {
			double novoSalario = listaSubordinados[0].getSalario() * (1+aumento);
			listaSubordinados[0].setSalario(novoSalario);
		} else if(listaSubordinados[1].equals(empregado)) {
			double novoSalario = listaSubordinados[1].getSalario() * (1+aumento);
			listaSubordinados[1].setSalario(novoSalario);
		}else {
			System.out.println(String.format("%s não faz parte dos seus subordinados",empregado.getNome()));
		}
	}
	
	public void aumentarSalarioSecretaria(Empregado secretaria, double aumento) {
		if(this.secretaria.equals(secretaria)) {
			double novoSalario = secretaria.getSalario() * (1+aumento);
			secretaria.setSalario(novoSalario);
		}else {
			System.out.println(String.format("%s não faz parte dos seus subordinados",secretaria.getNome()));
		}
	}
	
	
}
