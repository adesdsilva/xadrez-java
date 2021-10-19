package aplicacao;

import jogoXadrez.PecaXadrez;

public class TelaXadrez {

	public static void printTabuleiro(PecaXadrez[][] pecas) {
		for(int i = 0; i<pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for(int j = 0; j<pecas.length; j++) {
				printPecas(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPecas(PecaXadrez peca) {
		if(peca == null) {
			System.out.print("-");
		}else {
			System.out.println(peca);
		}
		System.out.print(" ");
	}
}
