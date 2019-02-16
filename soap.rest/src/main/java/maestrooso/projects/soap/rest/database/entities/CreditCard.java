package maestrooso.projects.soap.rest.database.entities;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Creditcard")
public class CreditCard {

	private String token;

	@Id
	private String number;

	private String expDate;

	private String franchise;
	
	private String userDocumentNumber;
	
	public CreditCard(String token, String number, String expDate, String franchise, String userDocumentNumber) {
		this.token = token;
		this.number = number;
		this.expDate = expDate;
		this.franchise = franchise;
		this.userDocumentNumber = userDocumentNumber;
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

	public String getUserDocumentNumber() {
		return userDocumentNumber;
	}

	public void setUserDocumentNumber(String userDocumentNumber) {
		this.userDocumentNumber = userDocumentNumber;
	}
	
}
