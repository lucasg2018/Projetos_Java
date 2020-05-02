package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Shape> shape = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int n = ler.nextInt();
		ler.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Shape #%d data:\n", i);
			System.out.print("Rectangle or Circle (r/c): ");
			char esc = ler.nextLine().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(ler.nextLine());

			if (esc == 'r') {
				System.out.print("Width: ");
				double width = ler.nextDouble();
				System.out.print("Height: ");
				double height = ler.nextDouble();
				ler.nextLine();
				
				shape.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = ler.nextDouble();
				ler.nextLine();
				
				shape.add(new Circle(color, radius));
			}
		}
		
		System.out.println("\nSHAPE AREAS: ");
		for (Shape s : shape) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		
		ler.close();
	}
}