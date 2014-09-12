package br.com.manrique.marsrovers.util;

import br.com.manrique.marsrovers.enums.Directions;

public class DirectionUtil {

	/**
	 * Gets the enumeration by char.
	 * 
	 * @param direction
	 * @return
	 */
	public static Directions getDirectionByChar(char direction) {
		switch (direction) {
		case 'S':
			return Directions.SOUTH;
		case 'N':
			return Directions.NORTH;
		case 'W':
			return Directions.WEST;
		default:
			return Directions.EAST;
		}
	}

}
