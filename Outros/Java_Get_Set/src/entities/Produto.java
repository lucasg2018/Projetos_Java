package entities;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto() {
	}
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
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