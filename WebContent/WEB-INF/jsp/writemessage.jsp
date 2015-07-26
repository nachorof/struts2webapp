<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Write a message!</h1>
	<%@ include file="/WEB-INF/jsp/inc/menu.jsp" %>
	<s:form action="send_message" method="get">
		<s:textfield label="To" name="receiver" />
		<s:textarea label="Message" name="message" cols="40" rows="10"/>
		<s:submit value="Send!"/>
	</s:form>
	<%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>
</body>
</html>