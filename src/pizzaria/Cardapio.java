package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	
	private String tipo;
	
	private List<Item> items = new ArrayList<>();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void listarCardapio() {
		System.out.println("PRODUTO     .     PREÇO");
		for (Item i : items) {
			System.out.println(i.textoCardapio());
		}
	}
	
	public void listarPratos() {
		// TODO
	}
	
	public void listarBebidas() {
		// TODO
	}

}
