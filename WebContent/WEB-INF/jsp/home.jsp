<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Struts 2 web app">
    <meta name="author" content="Nasty Nash">
	<title>Hello World Struts 2</title>
</head>
<body>

	<h1>Hola <s:property value="#session['username']"/>!</h1>  
	<h1>Que tal ${username}?</h1>  
   
   <%@ include file="/WEB-INF/jsp/inc/menu.jsp" %>
    
    <!-- iterar sobre el objeto REQUEST para recuperar los mensajes -->
    <p>
    <table>		
       	<s:iterator value="messages" status="status">
    		<tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
    			<td><s:property value="top.message"/></td>
    		</tr>
    	</s:iterator>
    </table>
    </p>
       	
	<%@ include file="/WEB-INF/jsp/inc/footer.jsp" %>

</body>
</html>