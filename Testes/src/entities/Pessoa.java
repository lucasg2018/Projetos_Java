package entities;

public class Pessoa {
	private String nome;
	private int idade;
	
	//Source -> Generate Constructor
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Source -> Generate Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

}