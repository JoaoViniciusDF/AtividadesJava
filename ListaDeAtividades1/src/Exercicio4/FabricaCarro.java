package Exercicio4;

public class FabricaCarro {
	  private static int proximoNumChassis;

	  public static Carro criarCarro(String cor) {
	    return new Carro(cor, proximoNumChassis++);
	  }
	}

