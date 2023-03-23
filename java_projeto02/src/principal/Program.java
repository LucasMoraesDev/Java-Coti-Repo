package principal;

import controllers.FuncionarioController;

public class Program {

	public static void main(String[] args) {
		
		FuncionarioController funcionarioController = new FuncionarioController();
		funcionarioController.cadastrarFuncionario();

	}

}
