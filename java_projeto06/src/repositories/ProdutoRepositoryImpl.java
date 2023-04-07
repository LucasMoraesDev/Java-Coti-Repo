package repositories;

import java.io.PrintWriter;

import entities.Produto;
import interfaces.ProdutoRepository;

public class ProdutoRepositoryImpl implements ProdutoRepository {

	@Override
	public void exportar(Produto produto) throws Exception {

		PrintWriter printWriter = new PrintWriter("/home/moraes/eclipse-workspace/java_projeto06/produto.xml");
		
		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
		printWriter.write("<produto>");
			printWriter.write("<idproduto>" + produto.getIdProduto() + "</idproduto>");
			printWriter.write("<nome>" + produto.getNome() + "</nome>");
			printWriter.write("<preco>" + produto.getPreco() + "</preco>");
		printWriter.write("</produto>");
		
		printWriter.flush();
		printWriter.close();
	}
}



