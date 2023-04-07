package principal;

import entities.Produto;
import interfaces.ProdutoRepository;
import repositories.ProdutoRepositoryImpl;

public class Program {

	public static void main(String[] args) {
		
		try {
			
			Produto produto = new Produto(1, "Notebook Dell", 6000.0);
			
			ProdutoRepository produtoRepository = new ProdutoRepositoryImpl();
			produtoRepository.exportar(produto);
			
			System.out.println("\nDADOS GRAVADOS!");
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}

}



