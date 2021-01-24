package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nameCli;
	private String emailCli;
	private Date birthDate;
		
	public Client() {
		
	}

	public Client(String nameCli, String emailCli, Date birthDate) {
		super();
		this.nameCli = nameCli;
		this.emailCli = emailCli;
		this.birthDate = birthDate;
	}

	public String getNameCli() {
		return nameCli;
	}

	public void setNameCli(String nameCli) {
		this.nameCli = nameCli;
	}

	public String getEmailCli() {
		return emailCli;
	}

	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return nameCli + " (" + sdf.format(birthDate) + ") - " + emailCli;
	}
}
