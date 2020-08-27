package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	
	private String nome;
	
	private String cnpj;
	
	private List<Cardapio> cardapios = new ArrayList<>();

	public List<Cardapio> getCardapios() {
		return cardapios;
	}

	public void setCardapios(List<Cardapio> cardapios) {
		this.cardapios = cardapios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
