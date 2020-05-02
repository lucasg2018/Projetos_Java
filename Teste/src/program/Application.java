package program;

public class Application {

	public static void main(String[] args) {

		int[] elementos = { 89400, 89800, 99100, 99500, 900, 1500, 2100, 2200 };
		String[] extensao = { "Início", "Segunda-feria", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira",
				"Sábado", "Domingo" };
		double soma = 0;
		int x = 0;

		for (int i : elementos) {
			System.out.println(extensao[x] + " | " + i + " Km");
			soma += i;
			x++;
		}
		double media = soma / elementos.length;

		System.out.print("\nMédia de quilômetros percorrido: " + media);
		
		System.out.println("\n\ndias da semana em que foi percorrido quilômetros acima da média: ");
		for (int i = 1; i < extensao.length; i++) {
			if(elementos[i] > media) {
				System.out.println(extensao[i]);
			}
		}

		System.out.println("\nMostrar o dia da semana (por extenso) nos itens 1 e 3: \n" + extensao[1] + " e " + extensao[3]);
		
	}
}
