package program;

import java.util.Scanner;

import exception.DbException;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			System.out.print("Data de nascimento(DD/MM/YYYY): ");
			String birthDate = ler.nextLine();
			
			System.out.println(birthDate.length());
			
			if (birthDate.length() != 10) {
				System.out.println("Erro! Formato da data incorreto");
			} else {
				validacaoDate(birthDate);
			}	
			
			System.out.println("Tudo ok!");
			
		}catch(DbException e) {
			System.out.println(e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		ler.close();
	}

	private static void validacaoDate(String birthDate) {
		try {
			int dia = Integer.parseInt(birthDate.substring(0, 2));
			int mes = Integer.parseInt(birthDate.substring(3, 5));
			int ano = Integer.parseInt(birthDate.substring(6, 10));

			if (dia > 31 || dia < 1) {
				throw new DbException("Erro! Dia inválido!");
			} else if (mes > 12 || mes < 1) {
				throw new DbException("Erro! Mês inválido!");
			} else if (ano < 1900) {
				throw new DbException("Erro! Ano inválido!");
			}
		} catch (Exception e) {
			throw new DbException(e.getMessage());
		}
	}
}
