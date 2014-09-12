package br.com.manrique.marsrovers.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.manrique.marsrovers.entity.Robot;
import br.com.manrique.marsrovers.form.RobotForm;
import br.com.manrique.marsrovers.util.DirectionUtil;

/**
 * Robot controller, executes the commands.
 * 
 * @author mmanrique
 *
 */
@Controller
@RequestMapping("/robot")
public class RobotController {
	
	/**
	 * Prepare Index page.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String prepare(ModelMap model) {
		model.addAttribute("robotForm", new RobotForm()); 
		return "index";
 
	}
	
	/**
	 * Execute page instructions.
	 * 
	 * @param robotForm
	 * @return
	 */
	@RequestMapping(value = "/execute", method = RequestMethod.POST)
	public String execute(RobotForm robotForm) {
		String instructions = robotForm.getInstructions();
		try {
			robotForm.setResult(execute(instructions));
		} catch (Exception e) {
			robotForm.setResult("Invalid instructions!");
		}
		return "index";
	}
	/**
	 * Initial method of execution.
	 * 
	 * @param string
	 * @return
	 * @throws Exception
	 */
	public String execute(String string) throws Exception {
		String[] rows = string.split("\n");
		String initialPosition = rows[1];
		String instruction = rows[2];
		Robot robot = startRobot(initialPosition);
		executeInstruction(instruction, robot);
		return robot.getCurrentPosition();
	}
	
	/**
	 * Performs movements turn or move.
	 * 
	 * @param string
	 * @param robot
	 * @throws Exception
	 */
	public void executeInstruction(String string, Robot robot)
			throws Exception {
		char[] instructions = string.toCharArray();
		for (char instruction : instructions) {
			if (instruction == 'M') {
				robot.move();
			} else {
				robot.turn(instruction);
			}
		}
	}

	/**
	 * Start the object robot.
	 * 
	 * @param string
	 * @return
	 */
	public Robot startRobot(String string) {
		String[] instructions = string.split(" ");
		Robot robot = null;
		if(instructions.length == 3){
			robot = new Robot(Integer.parseInt(instructions[0]), 
					Integer.parseInt(instructions[1]), DirectionUtil.getDirectionByChar(instructions[2].charAt(0)));
		} else {
			throw new IllegalArgumentException();
		}
		return robot;
	}
}
