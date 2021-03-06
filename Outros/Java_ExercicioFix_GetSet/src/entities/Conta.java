package entities;

public class Conta {
	private int numConta;
	private String nome;
	private double deposito;
	
	public Conta() {
	}
	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
		deposito = 0;
	}
	public Conta(int numConta, String nome, double deposito) {
		this.numConta = numConta;
		this.nome = nome;
		this.deposito = deposito;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	public int getNumConta() {
		return numConta;
	}
	
	public void AddDeposito(double add) {
		deposito += add;
	}
	
	public void Saque(double saque) {
		deposito -= saque;
	}
	
	public String toString() {
		return "Conta\nN�mero da Conta= " + numConta 
				+ ", Titular= " + nome 
				+ ", Saldo= " + deposito;
	}
}