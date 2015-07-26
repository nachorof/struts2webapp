package me.noip.struts2.actions;

import java.util.List;
import java.util.Map;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.interceptor.SessionAware;
import me.noip.struts2.beans.MessageBean;
import me.noip.struts2.services.MessageService;

public class InboxAction implements Action, SessionAware {
	
	private List<MessageBean> messages;
	private static final String USERNAME = "username";
	private Map<String,Object> session;
	
	public List<MessageBean> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageBean> messages) {
		this.messages = messages;
	}

	public InboxAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String execute() throws Exception {
		// Accessing the session
		// Mock: getting messages depending on the user
		String username = ((String) session.get(USERNAME));
		messages = MessageService.getInstance().getUserMessagesMock(username);
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	
	

}
