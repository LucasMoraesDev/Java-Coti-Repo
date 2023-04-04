package repositories;

import java.io.PrintWriter;

import entities.Fornecedor;
import entities.Produto;

public class FornecedorRepository {

	public static void exportar(Fornecedor fornecedor) throws Exception {
		PrintWriter printWriter = new PrintWriter("/home/moraes/eclipse-workspace/java_projeto04/fornecedor.txt");

		printWriter.write("\n" + fornecedor.toString());

		for (Produto produto : fornecedor.getProdutos()) {

			printWriter.write("\n\t" + produto.toString());
		}

		printWriter.flush();
		printWriter.close();
	}
}
