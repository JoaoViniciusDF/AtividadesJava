package Exercicio4;

public class Teste {
	  public static void main(String[] args) {
	    Carro carro1 = FabricaCarro.criarCarro("vermelho");
	    Carro carro2 = FabricaCarro.criarCarro("azul");
	    Carro carro3 = FabricaCarro.criarCarro("preto");
	    
	    
	    System.out.println("Carro 1 - cor: " + carro1.getCor() + " | numeroChassis: " + carro1.getNumeroChassis());
	    System.out.println("Carro 2 - cor: " + carro2.getCor() + " | numeroChassis: " + carro2.getNumeroChassis());
	    System.out.println("Carro 3 - cor: " + carro3.getCor() + " | numeroChassis: " + carro3.getNumeroChassis());
	  }
	}
