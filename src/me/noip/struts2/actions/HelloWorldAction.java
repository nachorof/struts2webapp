package me.noip.struts2.actions;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	
	private String name;
	
	public String execute() throws Exception{
		//if ("SECRET".equalsIgnoreCase(name)) return SUCCESS;
		//return ERROR;
		return SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
