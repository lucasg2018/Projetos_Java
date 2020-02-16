import java.util.Scanner;

public class Atividades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int higher = maior(num1, num2, num3);
		System.out.printf("O maior número é o %d", higher);
		sc.close();
	}

	public static int maior(int x, int y, int z) {
		if(x>y && x>z) {
			return x;	
		}else if(y>z) {
			return y;
		}else {
			return z;
		}
	}
}