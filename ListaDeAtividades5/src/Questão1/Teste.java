package Questão1;

public class Teste {

	public static void main(String[] args) {
		Endereco e1 = new Endereco("Rua Augusto Fonsceca", 30, "Centro", "Araguari", "MG");
		Endereco e2 = new Endereco("Rua Fernando Ferraz", 210, "Portal de Fátima", "Araguari", "MG");
		Endereco e3 = new Endereco("Rua Pernanbuco Almeida", 743, "Aeroporto Sul", "Araguari", "MG");
		
		
		Empresa emp1 = new Empresa("Americanas", 2015, e1);
		
		
		Venda venda1 = new Venda(6, 5435.90);
		Venda venda2 = new Venda(6, 2345.50);
		Venda venda3 = new Venda(7, 6455.99);
		Venda venda4 = new Venda(7, 4300.00);
				
		
		Vendedor v1 = new Vendedor("João Vinicius", 534244452, e2);
		Vendedor v2 = new Vendedor("Maria Edarda", 533282144, e3);
		
		
		emp1.adicionarVendedor(v1);
		emp1.adicionarVendedor(v2);
		
		
		v1.addVenda(venda3);
		v1.addVenda(venda2);
		
		
		v2.addVenda(venda1);
		v2.addVenda(venda4);
		
		System.out.println("Total de vendedores na " + emp1.getRazaoSocial() + ": " + emp1.totalVendedores());
		System.out.println(String.format("A empresa " + emp1.getRazaoSocial() + " fica na UF: %s", emp1.getEndereco().getUf()));
		
		
		System.out.println("Total de vendas de(a) " + v1.getNome() + ": " + v1.totalVendas());
		System.out.println("Total de vendas de(a) " + v2.getNome() + ": " + v2.totalVendas());
		
	}

}
