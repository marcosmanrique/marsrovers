package br.com.manrique.marsrovers.enums;

/**
 * Enumeration with direction of robot.
 * 
 * @author mmanrique
 *
 */
public enum Directions {
	SOUTH('S'),
	NORTH('N'),
	WEST('W'),
	EAST('E');
	
	private char direction;
	
	private Directions(char direction) {
		this.direction = direction;
	}

	public char getDirection() {
		return direction;
	}
}
