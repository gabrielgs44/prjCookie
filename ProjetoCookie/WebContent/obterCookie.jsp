<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Leitura de Cookie</title>
</head>
<body>
	<h2>Leitura de Cookie</h2>
	
	<%
		Cookie[] cookies = request.getCookies();
	
	for (Cookie c : cookies) {
		out.println("Nome do cookie: " + c.getName());
		out.println("Valor de cookie: " + c.getValue());%><BR /><%
	}
	%>

</body>
</html>