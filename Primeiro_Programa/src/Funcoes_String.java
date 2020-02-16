import java.util.Scanner;

public class Funcoes_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String forM, form;
		System.out.println("Informe o texto para formatar as letras para maiúsculo:");
		forM = sc.next().toUpperCase();
		System.out.println("Informe o texto para formatar as letras para minúsculo:");
		form = sc.next().toLowerCase();
		System.out.printf("\nTexto formatado em Maiúsculo: %s", forM);
		System.out.printf("\nTexto formatado em Minúsculo: %s", form);
	
		System.out.printf("\nRecortado: %s", forM.substring(2,4));
		sc.close();
	}
}