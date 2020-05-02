package entities;

public class Funcionario {

	public String nome;
	public double salario;
	public double imposto;
	
	public double SalarioL() {
		return salario - imposto;
	}
	
	public void IncrementoS(double porcent) {
		salario += salario * porcent / 100;
	}
	
	public String toString() {
		return "\nEmpregado: " + nome
				+ "\nSalário líquido: " + SalarioL() + " Reais";
	}
}