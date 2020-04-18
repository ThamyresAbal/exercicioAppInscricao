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
	List<String> listaEstadoCivil = (List<String>)request.getAttribute("listaEstadoCivil");
	List<String> listaNacionalidade = (List<String>)request.getAttribute("listaNacionalidade");
	List<String> listaNaturalidade = (List<String>)request.getAttribute("listaNaturalidade");
	List<String> listaSexo = (List<String>)request.getAttribute("listaSexo");
	%>

	<form action="CandidatoController" method = "get">
		<input type = "hidden" name = "tela" value = "informacao.jsp">
		<h3>Mãe</h3>
		<input type = "text" name = "nomeDaMae">
		
		<h3>Pai</h3>
		<input type = "text" name = "nomeDoPai">
		
		<h3>Nascimento</h3>
		<input type = "text" name = "dataNascimento">
		
		<h4>Nacionalidade</h4>
		<select name="nacionalidade">
			<%for(String n : listaNacionalidade){%>
			<option><%=n%></option>
			<%}%>
		</select>
		
		<h4>Naturalidade</h4>
		<select name="naturalidade">
			<%for(String n : listaNaturalidade){%>
			<option><%=n%></option>
			<%}%>
		</select>
		
		<h4>Sexo</h4>
		<select name="sexo">
			<%for(String s : listaSexo){%>
			<option><%=s%></option>
			<%}%>
		</select>
		
		<h4>Estado Civil</h4>
		<select name="estadoCivil">
			<%for(String e : listaEstadoCivil){%>
			<option><%=e%></option>
			<%}%>
		</select>
		<hr>
				
	</form>
	<form action = "CandidatoController" method = "post">
		<hr>
		<input type="submit" value = "Cadastrar">  
	</form>
	
</body>
</html>