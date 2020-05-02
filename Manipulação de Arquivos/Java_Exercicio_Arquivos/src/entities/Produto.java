package entities;

public class Produto {
	private String nome;
	private Double preco;
	private Integer quantia;

	public Produto() {
	}

	public Produto(String nome, Double preco, Integer quantia) {
		this.nome = nome;
		this.preco = preco;
		this.quantia = quantia;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantia() {
		return quantia;
	}
	public void setQuantia(Integer quantia) {
		this.quantia = quantia;
	}
	
	public double total() {
		return preco * quantia;
	}

}
