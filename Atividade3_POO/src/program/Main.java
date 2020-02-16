package program;

import java.util.Scanner;
import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Informe a largura do Retângulo:");
		retangulo.largura = sc.nextDouble();
		System.out.println("Informe a altura do Retângulo:");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		
		sc.close();
	}
}