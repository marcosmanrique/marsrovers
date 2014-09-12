package br.com.manrique.marsrovers.enums;

/**
 * Enumeration with moves of robot.
 * 
 * @author mmanrique
 *
 */
public enum Moves {
	LEFT('L'),
	RIGHT('R'),
	FORWARD('M');
	
	private char move;
	
	private Moves(char move) {
		this.move = move;
	}

	public char getMove() {
		return move;
	}
}
