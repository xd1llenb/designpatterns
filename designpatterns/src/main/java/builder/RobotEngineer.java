package builder;

public class RobotEngineer {

	private RobotBuilder robotBuilder;
	
	public RobotEngineer(RobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}

	public Robot getRobot() {
		return robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		
		this.robotBuilder.BuildRobotHead();
		this.robotBuilder.BuildRobotTorso();
		this.robotBuilder.BuildRobotLegs();
		this.robotBuilder.BuildRobotArms();
	}
	
}
