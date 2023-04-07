package repositories;

import entities.Pessoa;

public abstract class PessoaRepositoryAbstract {

	public abstract void exportar(Pessoa pessoa) throws Exception;
}
