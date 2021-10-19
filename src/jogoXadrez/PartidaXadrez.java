package jogoXadrez;

import jogoXadrez.pecas.Rei;
import jogoXadrez.pecas.Torre;
import tabuleiroXadrez.Posicao;
import tabuleiroXadrez.Tabuleiro;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		this.tabuleiro = new Tabuleiro(8, 8);
		iniciarJogo();
	}
	
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] matriz = new PecaXadrez[this.tabuleiro.getLinhas()][this.tabuleiro.getColunas()];
		for(int i = 0; i<this.tabuleiro.getLinhas(); i++) {
			for(int j = 0; j<this.tabuleiro.getColunas(); j++) {
				matriz[i][j] = (PecaXadrez) this.tabuleiro.peca(i, j);
			}
		}
		return matriz;
	}
	
	private void iniciarJogo() {
		this.tabuleiro.colocarPeca(new Torre(this.tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		this.tabuleiro.colocarPeca(new Rei(this.tabuleiro, Cor.PRETO), new Posicao(4, 5));
	}
}
