<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	<meta name="description" content="Struts 2 web app">
    <meta name="author" content="Nasty Nash">
	<title>Hello World Struts 2</title>
</head>
<body>
	
	
		<h1>Welcome Page!</h1>
        	<p>
        		<a href="<s:url action='redirect-login'/>">Login</a>
        		<a href="<s:url action='signup'/>">Signup</a>
        	</p>
    

	
</body>
</html>