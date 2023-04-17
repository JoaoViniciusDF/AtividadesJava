package Exercicio4;

public class Carro extends FabricaCarro{
	  private String cor;
	  private int numeroChassis;

	  public Carro(String cor, int numeroChassis) {
	    this.cor = cor;
	    this.numeroChassis = numeroChassis;
	  }

	  public String getCor() {
	    return cor;
	  }

	  public int getNumeroChassis() {
	    return numeroChassis;
	  }
	}
