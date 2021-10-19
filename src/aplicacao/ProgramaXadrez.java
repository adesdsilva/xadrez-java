package aplicacao;

import jogoXadrez.PartidaXadrez;

public class ProgramaXadrez {

	public static void main(String[] args) {
		
		PartidaXadrez partida = new PartidaXadrez();
		TelaXadrez.printTabuleiro(partida.getPecas());
	}

}
