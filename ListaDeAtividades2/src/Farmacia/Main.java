package Farmacia;

public class Main {

	public static void main(String[] args) {
	Produto dipirona = new Medicamento("Dipirona",15.0,"Novalgina","25/02/2003","25/02/2004",TipoProduto.MEDICAMENTOS,14,"Medicamento Genérico", "Não precisa de receita");
	Produto plazil = new Medicamento("Plazil",10.0,"Novalgina","25/02/2003","25/02/2004",TipoProduto.MEDICAMENTOS,14,"Medicamento de Marca", "Precisa de receita");
	
	Estoque estoque = new Estoque();
	
	Cliente cliente = new Cliente("Jacson","Carlos","41253",28);	
	Cliente cliente2 = new Cliente("ana","clara","41253",28);
	
	Farmaceutico farmaceutico = new Farmaceutico("Wesley","12343213");
	
	Compra compra = new Compra("27/02/2023", dipirona, farmaceutico);
	Compra compra2 = new Compra("27/02/2023", plazil);
	
	Farmacia farmacia = new Farmacia();
	

	
	//dados do produto]
	System.out.println("-----------------------------------");
	System.out.println("Dados do Produto\n");
	dipirona.DadosProduto();
	
	//realizar compra
	System.out.println("\n-----------------------------------");
	System.out.println("Realizando Compra\n");
	compra.addListaDeCompra(dipirona);
	compra.addListaDeCompra(plazil);
	compra.desconto(dipirona, cliente);
	compra.desconto(plazil, cliente);
	compra.calculaTotal();
	
	
	//ListaCliente
	System.out.println("\n-----------------------------------");
	System.out.println("Cadastro de cliente\n");
	farmacia.cadastraCliente(cliente);
	farmacia.verificarCadastro(cliente2);
	farmacia.verificarCadastro(cliente);

	
	//histórico de compra
	System.out.println("\n-----------------------------------");
	System.out.println("Histórico de compra");
	cliente.historicoCompra(compra);
	cliente.historicoCompra(compra2);
	cliente.apresentaHistorico();
	
	//atualizar estoque de um produto
	System.out.println("\n-----------------------------------");
	System.out.println("Adicionar Estoque");
	estoque.addQuantidadeP(dipirona, 10);
	System.out.println("\n-----------------------------------");
	System.out.println("Remover Estoque");
	estoque.removeQuantidadeP(dipirona, 10);
	}

}
