package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o tamanho da matriz: ");
		int n = ler.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = ler.nextInt();
			}
		}
		System.out.println("Main Diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][i]);
		}
		
		int cont = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.printf("Negative numbers: %d", cont);
		
		ler.close();
	}
}