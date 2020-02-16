package aplication;

import java.util.Scanner;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("Enter with the measures of triangle X:");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a= sc.nextDouble();
		y.b= sc.nextDouble();
		y.c= sc.nextDouble();
		
		double areaX = x.Area(x.a, x.b, x.c);
		double areaY = y.Area(y.a, y.b, y.c);
		
		x.Maior(areaX, areaY);
		
		sc.close();
	}
}