package me.noip.struts2.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor{
	
	private static String USERNAME = "username";
	
	public LoginInterceptor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
	}

	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		// Check if there is session and if it has a username
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		String username = (String)session.get(USERNAME);
		if (username==null){
			return Action.LOGIN;
		}
		return invocation.invoke();
	}
	
	private Boolean validateUser(String username, String password){
		return (username!=null && username.equals("nacho"));
	}
}