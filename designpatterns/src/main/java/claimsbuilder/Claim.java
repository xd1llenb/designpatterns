package claimsbuilder;

public class Claim {

	public String claimPersonal;
	public String claimDiagnosis;
	public String claimProcedure;
	public String claimInsurance;
	
	public Claim () {
		
	}

	public String getClaimPersonal() {
		return claimPersonal;
	}

	public void setClaimPersonal(String claimPersonal) {
		this.claimPersonal = claimPersonal;
	}

	public String getClaimDiagnosis() {
		return claimDiagnosis;
	}

	public void setClaimDiagnosis(String claimDiagnosis) {
		this.claimDiagnosis = claimDiagnosis;
	}

	public String getClaimProcedure() {
		return claimProcedure;
	}

	public void setClaimProcedure(String claimProcedure) {
		this.claimProcedure = claimProcedure;
	}

	public String getClaimInsurance() {
		return claimInsurance;
	}

	public void setClaimInsurance(String claimInsurance) {
		this.claimInsurance = claimInsurance;
	}

	@Override
	public String toString() {
		return "Claim [claimPersonal=" + claimPersonal + ", claimDiagnosis=" + claimDiagnosis + ", claimProcedure="
				+ claimProcedure + ", claimInsurance=" + claimInsurance + "]";
	}
	
}
