package claimsbuilder;

public class TestClaimBuilder {

	public static void main(String[] args) {

		ClaimBuilder physclaim = new PhysClaimBuilder();
		ClaimDesigner claimDesigner = new ClaimDesigner(physclaim);
		claimDesigner.assembleClaim();
		Claim testclaim = claimDesigner.getClaim();
		System.out.println("Here is the physicians claim: ");
		System.out.println(testclaim.toString());
		
	}

}
