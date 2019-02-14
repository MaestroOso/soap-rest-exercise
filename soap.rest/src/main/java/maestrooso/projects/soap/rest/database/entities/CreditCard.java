package maestrooso.projects.soap.rest.database.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Creditcard")
public class CreditCard {	
	private String token;
	@Id
	private String number;
	private String expDate;
	private String franchise;
	
	public CreditCard(String token, String number, String expDate, String franchise) {
		super();
		this.token = token;
		this.number = number;
		this.expDate = expDate;
		this.franchise = franchise;
	}
	
	public CreditCard() {}

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
	
}
