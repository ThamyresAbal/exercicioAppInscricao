<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List <String> listaUF = (List<String>)request.getAttribute("listaUF");
	%>
	<form action="CandidatoController" method = "get">
		<input type = "hidden" name = "tela" value = "informacao.jsp">
		<h3>Nome</h3>
		<input type = "text" name = "nome">
		
		<h3>E-mail</h3>
		<input type = "text" name = "email">
		
		<h3>E-mail de confirmação</h3>
		<input type = "text" name = "emailConfirmacao">
		
		<h3>RG</h3>
		<input type = "text" name = "rg">
		
		<h3>Data de expedição</h3>          
		<input type = "text" name = "dataExpedicao">
		
		<h3>Orgão</h3>      
		<input type = "text" name = "orgao">
		
		<h3>UF</h3> 
		<select name ="uf">
			<% for(String uf : listaUF){ %>
			
			<option><%=uf %></option>
			<%} %>
		</select>	
				
		<hr>
		<input type="submit" value = "Avançar">       
		
	</form>
	
	<form action = "PessoaController" method = "post">
		<hr>
		<input type="submit" value = "Enviar">  
	</form>
	
	
</body>
</html>