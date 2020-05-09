<%-- 
    Document   : student
    Created on : 21/04/2019, 03:57:22 PM
    Author     : Rodrigo
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Apoyo para el Aprendizaje</title>
        <link href="css/signin.css" rel="stylesheet">
        <link rel="stylesheet" href="./css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }
            
            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>  
    </head>
    
    <body class="text-center">
        <s:form action="Login" method="post" validate="false" cssClass="form-signin">
            <img class="mb-4" src="img/applogo.gif" alt="logo" width="72" height="72">
            <h1 class="h3 mb-3 font-weight-normal">Iniciar sesión</h1>
            
            <br>            
            <s:textfield theme="simple" type="email" id="inputEmail" cssClass="form-control" placeholder="Correo electronico" name="usuario" requiredLabel="true" onfocus="true"/>
            <s:password theme="simple" cssClass="form-control" id="inputPassword" placeholder="Contraseña" requiredLabel="true" name="contrasena" />    
            <s:submit  theme="simple" cssClass="btn btn-lg btn-primary btn-block" value="Iniciar Sesión" />
            <hr class="mb-4">
            <p class="mb-0 text-right"><s:a href="./register.jsp">¿Nuevo usuario? Registrate aqui</s:a></p>
        </s:form>
               
               
         
                
            
        
    </body>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <script src="./js/bootstrap.min.js"></script>
</html>
