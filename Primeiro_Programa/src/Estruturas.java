import java.util.Scanner;

public class Estruturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um n�mero de 0 � 2:");
		int opc = sc.nextInt();
		switch(opc) {
		case 0:
			System.out.println("Voc� escolheu a op��o 0");
			break;
		case 1:
			System.out.println("Voc� escolheu a op��o 1");
			break;
		case 2:
			System.out.println("Voc� escolheu a op��o 2");
			break;
		default:
			System.out.println("Op��o inv�lida!");
		}
		sc.close();
		
	}
}