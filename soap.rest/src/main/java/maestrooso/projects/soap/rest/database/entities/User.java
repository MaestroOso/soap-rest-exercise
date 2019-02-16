package maestrooso.projects.soap.rest.database.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

	private String fullname;

	private String code;

	private String documentType;

	private String documentNumber;
		
	public User(String fullname, String code, String documentType, String documentNumber) {
		super();
		this.fullname = fullname;
		this.code = code;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
	}

	public User() {}
	
	@Basic
	@Column(name = "fullname", nullable = true, length = 50)
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	@Basic
	@Column(name = "code", nullable = true, length = 50)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Basic
	@Column(name = "documenttype", nullable = true, length = 50)
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	@Id
	@Column(name = "documentnumber", nullable = false)
	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
}
