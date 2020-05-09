<%-- 
    Document   : register
    Created on : 22/04/2019, 11:01:25 PM
    Author     : Rodrigo
--%>
    
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Jekyll v3.8.5">
        <title>Registro</title>
            
        <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/checkout/">
            
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
        <!-- Custom styles for this template -->
        <link href="../css/form-validation.css" rel="stylesheet">
    </head>
    <body class="bg-light">
        <s:div cssClass="container">
            <s:div cssClass="py-5 text-center" theme="simple">
                <img class="d-block mx-auto mb-4" src="img/lsmlogo.png" alt="" width="72" height="72">
                <h2>Registro</h2>
            </s:div>
            <s:div cssClass="row">    
                <s:div cssClass="col-md-6 order-md-4 offset-md-3">                    
                    <s:form cssClass="needs-validation form-signin" action="Register"><!-- Agregar novalidate -->
                        <s:div cssClass="mb-3">
                            <s:label theme="simple" for="username">Correo electrónico <span class="text-muted">(Obligatorio)</span></s:label>
                            <s:div cssClass="input-group">
                                <s:div cssClass="input-group-prepend">
                                    <span class="input-group-text">@</span>
                                </s:div>
                                <s:textfield key="username" type="email" cssClass="form-control" label="Correo electrónico" theme="simple" requiredLabel="true" onfocus="true"/>
                                <s:div cssClass="invalid-feedback" style="width: 100%;">
                                    Your username is required.
                                </s:div>
                            </s:div>
                        </s:div>
                            
                        <s:div cssClass="mb-3">
                            <s:label theme="simple" for="password">Contraseña <span class="text-muted">(Obligatorio)</span></s:label>
                            <s:password name="password" cssClass="form-control" placeholder="Contraseña" theme="simple"/>
                            <s:div cssClass="invalid-feedback">
                                Please enter a valid email address for shipping updates.
                            </s:div>
                        </s:div>
                            
                        <s:div cssClass="mb-3">
                            <s:label theme="simple" for="password2">Repetir contraseña</s:label>
                            <s:password name="password2" cssClass="form-control" placeholder="Repetir contraseña" theme="simple" requiredLabel="true"/>
                            <s:div cssClass="invalid-feedback">
                                Please enter your shipping address.
                            </s:div>
                        </s:div>
                        <s:div cssClass="mb-3">
                            <s:label for="country">Tipo de usuario</s:label>
                            <select name="role" class="custom-select d-block w-100" required>
                                <option value="">Tipo de usuario</option>
                                <option>Estudiante</option>
                                <option>Profesor</option>
                            </select>
                            <br>
                        </s:div>
                            
                        <s:div cssClass="mb-3">
                            <s:label theme="simple" for="clave">Clave de grupo <span class="text-muted">(Opcional)</span></s:label>
                            <s:textfield name="groupkey" type="text" cssClass="form-control" placeholder="Clave de grupo" theme="simple"/>
                        </s:div> <hr class="mb-3">
                        <s:submit cssClass="btn btn-primary btn-lg btn-block" type="submit" theme="simple" label="Completar registro"/>
                    </s:form>
                </s:div>
            </s:div>
                
        <footer class="my-5 pt-5 text-muted text-center text-small">
            <p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo &middot; <a href="#">Acerca de</a> &middot; <a href="#">Ayuda</a></p>
        </footer>
            
    </s:div>
        
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="/docs/4.3/assets/js/vendor/jquery-slim.min.js"><\/script>')</script><script src="/docs/4.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-xrRywqdh3PHs8keKZN+8zzc5TX0GRTLCcmivcbNJWm2rs5C8PRhcEn3czEjhAO9o" crossorigin="anonymous"></script>
    <script src="./js/form-validation.js"></script></body>
</html>