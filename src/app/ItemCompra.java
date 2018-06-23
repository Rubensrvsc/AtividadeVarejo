package app;

public class ItemCompra {
	private int qtdComprada;
	private double precoCompra;
	
	public ItemCompra(int qtdComprada, double precoCompra) {
		this.qtdComprada = qtdComprada;
		this.precoCompra = precoCompra;
	}
	
	public int getQtdComprada() {
		return qtdComprada;
	}
	
	public double getPrecoCompra() {
		return precoCompra;
	}
}
