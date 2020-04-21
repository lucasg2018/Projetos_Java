package model.entities;

import java.util.Date;
import java.util.List;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	private Date criado;

	public Funcionario() {
	}

	public Funcionario(Integer id, String nome, Double salario, Date criado) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.criado = criado;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getCriado() {
		return criado;
	}
	public void setCriado(Date criado) {
		this.criado = criado;
	}
	
	public static int contadorId(List<Funcionario> lista) {
		int cont = 1;
		for (Funcionario obj : lista) {
			cont++;
		}
		
		return cont;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nId: " + getId());
		sb.append(" | Nome: " + getNome());
		sb.append(" | Salário: " + getSalario());
		
		return sb.toString();
	}
}
