package entities;

import java.util.Date;

public class Client {

	private String name;
	private String email;	
	private Date birthDate;
	
	public Client() {
		
	}
	
	public Client(String name, String email, Date birthdate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthdate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client data \n");
		sb.append("Name: " + name + "\n");
		sb.append("Email: " + email + "\n");
		sb.append("BirthDate: " + birthDate);
		return sb.toString();
	}
	
		
}
