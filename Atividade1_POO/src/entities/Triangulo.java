package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public Triangulo() {
		
	}
	public Triangulo(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double Area(double a, double b,double c) {
		double p = (a + b + c) / 2 ;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public void Maior(double x, double y) {
		if(x > y) {
			System.out.println("A �rea do tri�ngulo X � maior que a �rea do Y ");
		}else {
			System.out.println("A �rea do tri�ngulo Y � maior que a �rea do X ");
		}
	}
}
