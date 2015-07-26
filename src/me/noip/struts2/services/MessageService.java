package me.noip.struts2.services;

import java.util.ArrayList;
import java.util.List;

import me.noip.struts2.beans.MessageBean;

public class MessageService {

	private static MessageService instance;
	private List<MessageBean> messageListMock = new ArrayList<MessageBean>();
	
	private MessageService() {
		this.messageListMock = new ArrayList<MessageBean>();
	}
	
	public static synchronized MessageService getInstance(){
		if (instance == null) instance = new MessageService();
		return instance;
	}
	
	public List<MessageBean> getUserMessagesMock(String username){
		List<MessageBean> result = this.messageListMock;
		//Generate 5 fake messages
		String sender = "Anon";
		result.add(new MessageBean("Lorem ipsum dolor sit amet.",sender,username));
		result.add(new MessageBean("consectetur adipiscing elit.",sender,username));
		result.add(new MessageBean("Mauris ac fringilla magna.",sender,username));
		result.add(new MessageBean("Morbi auctor metus fringilla semper rutrum.",sender,username));
		result.add(new MessageBean("Integer eros lorem, maximus vel ligula sit amet,",sender,username));
		return result;
	}
	
	public Boolean sendMessageMock(String message,String sender, String receiver){
		this.messageListMock.add(new MessageBean(message,sender,receiver));
		return true;
	}

}
