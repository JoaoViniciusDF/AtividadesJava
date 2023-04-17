package Exercicio1;

public class Teste {

	public static void main(String[] args) {
		
		Microonibus micro = new Microonibus(10,550.0);
		Passageiro p1 = new Passageiro("Joao", 89.0);
		Passageiro p2 = new Passageiro("Marcos", 70.0);
		Passageiro p3 = new Passageiro("Fabio", 83.0);
		Passageiro p4 = new Passageiro("Alexandre", 95.0);
		
		
		micro.adicionarPassageiro(p1);
		micro.adicionarPassageiro(p2);
		micro.adicionarPassageiro(p3);
		micro.adicionarPassageiro(p4);
		
	}

}
