package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.entities.Funcionario;
import model.exception.DomainException;

public class Program {
	public static Scanner ler = new Scanner(System.in);
	public static List<Funcionario> funcionario = new ArrayList<>();
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public static void main(String[] args) {
		String resposta;

		do {
			System.out.println(
					"\n\n              Bem vindo!                            �ltimo acesso: " + sdf.format(new Date()));

			System.out.println("----------------------------------------\n");

			System.out.println("Informe a opera��o desejada:");
			System.out.println("(1) Cadastrar");
			System.out.println("(2) Alterar");
			System.out.println("(3) Abrir");
			System.out.println("(4) Excluir");
			System.out.println("(5) Listar");
			System.out.println("(6) Salvar");

			System.out.println("\n----------------------------------------");

			try {
				int decisao = ler.nextInt();
				ler.nextLine();

				switch (decisao) {
				case 1:
					Cadastrar();
					break;
				case 2:
					Alterar();
					break;
				case 3:
					Abrir();
					break;
				case 4:
					Excluir();
					break;
				case 5:
					Listar();
					break;
				case 6:
					Salvar();
					break;
				}
			} catch (DomainException e) {
				System.out.println("\nErro: " + e.getMessage());
			} catch (RuntimeException e) {
				System.out.println("Erro inesperado!");
			}

			System.out.print("\nDeseja continuar(S/N)?");
			resposta = ler.nextLine().toUpperCase();
		} while (resposta.equals("S"));

		System.out.println("\nFim do Programa!");
	}
	
	//Fun��o para cadastrar funcion�rios
	public static void Cadastrar() {

		System.out.print("Informe a quantidade de funcion�rios: ");
		int n = ler.nextInt();
		ler.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\n%d� Funcion�rio\n", i);

			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Sal�rio: ");
			double salario = ler.nextDouble();
			ler.nextLine();

			funcionario.add(new Funcionario(Funcionario.contadorId(funcionario), nome, salario, new Date()));
		}
	}

	// Fun��o para alterar um cadastro
	public static void Alterar() {
		Listar();
		
		System.out.print("\nInforme o Id do funcion�rio que deseja alterar: ");
		int alt = ler.nextInt();
		ler.nextLine();
		
		for (Funcionario func : funcionario) {
			if(alt == func.getId()) {
				System.out.print("Nome: ");
				func.setNome(ler.nextLine());
				System.out.print("Sal�rio: ");
				func.setSalario(ler.nextDouble());
				ler.nextLine();
				func.setCriado(new Date());
				
				break;
			}
		}
	}

	// Fun��o para abrir um arquivo j� salvo!
	public static void Abrir() {
		System.out.print("\nInsira o local do arquivo (C:user...): ");
		String arquivo = ler.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String line = br.readLine();

			while (line != null) {
				String[] lines = line.split(" - ");
				int id = Integer.parseInt(lines[0]);
				String nome = lines[1];
				double salario = Double.parseDouble(lines[2]);
				Date criado = sdf.parse(lines[3]);
				funcionario.add(new Funcionario(id, nome, salario, criado));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("\nErro: Arquivo n�o encontrado!");
		} catch (java.text.ParseException e) {
			System.out.println("\nErro: Ocorreu um erro na data!");
		}
	}

	// Fun��o para excluir funcion�rios cadastrados
	public static void Excluir() {
		Listar();
		System.out.print("\nInforme o ID do funcion�rio que deseja excluir: ");
		int pesquisa = ler.nextInt();
		ler.nextLine();

		funcionario.remove(pesquisa - 1);
	}

	// Fun��o para listar todos os funcion�rios
	public static void Listar() {
		System.out.println(
				"Dados do Funcion�rios\n" + funcionario.toString().replace("[", "").replace("]", "").replace(",", ""));
	}

	// Fun��o para salvar os dados dos funcion�rios
	public static void Salvar() {
		System.out.print("Informe o endere�o com o final indicando o formato(\txt): ");
		String endereco = ler.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(endereco))) {

			for (Funcionario func : funcionario) {
				bw.write(func.getId() + " - " + func.getNome() + " - " + func.getSalario() + " - " + sdf.format(func.getCriado()));
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("\nErro: Endere�o inv�lido!");
		}
	}
}
