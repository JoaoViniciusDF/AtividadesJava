package Exercicio2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nomeAluno;
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		
		
		System.out.print("Nome Aluno: ");
		nomeAluno = scan.nextLine();
		
		System.out.print("Digite primeira nota: ");
		nota1 = scan.nextDouble();
		System.out.print("Digite segunda nota: ");
		nota2 = scan.nextDouble();
		System.out.print("Digite terceira nota: ");
		nota3 = scan.nextDouble();

		Aluno aluno1 = new Aluno(nomeAluno);
		
		Nota n1 = new Nota(nota1);
		Nota n2 = new Nota(nota2);
		Nota n3 = new Nota(nota3);
		
		aluno1.adicionarNotas(n1);
		aluno1.adicionarNotas(n2);
		aluno1.adicionarNotas(n3);
		
		aluno1.calcularMedia();
		scan.close();
	}

}
