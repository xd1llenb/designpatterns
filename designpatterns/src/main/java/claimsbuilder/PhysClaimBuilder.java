package claimsbuilder;

public class PhysClaimBuilder implements ClaimBuilder {

	private Claim claim;
	
	public PhysClaimBuilder() {
		this.claim = new Claim();
	}

	public void buildPersonal() {
		claim.setClaimPersonal("Ivan the Terrible");
	}

	public void buildDiagnosis() {
		claim.setClaimDiagnosis("Flu");
	}

	public void buildProcedure() {
		claim.setClaimProcedure("Vaccine");
	}

	public void buildInsurance() {
		claim.setClaimInsurance("OhioHealth");
	}

	public Claim getClaim() {
		return this.claim;
	}

}
