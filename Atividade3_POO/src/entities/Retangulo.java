package entities;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		return 2 * largura + 2 * altura;
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
	}
	
	public String toString() {
		return "\n¡rea: " + Area()
		+ "\nPerimetro: " + Perimetro()
		+ "\nDiagonal: " + Diagonal();
	}
}