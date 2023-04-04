package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Fornecedor;
import entities.Produto;
import repositories.FornecedorRepository;

public class Program {

	public static void main(String[] args) {

		try {

			// criando produtos
			Produto produto1 = new Produto(1, "Notebook", 5000.0, 10);
			Produto produto2 = new Produto(2, "TV", 4000.0, 20);
			Produto produto3 = new Produto(3, "Mochila", 600.0, 15);

			// guardar estes produtos em uma lista
			List<Produto> lista = new ArrayList<Produto>();

			// adicionando os produtos na lista
			lista.add(produto1);
			lista.add(produto2);
			lista.add(produto3);

			// criando um fornecedor
			Fornecedor fornecedor = new Fornecedor(1, "Loja de Informática", "96.333.814/0001-17", lista);

			FornecedorRepository.exportar(fornecedor);

			System.out.println("\nDados gravados com sucesso!");
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}
}
