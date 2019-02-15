package maestrooso.projects.soap.rest.webservice.models;



public class CreditCardModel {
	
	private String token;
	private String number;
	private String expDate;
	private String franchise;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getFranchise() {
		return franchise;
	}
	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}
	
	public CreditCardModel(String token, String number, String expDate, String franchise) {
		this.token = token;
		this.number = number;
		this.expDate = expDate;
		this.franchise = franchise;
	}
	
	public CreditCardModel() {}
	
}
