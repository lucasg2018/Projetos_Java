package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vogal = 0, consoante = 0;
		
		for (int i = 1; i <= 6; i++) {
			System.out.printf("%dº Pessoa:", i);
			System.out.print("\nInforme o nome: ");
			String nome = ler.nextLine().toLowerCase();
			
			if(nome.charAt(1) == 'a' || nome.charAt(0) == 'e' || nome.charAt(0) == 'i' || nome.charAt(0) == 'o' || nome.charAt(0) == 'u') {
				vogal++;
			}else {
				consoante++;
			}
		}
		
		System.out.print("\nQuantidade de nomes iniciados com vogais: " + vogal);
		System.out.print("\nQuantidade de nomes iniciados com consoantes: " + consoante);
		
		ler.close();
	}
}
