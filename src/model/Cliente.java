package model;
import app.ItemCompra;


public class Cliente {
	private String cpf;
	private ItemCompra item;
	private String regiao;
	
	public Cliente(String cpf, ItemCompra item, String regiao) {
		this.cpf = cpf;
		this.item = item;
		this.regiao = regiao;
	}

	public String getCpf() {
		return cpf;
	}

	public ItemCompra getItem() {
		return item;
	}

	public String getRegiao() {
		return regiao;
	}
}
