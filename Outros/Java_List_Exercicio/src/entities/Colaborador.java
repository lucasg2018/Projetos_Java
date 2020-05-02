package entities;

public class Colaborador {
	private int id;
	private String nome;
	private double salario;
	
	public Colaborador() {
	}

	public Colaborador(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void incremento(double incremento) {
		salario += (salario * incremento) / 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}