<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Ok</title>
</head>
<body>
	<h1>Login Ok</h1>
	<%
	String mail = (String) request.getAttribute("mail");
	String mdp = (String) request.getAttribute("mdp");
	
	out.println("Bonjour " + mail);
	%>
	
	<br/><a href="accueil">Acccueil</a>
</body>
</html>