package maestrooso.projects.soap.rest.database.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	private String fullname;
	private String code;
	private String documentType;
	@Id
	private String documentNumber;
	
	public User(String fullname, String code, String documentType, String documentNumber) {
		super();
		this.fullname = fullname;
		this.code = code;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}

	public User() {}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
}
