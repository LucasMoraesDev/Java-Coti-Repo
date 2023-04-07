package repositories;

import java.io.PrintWriter;

import entities.Pessoa;

public class PessoaRepositoryXml extends PessoaRepositoryAbstract {

	@Override
	public void exportar(Pessoa pessoa) throws Exception {

		PrintWriter printWriter = new PrintWriter("/home/moraes/eclipse-workspace/java_projeto05/pessoa.xml");

		printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
		printWriter.write("<pessoa>");
		printWriter.write("<idpessoa>" + pessoa.getIdPessoa() + "</idpessoa>");
		printWriter.write("<nome>" + pessoa.getNome() + "</nome>");
		printWriter.write("<cpf>" + pessoa.getCpf() + "</cpf>");
		printWriter.write("</pessoa>");

		printWriter.flush();
		printWriter.close();
	}

}
