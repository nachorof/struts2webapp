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
    <!--  link rel="icon" href="../../favicon.ico"> -->
	<!--  link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"-->
	<title>Hello World Struts 2</title>
</head>
<body>
	<!-- nav menu -->
	
	<!--  ul class="nav nav-tabs">
  		<li role="presentation" class="active"><a href="#">Home</a></li>
  		<li role="presentation"><a href="./LogIn.jsp">Login</a></li>
  		<li role="presentation"><a href="#">Signup</a></li>
	</ul -->
	
	
    <div class="container">
		<h1>Welcome Page!</h1>
		<!--form action="hello" method="post">
			<label for="name">Please enter your name:</label>
			<input type="text" name="name"/>
			<input type="submit" value="Say hello!"/>
		</form-->
        	<p>
        		<a href="./login.jsp">Login</a>
        		<a href="./signup.jsp">Signup</a>
        	</p>
      </div><!-- /.container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!-- script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script-->
    <!-- script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script-->
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="http://getbootstrap.com/assets/js/ie10-viewport-bug-workaround.js"></script>

	
</body>
</html>