package Questão2;

public class Teste {

	public static void main(String[] args) {
				
		Gerente gerente1 = new Gerente("Otavio", 8000.00, 2005);
		
		
		Secretaria secretaria1 = new Secretaria("Lara", 3000.00, 2015);
		
		
		Empregado empregado1 = new Empregado("João", 1500.20, 2020);
		Empregado empregado2 = new Empregado("Mario", 1600.29, 2019);
		
		
		Loja l1 = new Loja("Americanas");
		
		
		l1.addEmpregado(secretaria1);
		l1.addEmpregado(gerente1);
		l1.addEmpregado(empregado1);
		l1.addEmpregado(empregado2);
		
		
		l1.listarEmpregados();
		
		
		System.out.println("Dados gerente: ");
		System.out.println(gerente1.exibirDados());
		
		
		System.out.println("Dados Subordinados");
		System.out.println(empregado1.exibirDados());
		System.out.println(empregado2.exibirDados());
		
		
		System.out.println("Antes aumento");		
		System.out.println(secretaria1.exibirDados());
		
		
		gerente1.addSecretaria(secretaria1);
		gerente1.aumentarSalarioSecretaria(secretaria1, 0.1);

		
		System.out.println("Após aumento");
		System.out.println(secretaria1.exibirDados());

	}

}
