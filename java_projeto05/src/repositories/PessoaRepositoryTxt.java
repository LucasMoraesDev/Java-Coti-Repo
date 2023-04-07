package repositories;

import java.io.PrintWriter;

import entities.Pessoa;

public class PessoaRepositoryTxt extends PessoaRepositoryAbstract {

	@Override
	public void exportar(Pessoa pessoa) throws Exception {
		PrintWriter printWriter = new PrintWriter("/home/moraes/eclipse-workspace/java_projeto05/pessoa.txt");
		printWriter.write(pessoa.toString());
		printWriter.flush();
		printWriter.close();
		
	}

}
