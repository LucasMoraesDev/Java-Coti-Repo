package repositories;

import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {

	public void exportarDados(Cliente cliente) {

		try {
			PrintWriter printWriter = new PrintWriter("/home/moraes/eclipse-workspace/temp/client.txt");

			printWriter.write("\nID DO CLIENTE...: " + cliente.getIdCliente());
			printWriter.write("\nNOME............: " + cliente.getNome());
			printWriter.write("\nEMAIL...........: " + cliente.getEmail());

			printWriter.flush();
			printWriter.close();

			System.out.println("\nArquivo gravado com sucesso!");

		} catch (Exception e) {
			System.out.println("Falaha ao gravar arquivo!");
		}
	}
}
