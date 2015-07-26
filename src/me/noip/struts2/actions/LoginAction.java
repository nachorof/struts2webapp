package me.noip.struts2.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	
	private String username;
	private String password;
	private Map<String,Object> session;
	
	public String execute() throws Exception{
		//if ("SECRET".equalsIgnoreCase(name)) return SUCCESS;
		//return ERROR;
		if (username.equalsIgnoreCase("nacho")){
			session.put("username", username);
			return SUCCESS;	
		}
		return LOGIN;
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

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}

}
