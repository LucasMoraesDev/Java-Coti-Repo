package controllers;

import java.util.Scanner;

import entities.Pessoa;
import repositories.PessoaRepositoryAbstract;
import repositories.PessoaRepositoryTxt;
import repositories.PessoaRepositoryXml;

public class PessoaController {

	public static void cadastrarPessoa() {
		
		try {
			
			System.out.println("\nCADASTRO DE PESSOA:\n");
			
			Pessoa pessoa = new Pessoa();
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("INFORME O ID..............: ");
			pessoa.setIdPessoa(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("INFORME O NOME............: ");
			pessoa.setNome(scanner.nextLine());
			
			System.out.print("INFORME O CPF.............: ");
			pessoa.setCpf(scanner.nextLine());
			
			System.out.print("INFORME (1)TXT ou (2)XML..: ");
			Integer opcao = Integer.parseInt(scanner.nextLine());
			
			//declarando um objeto para a classe abstrata
			//este objeto será inicializado com valor vazio (null)
			PessoaRepositoryAbstract pessoaRepository = null;
			
			switch(opcao) {
			case 1:
				//Polimorfismo
				pessoaRepository = new PessoaRepositoryTxt();
				break;
				
			case 2:
				//Polimorfismo
				pessoaRepository = new PessoaRepositoryXml();
				break;
			}
			
			pessoaRepository.exportar(pessoa);
			
			System.out.println("\nDADOS GRAVADOS COM SUCESSO!");
		}
		catch(Exception e) {
			System.out.println("\nFalha: " + e.getMessage());
		}
	}
	
}
