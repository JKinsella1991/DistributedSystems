<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create a new booking</title>

</head>
<body>
<form action="webapi/myresource/write" method="post">
		<h1>Enter Customer details below (No spaces pls)</h1>

    	<h3> Todays Date: </h3>
    	<input type="date" name="date">
    	
    	<h3> First Name: </h3>
    	<input type="string" name="custFName">
    	
    	<h3> Surname: </h3>
    	<input type="string" name="custSName">
    	
    	<h3> Customer ID: </h3>
    	<input type="string" name="custID">
    	
    	<h3> Car Registration Number: </h3>
    	<input type="string" name="carReg">
    	
    	<h3> Date From: </h3>
    	<input type="date" name="dateFrom">
    	
    	<h3> Date To: </h3>
    	<input type="date" name="dateTo">
    	
	    
	    <input type="submit" value="Submit">
    </form>
<p><a href="index.jsp">Back to home menu</a></p>
</body>
</html>