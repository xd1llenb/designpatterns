package claimsbuilder;

public class ClaimDesigner {
	
	private ClaimBuilder claimBuilder;

	public ClaimDesigner(ClaimBuilder claimBuilder) {
		this.claimBuilder = claimBuilder;
	}

	public Claim getClaim() {
		return claimBuilder.getClaim();
	}
	
	public void assembleClaim() {
		this.claimBuilder.buildPersonal();
		this.claimBuilder.buildDiagnosis();
		this.claimBuilder.buildProcedure();
		this.claimBuilder.buildInsurance();
	}
	
}
