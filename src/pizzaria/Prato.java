package pizzaria;

public class Prato extends Item {
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String textoCardapio() {
		return getNome() + ": " + descricao + " . R$ " + getPreco();
	}

}
