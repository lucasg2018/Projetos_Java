import java.util.Scanner;

public class Estruturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um número de 0 à 2:");
		int opc = sc.nextInt();
		switch(opc) {
		case 0:
			System.out.println("Você escolheu a opção 0");
			break;
		case 1:
			System.out.println("Você escolheu a opção 1");
			break;
		case 2:
			System.out.println("Você escolheu a opção 2");
			break;
		default:
			System.out.println("Opção inválida!");
		}
		sc.close();
		
	}
}