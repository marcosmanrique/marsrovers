package br.com.manrique.marsrovers.entity;

import br.com.manrique.marsrovers.enums.Directions;
import br.com.manrique.marsrovers.enums.Moves;

/**
 * Entity related to the robot.
 * 
 * @author mmanrique
 *
 */
public class Robot {
	private Integer x;
	private Integer y;
	private Directions direction;

	public Robot(int x, int y, Directions direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	/**
	 * Responsible for moving the robot on the plateau.
	 */
	public void move() {
		switch (direction) {
		case NORTH:
			y++;
			break;
		case SOUTH:
			y--;
			break;
		case EAST:
			x++;
			break;
		case WEST:
			x--;
			break;
		default:
			break;
		}
	}

	/**
	 * Responsible to turn the robot 90 degrees left or right.
	 * 
	 * @param move
	 * @throws IllegalArgumentException
	 */
	public void turn(char move) throws IllegalArgumentException {
		if (Moves.LEFT.getMove() != move && Moves.RIGHT.getMove() != move) {
			throw new IllegalArgumentException();
		}
		switch (direction) {
		case NORTH:
			if (Moves.LEFT.getMove() == move)
				direction = Directions.WEST;
			else
				direction = Directions.EAST;
			break;
		case SOUTH:
			if (Moves.LEFT.getMove() == move)
				direction = Directions.EAST;
			else
				direction = Directions.WEST;
			break;
		case EAST:
			if (Moves.LEFT.getMove() == move)
				direction = Directions.NORTH;
			else
				direction = Directions.SOUTH;
			break;
		case WEST:
			if (Moves.LEFT.getMove() == move)
				direction = Directions.SOUTH;
			else
				direction = Directions.NORTH;
			break;
		default:
			break;
		}
	}

	/**
	 * Gets the current position of the robot.
	 * 
	 * @return position
	 */
	public String getCurrentPosition() {
		return x + " " + y + " " + direction.getDirection();
	}
}
