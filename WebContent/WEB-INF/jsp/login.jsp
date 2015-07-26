<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="Nasty Nash">
    <!--  link rel="icon" href="../../favicon.ico">-->

    <title>Signin in Struts 2</title>

  </head>

  <body>
  		<h1>Please sign in</h1>
      	<s:form action="login" method="post">
        	<s:textfield name="username" label="Your name" />
        	<s:password name="password" label="Your password" />
        	<s:submit value="Sign in"/>
      	</s:form>

		<%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>
		
    </body>
</html>