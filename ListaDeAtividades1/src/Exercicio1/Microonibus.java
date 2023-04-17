package Exercicio1;

import java.util.ArrayList;

public class Microonibus {
	private ArrayList<Passageiro> listaDePassageiros = new ArrayList<Passageiro>();
	private int lotacao;
	private int contador = 0;
	private double peso;
	private double pesoTotal;
	
	public Microonibus(int lotacao, double pesoTotal) {
		super();
		this.lotacao = lotacao;
		this.pesoTotal = pesoTotal;
	}

	
	public void  adicionarPassageiro(Passageiro passageiro) {
		if( contador < this.lotacao && (this.peso + passageiro.getPeso()) <= this.pesoTotal) {
			listaDePassageiros.add(passageiro);
			contador ++;
			peso += passageiro.getPeso();
			System.out.println(String.format("Passageiro %s tenha uma boa viagem", passageiro.getNome()));
		}
		else {
			if(contador > this.lotacao)
			System.out.println("Passageiro %s excedeu o limite de lotação.");
	
			else {
				System.out.println("Passageiro %s excedeu o limite de peso.");
			}
		}
	
	}
}
