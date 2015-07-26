package me.noip.struts2.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import me.noip.struts2.services.MessageService;

public class SendMessageAction extends ActionSupport implements SessionAware {
	
	private String message;
	private String receiver;
	private Map<String, Object> session;

	public SendMessageAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String execute(){
		MessageService.getInstance().sendMessageMock(message, (String)session.get("username"), receiver);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	
	

}
