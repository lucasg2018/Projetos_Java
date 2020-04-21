package model.entities;

import model.exception.DomainException;

public class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
	}
	public Pessoa(String nome, Integer idade){
		this.nome = nome;
		this.idade = idade;
		throw new DomainException("Lançamento de exceção personalizada!");
	}
}
