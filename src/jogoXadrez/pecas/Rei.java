package jogoXadrez.pecas;

import jogoXadrez.Cor;
import jogoXadrez.PecaXadrez;
import tabuleiroXadrez.Tabuleiro;

public class Rei extends PecaXadrez {

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
