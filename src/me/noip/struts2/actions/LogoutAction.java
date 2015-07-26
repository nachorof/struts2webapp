package me.noip.struts2.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	
	public LogoutAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String execute(){
		if (session!=null)
			session.clear();
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
