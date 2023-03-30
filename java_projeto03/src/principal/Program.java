package principal;

import java.util.Scanner;

import controllers.ClienteController;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer opcao = 0;
		do {
			System.out.println("\n(1) CADASTRAR CLIENTE");
			System.out.println("(2) ATUALIZAR CLIENTE");
			System.out.println("(3) EXCLUIR CLIENTE");
			System.out.println("(4) CONSULTAR CLIENTES");
			System.out.println("(0) SAIR");

			

			System.out.print("\nENTRE COM A OPÇÃO DESEJADA..: ");
			opcao = Integer.parseInt(scanner.nextLine());

			ClienteController clienteController = new ClienteController();

			switch (opcao) {
			case 1:
				clienteController.cadastrarCliente();
				break;

			case 2:
				clienteController.atualizarCliente();
				break;

			case 3:
				clienteController.excluirCliente();
				break;

			case 4:
				clienteController.consultarClientes();
				break;
				
			case 0:
				System.out.println("\nBYE BYE!");
				break;

			default:
				System.out.println("\nOpção inválida.");
			}
		}
		while(opcao != 0);

		
	}

}
