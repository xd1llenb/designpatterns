package builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Here are the robot components:");
		
		System.out.println("firstRobot:" + firstRobot.toString());
		
	}

}
