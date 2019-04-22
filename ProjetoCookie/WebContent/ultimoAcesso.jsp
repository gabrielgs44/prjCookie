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
	
	String data = null, hora = null;
	
	for (Cookie c : cookies) {
		if (c.getName().compareTo("Data") == 0)
			data = c.getValue();
		if(c.getName().compareTo("Hora") == 0)
			hora = c.getValue();
	}
	%>
	
	<p>Seu último acesso foi em <%=data %> - <%=hora %></p>
	
</body>
</html>