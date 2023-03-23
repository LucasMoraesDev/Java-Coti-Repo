package controllers;

import java.util.Scanner;

import entities.Departamento;
import entities.Funcionario;
import enums.TipoContratacao;
import repositories.FuncionarioRepository;

public class FuncionarioController {

	public void cadastrarFuncionario() {

		System.out.println("\n*** CADASTRO DE FUNCIONÁRIOS ***\n");

		Funcionario funcionario = new Funcionario();

		Departamento departamento = new Departamento();

		Scanner scanner = new Scanner(System.in);

		System.out.print("ID DO FUNCIONÁRIO.........: ");
		funcionario.setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("NOME......................: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("CPF.......................: ");
		funcionario.setCpf(scanner.nextLine());

		System.out.print("MATRICULA.................: ");
		funcionario.setMatricula(scanner.nextLine());

		System.out.print("SALÁRIO...................: ");
		funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

		System.out.print("ID DO DEPARTAMENTO........: ");
		departamento.setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("NOME......................: ");
		departamento.setNome(scanner.nextLine());

		System.out.print("DESCRIÇÃO.................: ");
		departamento.setDescricao(scanner.nextLine());

		System.out.println("TIPO DE CONTRATAÇÃO: ");
		System.out.println("(1) Estágio");
		System.out.println("(2) CLT");
		System.out.println("(3) Terceirizado");
		System.out.print("INFORME O TIPO DESEJADO...: ");
		Integer tipo = Integer.parseInt(scanner.nextLine());

		switch (tipo) {
		
		case 1:
			funcionario.setTipoContratacao(TipoContratacao.Estagio);
			break;
			
		case 2:
			funcionario.setTipoContratacao(TipoContratacao.CLT);
			break;
			
		case 3:
			funcionario.setTipoContratacao(TipoContratacao.Terceirizado);
			break;
			
		}

		funcionario.setDepartamento(departamento);

		scanner.close();

		System.out.println("\nDADOS DO FUNCIONÁRIO:");
		System.out.println("\tID DO FUNCIONÁRIO..........: " + funcionario.getId());
		System.out.println("\tNOME.......................: " + funcionario.getNome());
		System.out.println("\tCPF........................: " + funcionario.getCpf());
		System.out.println("\tMATRICULA..................: " + funcionario.getMatricula());
		System.out.println("\tSALÁRIO....................: " + funcionario.getSalario());
		System.out.println("\tID DO DEPARTAMENTO.........: " + funcionario.getDepartamento().getId());
		System.out.println("\tNOME.......................: " + funcionario.getDepartamento().getNome());
		System.out.println("\tDESCRIÇÃO..................: " + funcionario.getDepartamento().getDescricao());
		System.out.println("\tTIPO DE CONTRATAÇÃO........: " + funcionario.getTipoContratacao());
		
		FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
		funcionarioRepository.exportarDados(funcionario);
	}
}
