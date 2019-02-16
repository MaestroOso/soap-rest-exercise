package maestrooso.projects.soap.rest.webservice.models;

import java.sql.Date;

public class MovementModel {
	private Long id;
	private Double amount;
	private Date date;
	private String type;
	private String creditCardNumber;
	
	
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public MovementModel(Long id, Double amount, Date date, String type) {
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.type = type;
	}
	
	public MovementModel() {}
	@Override
	public String toString() {
		return "MovementModel [id=" + id + ", amount=" + amount + ", date=" + date + ", type=" + type + "]";
	}
	
	
}
