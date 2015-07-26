package me.noip.struts2.beans;

public class MessageBean {

	private String subject;
	private String message; //BBcode?
	private String sender;
	private String receiver;
	private Integer id;
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public MessageBean() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public MessageBean(String subject, String message, 
			String sender, String receiver) {
		super();
		this.message = message;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	

}
