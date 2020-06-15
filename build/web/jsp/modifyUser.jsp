<%-- 
	Document   : modifyUser
	Created on : 14/06/2020, 03:33:03 PM
	Author     : rpfce
	--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
<!doctype html>
<html>
	<!-- Head  -->
	<head>
		<title>SAALSM - Mi cuenta</title>
		<link href="../css/signin.css" rel="stylesheet">
		<style>
			.bd-placeholder-img{
			font-size: 1.125rem;
			text-anchor: middle ;
			-webkit-user-select: none;
			-moz-user-select: none;
			-ms-user-select: none;
			user-select: none;
			}
			@media (min-width: 768px){
			.bd-placeholder-img-lg{
			font-size: 3.5rem;
			}                
			}
		</style>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Collapsible sidebar using Bootstrap 4</title>
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
		<!-- Bootstrap CSS CDN -->
		<link rel="stylesheet" href="../css/bootstrap.min.css">
		<!-- Our Custom CSS --> 
		<link rel="stylesheet" href="../css/style2.css">
		<!-- Scrollbar Custom CSS -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
		<!-- Font Awesome JS -->
		<script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
		<script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
	</head>
	<!-- Head  -->
	<body class="text-center">
		<s:div cssClass="wrapper">
			<!-- Barra lateral  -->
			<nav id="sidebar">
				<s:div cssClass="sidebar-header"></s:div>
				<s:div cssClass="sidebar-header"></s:div>
				<s:div cssClass="sidebar-header"></s:div>
				<ul class="list-unstyled CTAs">
					<li>
						<a href="admin.jsp" role="button">
						<i class="material-icons fa fa-home"></i>  Inicio
						</a>
					</li>
					<li>
						<a href="myInfo.jsp" role="button">
						<i class="material-icons fa fa-user-circle"></i>  Mi cuenta
						</a>
					</li>
					<li>
						<a href="validateUser.jsp" role="button">
						<i class="material-icons fa fa-users"></i>  Validar usuarios
						</a>
					</li>
					<li>
						<a href="addUser.jsp" role="button">
						<i class="material-icons fa fa-user-plus"></i>  Agregar usuario
						</a>
					</li>
					<li>
						<a href="appUsers.jsp" role="button">
						<i class="material-icons fa fa-user"></i>  Ver usuarios
						</a>
					</li>
					<br>
					<li>
						<a href="sessionClosed.jsp" role="button">
						<i class="material-icons fa fa-power-off"></i>  Cerrar sesión
						</a>
					</li>
				</ul>
			</nav>
			<!-- Barra lateral  -->
			<!-- Menu superior  -->
			<s:div id="nav-var">
				<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
					<s:div cssClass="container-fluid">
						<button type="button" id="sidebarCollapse" class="btn btn-dark">
						<i class="fa fa-angle-down"></i>
						</button>
						<a id="sidebarCollapse" class="navbar-brand" href="#">
						<img src="../img/systemName.gif" width="30" height="30" class="d-inline-block align-top" alt="">
						Sistema de Apoyo para el Aprendizaje de Lengua de Señas Mexicana
						</a>
						<button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<i class="fas fa-align-justify"></i>
						</button>
						<s:div cssClass="collapse navbar-collapse" id="navbarSupportedContent">
							<ul class="nav navbar-nav ml-auto">
								<li class="nav-item">
									<a class="btn nav-link" href="admin.jsp" role="button"><i class="material-icons fa fa-home"></i>  Inicio</a>
								</li>
								<li class="nav-item">
									<a class="btn nav-link" href="myInfo.jsp" role="button"><i class="material-icons fa fa-user-circle"></i>  Mi cuenta</a>
								</li>
								<li>
									<a href="sessionClosed.jsp" class="btn nav-link" href="#" role="button"><i class="material-icons fa fa-power-off"></i>  Cerrar sesión</a>
								</li>
							</ul>
						</s:div>
					</s:div>
				</nav>
			</s:div>
			<!-- Menu superior  -->
			<!-- Contenido  -->
			<s:div id="content">
				<br>
				<br>
				<br>
				<!-- Carrusel  -->
				<!-- Carrusel  -->
				<!-- Contenedores  -->
				<s:div cssClass="line"></s:div>
				<div class="col-md-6 order-md-4 offset-md-3">
				<s:form action="modifyUser.action" method="post" validate="true">
					<h1 class="h2 mb-3 font-weight-normal">Modificar usuario</h1>
					<br>
					<s:hidden theme="simple" type="text" id="inputEmail" cssClass="form-control" placeholder="Identificador" name="idUser" requiredLabel="true" onfocus="true" value="%{#parameters.idUser}"/>
                                        <!--Corre electrónico-->
                                        <s:div cssClass="row">
                                            <s:div cssClass="input-group col-md-6 mb-3">
                                                    <s:div cssClass="input-group-prepend">
                                                            <span class="input-group-text">@</span>
                                                    </s:div>
                                                    <s:textfield theme="simple" type="email" id="inputEmail" cssClass="form-control" placeholder="Correo electrónico" value="%{#parameters.email}" disabled="true"/>
                                            </s:div>
                                            <s:div cssClass="input-group col-md-6 mb-3">
                                                    <s:div cssClass="input-group-prepend">
                                                            <span class="input-group-text">@</span>
                                                    </s:div>
                                                    <s:textfield theme="simple" type="email" id="inputEmail" cssClass="form-control" placeholder="Correo electrónico" name="email" requiredLabel="true" onfocus="true" value="%{#parameters.email}"/>
                                            </s:div>
                                        </s:div>
                                        <!--Corre electrónico-->
					<br>
                                        <!--Contraseña-->
                                        <s:div cssClass="row">
					<s:div cssClass="input-group col-md-4 mb-3">
						<s:div cssClass="input-group-prepend">
							<span class="input-group-text">&#x1f512</span>
						</s:div>
                                                <s:textfield theme="simple" type="text" id="inputPassword" cssClass="form-control" placeholder="Contraseña" name="password" value="%{#parameters.password}" disabled="true"/>
					</s:div>
					<s:div cssClass="input-group col-md-4 mb-3">
						<s:div cssClass="input-group-prepend">
							<span class="input-group-text">&#x1f512</span>
						</s:div>
						<s:textfield theme="simple" type="text" id="inputPassword" cssClass="form-control" placeholder="Contraseña" name="password" requiredLabel="true" onfocus="true" value="%{#parameters.password}"/>
					</s:div>
					<s:div cssClass="input-group col-md-4 mb-3">
						<s:div cssClass="input-group-prepend">
							<span class="input-group-text">&#x1f512</span>
						</s:div>
						<s:textfield theme="simple" type="text" id="inputPassword" cssClass="form-control" placeholder="Contraseña" name="passwordVal" requiredLabel="true" onfocus="true" value="%{#parameters.password}"/>
					</s:div>
                                        </s:div>
                                        <!--Contraseña-->
					<br>
					<s:div cssClass="mb-3">
						<s:label>Tipo de usuario</s:label>
						<select name="role" class="custom-select d-block w-100" required >
							<option value="%{#parameters.rol}">Tipo de usuario</option>
							<option>Administrador</option>
							<option>Profesor</option>
							<option>Estudiante</option>
						</select>
						<br>
					</s:div>
					<br>
					<s:submit  theme="simple" cssClass="btn btn-lg btn-success btn-block" value="Actualizar" />
				</s:form>
                                </div>
				<!-- Contenedores  -->
				<hr class="featurette-divider">
				<!-- Footer  -->
				<footer style="position: fixed; bottom: 0px;">
					<p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo &middot; <a href="#">Acerca de</a> &middot; <a href="#">Ayuda</a></p>
				</footer>
				<!-- Footer  -->            
			</s:div>
			<!-- Contenido  -->
		</s:div>
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<!-- Popper.JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
		<!-- Bootstrap JS -->
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
		<!-- jQuery Custom Scroller CDN -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function () {
			    $("#sidebar").mCustomScrollbar({
			        theme: "minimal"
			    });
			    
			    $('#sidebarCollapse').on('click', function () {
			        $('#sidebar, #content').toggleClass('active');
			        $('.collapse.in').toggleClass('in');
			        $('a[aria-expanded=true]').attr('aria-expanded', 'false');
			    });
			});
		</script>
	</body>
</html>