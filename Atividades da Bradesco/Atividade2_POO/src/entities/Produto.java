package entities;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public double Total() {
		return preco * quantidade;
	}
	
	public void AddProduto(int quant) {
		this.quantidade += quant;
	}
	
	public void RemoverProduto(int quant) {
		this.preco -= this.preco * quant;
	}
	 
	public String toString() {
		return "\nProduto: " + nome
				+ "\nPreço: " + preco
				+ "\nQuantidade: " + quantidade
				+ "\nTotal: " + Total();
	}
}