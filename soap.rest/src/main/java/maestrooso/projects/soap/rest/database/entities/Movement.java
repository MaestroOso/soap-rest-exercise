package maestrooso.projects.soap.rest.database.entities;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movement")
public class Movement {
	@Id
	@GeneratedValue
	private Long id;
	private BigDecimal amount;
	private Date date;
	private String type;
	
	private String creditCardNumber;
	
	
	
	public Movement(BigDecimal amount, Date date, String type, String creditCardNumber) {
		this.amount = amount;
		this.date = date;
		this.type = type;
		this.creditCardNumber = creditCardNumber;
	}

	public Movement() {}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
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

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public Long getId() {
		return this.id;
	}
	
}
