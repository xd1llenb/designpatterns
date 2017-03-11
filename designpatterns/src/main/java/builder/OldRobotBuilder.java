package builder;

public class OldRobotBuilder implements RobotBuilder {

	private Robot robot;
	
	public OldRobotBuilder() {
		this.robot = new Robot();
	}

	public void BuildRobotHead() {
		robot.setRobotHead("tin head");
	}

	public void BuildRobotTorso() {
		robot.setRobotTorso("Wood Torso");
	}

	public void BuildRobotArms() {
		robot.setRobotArms("Steel Arms");
	}

	public void BuildRobotLegs() {
		robot.setRobotLegs("Spring Legs");
	}

	public Robot getRobot() {
		// TODO Auto-generated method stub
		return this.robot;
	}

}
