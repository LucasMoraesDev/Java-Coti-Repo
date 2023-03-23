package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) {

		try {

			PrintWriter printWriter = new PrintWriter("/home/moraes/eclipse-workspace/java_projeto02/temp/client.txt");
			
			printWriter.write("\nID DO FUNCIONÁRIO....: " + funcionario.getId());
			printWriter.write("\nNOME.................: " + funcionario.getNome());
			printWriter.write("\nCPF..................: " + funcionario.getCpf());
			printWriter.write("\nMATRICULA............: " + funcionario.getMatricula());
			printWriter.write("\nSALARIO..............: " + funcionario.getSalario());
			printWriter.write("\nID DO DEPARTAMENTO...: " + funcionario.getDepartamento().getId());
			printWriter.write("\nNOME.................: " + funcionario.getDepartamento().getNome());
			printWriter.write("\nDESCRIÇÃO............: " + funcionario.getDepartamento().getDescricao());
			printWriter.write("\nTIPO DE CONTRATAÇÃO..: " + funcionario.getTipoContratacao());
			
			printWriter.flush(); //salvar o arquivo
			printWriter.close(); //fechar o arquivo
			
			System.out.println("\nDADOS GRAVADOS COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("Erro ao exportar funcionário. " + e.getMessage());
		}
	}

}
