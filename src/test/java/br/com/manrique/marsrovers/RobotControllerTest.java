package br.com.manrique.marsrovers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.manrique.marsrovers.control.RobotController;
import br.com.manrique.marsrovers.entity.Robot;
import br.com.manrique.marsrovers.util.DirectionUtil;

/**
 * Robot test class.
 * 
 * @author mmanrique
 *
 */
public class RobotControllerTest {

	/**
	 * Perform robot movements example 1.
	 * 
	 * @throws Exception
	 */
	@Test
	public void executeRobotMovesExample1() throws Exception {
		RobotController controller = new RobotController();
		assertEquals("Equals", "1 3 N", controller.execute("5 5\n1 2 N\nLMLMLMLMM\n"));
	}
	
	/**
	 * Perform robot movements example 2.
	 * 
	 * @throws Exception
	 */
	@Test
	public void executeRobotMovesExample2() throws Exception {
		RobotController controller = new RobotController();
		assertEquals("Equals", "5 1 E", controller.execute("5 5\n3 3 E\nMMRMMRMRRM\n"));
	}

	/**
	 * Move robot.
	 * 
	 * @throws Exception
	 */
	@Test
	public void moveRobot() throws Exception {
		RobotController controller = new RobotController();
		Robot robot = new Robot(1, 2, DirectionUtil.getDirectionByChar('N'));
		controller.executeInstruction("LMLMLMLMM", robot);
		assertEquals("Equals", "1 3 N", robot.getCurrentPosition());
	}

	/**
	 * Start robot.
	 * 
	 * @throws Exception
	 */
	@Test
	public void startRobot() throws Exception {
		RobotController controller = new RobotController();
		Robot robot = controller.startRobot("1 2 N");
		assertNotNull(robot);
	}

	/**
	 * Move robot one position.
	 */
	@Test
	public void moveOnePosition() {
		Robot robot = new Robot(1, 2, DirectionUtil.getDirectionByChar('N'));
		robot.move();
		assertEquals("Equals", "1 3 N", robot.getCurrentPosition());
	}

	/**
	 * Move robot two position.
	 */
	@Test
	public void moveTwoPosition() {
		Robot robot = new Robot(1, 2, DirectionUtil.getDirectionByChar('N'));
		robot.move();
		robot.move();
		assertEquals("Equals", "1 4 N", robot.getCurrentPosition());
	}

	/**
	 * Change direction.
	 * 
	 * @throws Exception
	 */
	@Test
	public void changeDirection() throws Exception {
		Robot robot = new Robot(1, 2, DirectionUtil.getDirectionByChar('N'));
		robot.turn('L');
		assertEquals("Equals", "1 2 W", robot.getCurrentPosition());
	}

	/**
	 * Invalid instructions.
	 * 
	 * @throws Exception
	 */
	@Test(expected = Exception.class)
	public void invalidInstructions() throws Exception {
		Robot robot = new Robot(1, 2, DirectionUtil.getDirectionByChar('N'));
		robot.turn('W');
		assertEquals("Fail", "1 2 W", robot.getCurrentPosition());
	}
	
}
