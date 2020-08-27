package pizzaria;

public class Teste {

	public static void main(String[] args) {

		Restaurante meuFastFood = new Restaurante();
		meuFastFood.setNome("Siri Cascudo");
		
		Cardapio meuCardapio = new Cardapio();
		
		Prato i1 = new Prato();
		i1.setNome("Pizza de Siri de Luxo");
		i1.setCategoria(Categoria.PIZZA);
		i1.setPreco(42.50);
		i1.setDescricao("siri supremo, mussarela, cebola, catupiry original");
		meuCardapio.getItems().add(i1);
		
		Prato i2 = new Prato();
		i2.setNome("Pizza de Alga");
		i2.setCategoria(Categoria.PIZZA);
		i2.setPreco(25.00);
		i2.setDescricao("alga, mussarela, cebola");
		meuCardapio.getItems().add(i2);
		
		Bebida i3 = new Bebida();
		i3.setNome("Guaraná");
		i3.setCategoria(Categoria.REFRI);
		i3.setMarca("Dolly Guaraná");
		i3.setVolume(600);
		i3.setPreco(3.50);
		meuCardapio.getItems().add(i3);
		
		meuCardapio.listarCardapio();

	}

}

