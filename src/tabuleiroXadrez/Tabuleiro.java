package tabuleiroXadrez;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (this.linhas < 1 || this.colunas < 1) {
			throw new TabuleiroException("Erro na criaçao do Tabuleiro de Xadrez!");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		this.pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if(!verificaPosicao(linha, coluna)) {
			throw new TabuleiroException("Tabuleiro de xadrez nao possui esta posiçao!");
		}
		return this.pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroException("Tabuleiro de xadrez nao possui esta posiçao!");
		}
		return this.pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocarPeca(Peca peca, Posicao posicao) {
		if(confirmacaoPeca(posicao)) {
			throw new TabuleiroException("Posicao informada invalida, ja esta ocupada!" + posicao);
		}
		this.pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean verificaPosicao(int linha, int coluna) {
		return linha >= 0 && linha < this.linhas && coluna >= 0 && coluna < this.colunas;
	}

	public boolean existePosicao(Posicao posicao) {
		return verificaPosicao(posicao.getLinha(), posicao.getColuna());
	}

	public boolean confirmacaoPeca(Posicao posicao) {
		if(!existePosicao(posicao)) {
			throw new TabuleiroException("Tabuleiro de xadrez nao possui esta posiçao!");
		}
		return peca(posicao) != null;
	}
}
