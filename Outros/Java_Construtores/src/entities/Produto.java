package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double Total() {
		return preco * quantidade;
	}
	
	public void AddQuantidade(int quantidade) {
		this.quantidade += quantidade; 
	}
	
	public void RemoveQuantidade(int quantidade) {
		this.quantidade -= quantidade; 
	}
	
	public String toString() {
		return "Produto: " + nome
				+ "\nPreço: " + String.format("%.2f", Total())
				+ "\nQuantidade: " + quantidade;
	}
}