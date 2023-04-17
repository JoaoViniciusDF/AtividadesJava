package Exercicio3;

public class Teste {

	public static void main(String[] args) {
		
		Contador c1 = new Contador("Maria", "mestrado", 390, 6000.0, 164205);
		Contador c2 = new Contador("Bruno", "tecnico", 539, 6000.0, 284903);
		Contador c3 = new Contador("Joao", "doutorado", 809, 6000.0, 569302);
		Contador c4 = new Contador("Joao", "graduado", 809, 6000.0, 569302);
		
		
		
		System.out.println("-------------------------------Funcionario 1-------------------------------");
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Titulo: " + c2.getTitulo());
        System.out.println("Tempo de Serviço: " + c2.getTempoDeServico());
        System.out.println("Salário Atual: " + c2.getSalarioAtual());
        System.out.println("Salário com Bônus por Título: " + c2.bonusPorTitulo());
        System.out.println("Salário com Bônus por Tempo de Serviço: " + c2.bonusPorTempoServico());
        System.out.println("Número de Registro: " + c2.getNumeroDeRegistro());

	
        System.out.println("-------------------------------Funcionario 2-------------------------------");
        System.out.println("Nome: " + c2.getNome());
        System.out.println("Titulo: " + c2.getTitulo());
        System.out.println("Tempo de Serviço: " + c2.getTempoDeServico());
        System.out.println("Salário Atual: " + c2.getSalarioAtual());
        System.out.println("Salário com Bônus por Título: " + c2.bonusPorTitulo());
        System.out.println("Salário com Bônus por Tempo de Serviço: " + c2.bonusPorTempoServico());
        System.out.println("Número de Registro: " + c2.getNumeroDeRegistro());

        
        System.out.println("-------------------------------Funcionario 3-------------------------------");
        System.out.println("Nome: " + c3.getNome());
        System.out.println("Titulo: " + c3.getTitulo());
        System.out.println("Tempo de Serviço: " + c3.getTempoDeServico());
        System.out.println("Salário Atual: " + c3.getSalarioAtual());
        System.out.println("Salário com Bônus por Título: " + c3.bonusPorTitulo());
        System.out.println("Salário com Bônus por Tempo de Serviço: " + c3.bonusPorTempoServico());
        System.out.println("Número de Registro: " + c3.getNumeroDeRegistro());

	
        System.out.println("-------------------------------Funcionario 4-------------------------------");
        System.out.println("Nome: " + c4.getNome());
        System.out.println("Titulo: " + c4.getTitulo());
        System.out.println("Tempo de Serviço: " + c4.getTempoDeServico());
        System.out.println("Salário Atual: " + c4.getSalarioAtual());
        System.out.println("Salário com Bônus por Título: " + c4.bonusPorTitulo());
        System.out.println("Salário com Bônus por Tempo de Serviço: " + c4.bonusPorTempoServico());
        System.out.println("Número de Registro: " + c4.getNumeroDeRegistro());

        
        System.out.println("\n\nQuantidade de Funcionários: " + Contador.getQuantidadeDeFuncionario());
        
	}

}
