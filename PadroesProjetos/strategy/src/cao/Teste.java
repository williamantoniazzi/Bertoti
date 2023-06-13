package cao;

import cao.Auau;

public class Teste {

	public static void main(String[] args) {
		Cao cao = new Cao();
		cao.setAuau(new Alto());
		cao.latir();

		cao.setAuau(new Baixo());
		cao.latir();
	}
}
