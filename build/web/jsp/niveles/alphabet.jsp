<%-- 
	Document   : alphabet
	Created on : 21/04/2019, 03:57:22 PM
	Author     : Rodrigo
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
		<title>SAALSM - Abecedario</title>
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
		<link rel="stylesheet" href="../../css/bootstrap.min.css">
		<!-- Our Custom CSS --> 
		<link rel="stylesheet" href="../../css/style2.css">
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
						<a href="../student.jsp" role="button">
						<i class="material-icons fa fa-home"></i>  Inicio
						</a>
					</li>
					<li>
						<a href="../myInfo.jsp" role="button">
						<i class="material-icons fa fa-user-circle"></i>  Mi cuenta
						</a>
					</li>
					<li>
                                                <a href="../keepLearning.jsp" role="button">
						<i class="material-icons fa fa-american-sign-language-interpreting"></i>  Continuar aprendiendo
						</a>
					</li>
					<li>
						<a href="../myProgress.jsp" role="button">
						<i class="material-icons fa fa-tasks"></i>  Mi avance
						</a>
					</li>
					<li>
						<a href="../myGroup.jsp" role="button">
						<i class="material-icons fa fa-users"></i>  Mi grupo
						</a>
					</li>
					<br>
					<li>
						<a href="../sessionClosed.jsp" role="button">
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
						<img src="../../img/systemName.gif" width="30" height="30" class="d-inline-block align-top" alt="">
						Sistema de Apoyo para el Aprendizaje de Lengua de Señas Mexicana
						</a>
						<button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<i class="fas fa-align-justify"></i>
						</button>
						<s:div cssClass="collapse navbar-collapse" id="navbarSupportedContent">
							<ul class="nav navbar-nav ml-auto">
								<li class="nav-item active">
									<a class="btn nav-link" href="../student.jsp" role="button"><i class="material-icons fa fa-home"></i>  Inicio</a>
								</li>
								<li class="nav-item">
									<a class="btn nav-link" href="../myInfo.jsp" role="button"><i class="material-icons fa fa-user-circle"></i>  Mi cuenta</a>
								</li>
								<li>
									<a href="../sessionClosed.jsp" class="btn nav-link" href="#" role="button"><i class="material-icons fa fa-power-off"></i>  Cerrar sesión</a>
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
				<s:div cssClass="container marketing">
					<!-- Three columns of text below the carousel -->
					<s:div cssClass="row">
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra A</title>
								<image href="../../img/signs/a.png" height="140" width="110"/>
							</svg>
							<h2>Letra A</h2>
							<p>
                                                            <a class="btn btn-primary" href="a.jsp" role="button"><i class="material-icons">chevron_right</i></a>
                                                            <a class="btn btn-success" href="" role="button"><i class="material-icons md-inactive">check</i></a>
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra B</title>
								<image href="../../img/signs/b.png" height="140" width="110"/>
							</svg>
							<h2>Letra B</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-success" href="#" role="button"><i class="material-icons md-inactive">check</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra C</title>
								<image href="../../img/signs/c.png" height="140" width="110"/>
							</svg>
							<h2>Letra C</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra D</title>
								<image href="../../img/signs/d.png" height="140" width="110"/>
							</svg>
							<h2>Letra D</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra E</title>
								<image href="../../img/signs/e.png" height="140" width="110"/>
							</svg>
							<h2>Letra E</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra F</title>
								<image href="../../img/signs/f.png" height="140" width="110"/>
							</svg>
							<h2>Letra F</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra G</title>
								<image href="../../img/signs/g.png" height="140" width="110"/>
							</svg>
							<h2>Letra G</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra H</title>
								<image href="../../img/signs/h.png" height="140" width="110"/>
							</svg>
							<h2>Letra H</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra I</title>
								<image href="../../img/signs/i.png" height="140" width="110"/>
							</svg>
							<h2>Letra I</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra J</title>
								<image href="../../img/signs/j.png" height="140" width="110"/>
							</svg>
							<h2>Letra J</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra K</title>
								<image href="../../img/signs/k.png" height="140" width="110"/>
							</svg>
							<h2>Letra K</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>                        
							</p>
						</s:div>
						<s:div cssClass="col-lg-4 text-center">
							<svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
								<title>Letra L</title>
								<image href="../../img/signs/l.png" height="140" width="110"/>
							</svg>
							<h2>Letra L</h2>
							<p>
								<a class="btn btn-primary" href="niveles/alphabet.jsp" role="button"><i class="material-icons">chevron_right</i></a>                            
								<a class="btn btn-warning" href="#" role="button"><i class="material-icons md-inactive">play_arrow</i></a>
							</p>
						</s:div>
					</s:div>
					<!-- /.row -->
					<!-- START THE FEATURETTES -->
					<!-- /END THE FEATURETTES -->
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