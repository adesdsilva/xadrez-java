package jogoXadrez.pecas;

import jogoXadrez.Cor;
import jogoXadrez.PecaXadrez;
import tabuleiroXadrez.Tabuleiro;

public class Torre extends PecaXadrez {

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}

	@Override
	public String toString() {
		return "T";
	}
}
