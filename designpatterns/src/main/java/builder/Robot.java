package builder;

public class Robot implements RobotPlan {

	private String robotHead;
	private String robotTorso;
	private String robotArms;
	private String robotLegs;

	public Robot() {
		// TODO Auto-generated constructor stub
	}

	public void setRobotHead(String head) {
		robotHead = head;
	}

	public void setRobotTorso(String torso) {
		robotTorso = torso;
	}

	public void setRobotLegs(String legs) {
		robotLegs = legs;
	}

	public void setRobotArms(String arms) {
		robotArms = arms;
	}

	public String getRobotHead() {
		return robotHead;
	}

	public String getRobotTorso() {
		return robotTorso;
	}

	public String getRobotArms() {
		return robotArms;
	}

	public String getRobotLegs() {
		return robotLegs;
	}

	@Override
	public String toString() {
		return "Robot [robotHead=" + robotHead + ", robotTorso=" + robotTorso + ", robotArms=" + robotArms
				+ ", robotLegs=" + robotLegs + "]";
	}
	

}
