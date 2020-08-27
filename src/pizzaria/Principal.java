package pizzaria;

public class Principal {

	public static void main(String[] args) {
		Restaurante meuFastFood = new Restaurante();
		meuFastFood.setNome("Siri Cascudo");
		meuFastFood.setCnpj("000-123");
		
		Cardapio meuCardapio = new Cardapio();
		meuCardapio.setTipo("comum");
		
		Prato i1 = new Prato();
		i1.setCategoria(Categoria.PIZZA);
		i1.setNome("Pizza de Siri de Luxo");
		i1.setPreco(42.50);
		i1.setDescricao("siri supremo, mussarela, cebola e catupiry original");
		meuCardapio.getItems().add(i1);
	
		
		Bebida i3 = new Bebida();
		i3.setCategoria(Categoria.REFRI);
		i3.setNome("Guaraná");
		i3.setMarca("Dolly Guaraná");
		i3.setVolume(600);
		i3.setPreco(3.50);
		meuCardapio.getItems().add(i3);
		
		Prato i2 = new Prato();
		i2.setCategoria(Categoria.PIZZA);
		i2.setNome("Pizza de Alga");
		i2.setPreco(25.00);
		i2.setDescricao("alga, mussarela e cebola");
		meuCardapio.getItems().add(i2);
		
		
		meuFastFood.getCardapios().add(meuCardapio);
		
		meuCardapio.listarCardapio();

	}

}
