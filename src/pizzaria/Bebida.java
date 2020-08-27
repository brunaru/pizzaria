package pizzaria;

public class Bebida extends Item {
	
	private String marca;
	
	private int volume;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String textoCardapio() {
		return marca + ": " + volume + "ml . R$ " + getPreco();
	}

}
