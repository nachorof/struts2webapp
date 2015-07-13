package me.noip.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String username;
	private String password;
	private Integer trialNumber;
	
	public LoginAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String execute(){
		//se toman los datos y se llaman a las clases de negocio
		return SUCCESS;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTrialNumber() {
		return trialNumber;
	}

	public void setTrialNumber(Integer trialNumber) {
		this.trialNumber = trialNumber;
	}
	
	

}
