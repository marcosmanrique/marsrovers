package br.com.manrique.marsrovers.form;

/**
 * Robot form object.
 * 
 * @author mmanrique
 *
 */
public class RobotForm {

	private String firstLine;

	private String secondLine;

	private String thirdLine;

	private String result;

	public String getFirstLine() {
		return firstLine;
	}

	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	public String getThirdLine() {
		return thirdLine;
	}

	public void setThirdLine(String thirdLine) {
		this.thirdLine = thirdLine;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getInstructions() {
		return "0 0\n" + secondLine + "\n" + thirdLine;
	}
	
}
