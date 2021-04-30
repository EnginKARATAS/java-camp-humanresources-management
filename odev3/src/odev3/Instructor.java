package odev3;

public class Instructor extends User {
	private String ibanNumber;
	private String privacyContract; 

	public String getIbanNumber() {
		return ibanNumber;
	}
	public void setIbanNumber(String ibanNumber) {
		this.ibanNumber = ibanNumber;
	}
	public String getPrivacyContract() {
		return privacyContract;
	}
	public void setPrivacyContract(String privacyContract) {
		this.privacyContract = privacyContract;
	}
}
