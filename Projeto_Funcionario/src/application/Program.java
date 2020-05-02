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
					"\n\n              Bem vindo!                            Último acesso: " + sdf.format(new Date()));

			System.out.println("----------------------------------------\n");

			System.out.println("Informe a operação desejada:");
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
	
	//Função para cadastrar funcionários
	public static void Cadastrar() {

		System.out.print("Informe a quantidade de funcionários: ");
		int n = ler.nextInt();
		ler.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("\n%dº Funcionário\n", i);

			System.out.print("Nome: ");
			String nome = ler.nextLine();
			System.out.print("Salário: ");
			double salario = ler.nextDouble();
			ler.nextLine();

			funcionario.add(new Funcionario(Funcionario.contadorId(funcionario), nome, salario, new Date()));
		}
	}

	// Função para alterar um cadastro
	public static void Alterar() {
		Listar();
		
		System.out.print("\nInforme o Id do funcionário que deseja alterar: ");
		int alt = ler.nextInt();
		ler.nextLine();
		
		for (Funcionario func : funcionario) {
			if(alt == func.getId()) {
				System.out.print("Nome: ");
				func.setNome(ler.nextLine());
				System.out.print("Salário: ");
				func.setSalario(ler.nextDouble());
				ler.nextLine();
				func.setCriado(new Date());
				
				break;
			}
		}
	}

	// Função para abrir um arquivo já salvo!
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
			System.out.println("\nErro: Arquivo não encontrado!");
		} catch (java.text.ParseException e) {
			System.out.println("\nErro: Ocorreu um erro na data!");
		}
	}

	// Função para excluir funcionários cadastrados
	public static void Excluir() {
		Listar();
		System.out.print("\nInforme o ID do funcionário que deseja excluir: ");
		int pesquisa = ler.nextInt();
		ler.nextLine();

		funcionario.remove(pesquisa - 1);
	}

	// Função para listar todos os funcionários
	public static void Listar() {
		System.out.println(
				"Dados do Funcionários\n" + funcionario.toString().replace("[", "").replace("]", "").replace(",", ""));
	}

	// Função para salvar os dados dos funcionários
	public static void Salvar() {
		System.out.print("Informe o endereço com o final indicando o formato(\txt): ");
		String endereco = ler.nextLine();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(endereco))) {

			for (Funcionario func : funcionario) {
				bw.write(func.getId() + " - " + func.getNome() + " - " + func.getSalario() + " - " + sdf.format(func.getCriado()));
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("\nErro: Endereço inválido!");
		}
	}
}
