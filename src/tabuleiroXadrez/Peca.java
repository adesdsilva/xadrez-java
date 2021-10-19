package tabuleiroXadrez;

public class Peca {
	
	protected Posicao posicao;
	
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		this.posicao = null;
	}

//	public Posicao getPosicao() {
//		return posicao;
//	}
//
//	public void setPosicao(Posicao posicao) {
//		this.posicao = posicao;
//	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

//	public void setTabuleiro(Tabuleiro tabuleiro) {
//		this.tabuleiro = tabuleiro;
//	}
	
	

}
