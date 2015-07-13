package me.noip.struts2.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;


public class LoginInterceptor implements Interceptor {
	
	private static String USERNAME = "username";
	private static String LOGINRESULT = "login";

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
		// Ver si el interceptor tiene usuario en sesion
		final ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest)context.get("HTTP_REQUEST");
		HttpSession session = (HttpSession) request.getSession(true);
		String username = (String) session.getAttribute(USERNAME);
		if (username != null) return invocation.invoke();
		return LOGINRESULT;
	}

}
