<%-- 
    Document   : addUser
    Created on : 11/06/2020, 11:34:27 PM
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
		<title>SAALSM - Agregar usuarios</title>
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
	<body>
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
				<s:div cssClass="row">
				<s:div cssClass="col-md-6 order-md-4 offset-md-3">
					<s:form cssClass="needs-validation form-signin" action="AdminRegister">
						<!-- Agregar novalidate -->
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
							<s:div cssClass="input-group">
								<s:div cssClass="input-group-prepend">
									<span class="input-group-text">&#x1f512</span>
								</s:div>
								<s:password name="password" cssClass="form-control" placeholder="Contraseña" theme="simple"/>
								<s:div cssClass="invalid-feedback" style="width: 100%;">
									Please enter a valid email address for shipping updates.
								</s:div>
							</s:div>
						</s:div>
						<s:div cssClass="mb-3">
							<s:label theme="simple" for="password2">Repetir contraseña</s:label>
							<s:div cssClass="input-group">
								<s:div cssClass="input-group-prepend">
									<span class="input-group-text">&#x1f512</span>
								</s:div>
								<s:password name="password2" cssClass="form-control" placeholder="Repetir contraseña" theme="simple" requiredLabel="true"/>
								<s:div cssClass="invalid-feedback">
									Please enter your shipping address.
								</s:div>
							</s:div>
						</s:div>
						<s:div cssClass="mb-3">
							<s:label for="country">Tipo de usuario</s:label>
							<select name="role" class="custom-select d-block w-100" required>
								<option value="">Tipo de usuario</option>
                                                                <option>Administrador</option>
								<option>Profesor</option>
                                                                <option>Estudiante</option>
							</select>
							<br>
						</s:div>
						<s:div cssClass="mb-3">
							<s:label theme="simple" for="clave">Clave de grupo <span class="text-muted">(Opcional)</span></s:label>
							<s:textfield name="groupkey" type="text" cssClass="form-control" placeholder="Clave de grupo" theme="simple"/>
						</s:div>
						<hr class="mb-3">
						<s:submit cssClass="btn btn-success btn-lg btn-block" type="submit" theme="simple" label="Completar registro" value="Completar Registro"/>
					</s:form>
				</s:div>
			</s:div>
				<!-- Contenedores  -->
				<hr class="featurette-divider">
				<!-- Footer  -->
				<footer style="position: fixed; bottom: 0px;">
					<p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo 2020 &middot  <a href="#">Acerca de</a> &middot; <a href="#">Ayuda</a></p>
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