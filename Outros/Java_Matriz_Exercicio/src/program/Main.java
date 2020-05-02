package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Matriz");
		System.out.print("Enter the number of lines:");
		int m = ler.nextInt();
		System.out.print("Enter the number of coluns:");
		int n = ler.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = ler.nextInt();
			}
		}
		
		System.out.print("Enter with the number x: ");
		int x = ler.nextInt();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position: " + i + "," + j);
					
					if(j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if(j < n - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if(i < m - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		
		ler.close();
	}
}