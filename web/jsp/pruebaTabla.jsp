<%-- 
    Document   : administrador
    Created on : 12/11/2017, 12:38:59 AM
    Author     : Rodrigo
--%>
<%@ page import="java.sql.*" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
		<title>Bienvenido: Administrador </title>
	</head>
	<body>
		<jsp:useBean id="manejador" scope="session" class="beanDB.DB"></jsp:useBean>
		<h1>
			Bienvenido 
			<s:property value="usuario"/>
			!
		</h1>
		<div align="center">
			<%                
				ResultSet rs=null;
				manejador.setConnection("com.mysql.jdbc.Driver","jdbc:mysql://localhost/LSM");
				rs=manejador.executeQuery("SELECT * FROM user");
				out.println("<table class=\"table\"><tr><th scope=\"col\">#</th><th scope=\"col\">Nombre</h><th scope=\"col\">Contrasena</th><th scope=\"col\">Tipo</th><th scope=\"col\" colspan=\"2\" colspan=\"text-align: center\">Acciones</th>");
				while(rs.next()){
				    out.println("<tr><td>"+rs.getString("user.idUser")+"</td><td>"+rs.getString("user.email")+"</td><td>"+rs.getString("user.password")+"</td><td>"+manejador.roleToString(rs.getString("user.role"))+"</td>"
				             + "<td><a class=\"btn btn-primary\" href='actualizaUsuario.jsp?idUser="+rs.getString("user.idUser")+"&email="+rs.getString("user.email")+"&password="+rs.getString("user.password")+"&rol="+manejador.roleToString(rs.getString("user.role"))+"'>Modificar</a></td>"
				             + "<td><a class=\"btn btn-danger\" href='deleteDiagram.action?idUser="+rs.getString("user.idUser")+"'>Eliminar</a></td></tr>");
				}
				manejador.closeConnection();
				%>
		</div>
		<div>
			<h1>Menu</h1>
			<a href="register.jsp">Registrar usuario</a>
			<br />
			<br />
			<br />
		</div>
	</body>
</html>