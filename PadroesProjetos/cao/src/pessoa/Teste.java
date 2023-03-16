package pessoa;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setPessoa(new Menina());
		pessoa.sexo();
		
		pessoa.setPessoa(new Menino());
		pessoa.sexo();
	}

}
