package Exercicio6;

public class Teste {

	public static void main(String[] args) {
		Fatura f1 = new Fatura("Mario", "093.753.628-00");
		Item p1 = new Item("produto1",2,500.00);
		Item p2 = new Item("produto2",5,190.0);
		Item p3 = new Item("produto3",4,84.00);

		
		f1.adicionarItem(p1);
		f1.adicionarItem(p2);
		f1.adicionarItem(p3);

		
		System.out.println("Preço total: " + f1.obterPreco());
	}

}
