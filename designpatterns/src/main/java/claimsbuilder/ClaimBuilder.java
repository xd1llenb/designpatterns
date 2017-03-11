package claimsbuilder;

public interface ClaimBuilder {
	
	public void buildPersonal();
	public void buildDiagnosis();
	public void buildProcedure();
	public void buildInsurance();
    public Claim getClaim();
}
