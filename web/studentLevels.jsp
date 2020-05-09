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
<!doctype html>
<html>
    <head>
        <title>Módulos disponibles</title>
        <style>
            .bd-placeholder-img{
                font-size: 1.125rem;
                text-anchor: middle;
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
        <!-- Bootstrap CSS CDN -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <!-- Our Custom CSS -->
        <link rel="stylesheet" href="css/style2.css">
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
        <!-- Font Awesome JS -->
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
    </head>
    <body>
        <s:div cssClass="wrapper">
            <!-- Sidebar  -->
        <nav id="sidebar">
            <s:div cssClass="sidebar-header">
            </s:div>
            <s:div cssClass="sidebar-header">
            </s:div>
            <s:div cssClass="sidebar-header">
            </s:div>
            <ul class="list-unstyled components">
                <li>
                    <a href="student.jsp">Inicio</a>
                </li>
                <li>
                    <a href="#">Mi aprendizaje</a>
                </li>
                <li>
                    <a href="#">Mi cuenta</a>
                </li>
                <li>
                </li>
            </ul>
            <ul class="list-unstyled CTAs">
                <br>
                <br>
                <li>
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="window.location='register.jsp'">Crear cuenta</button>
                </li>
                <br>
                <li>
                    <button class="btn btn-outline-danger my-2 my-sm-0" type="submit" onclick="window.location='index.jsp'">Cerrar sesión</button>
                </li>
            </ul>
        </nav>
        <!-- Sidebar  -->
        <!-- Page Content  -->
        <s:div id="nav-var">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
                <s:div cssClass="container-fluid">
                    <button type="button" id="sidebarCollapse" class="btn btn-dark">
                        <i class="fa fa-angle-down"></i>
                    </button>
                    <a id="sidebarCollapse" class="navbar-brand" href="#">
                        <img src="./img/applogo.gif" width="30" height="30" class="d-inline-block align-top" alt="">
                        Sistema de Apoyo para el Aprendizaje de Lengua de Señas Mexicana
                    </a>
                    <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <i class="fas fa-align-justify"></i>
                    </button>
                    <s:div cssClass="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="student.jsp">Inicio</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="#">Mi aprendizaje</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Mi cuenta</a>
                            </li>
                            <li>
                                <button class="btn btn-outline-danger my-2 my-sm-0 btn-sm" type="submit" onclick="window.location='index.jsp'">Cerrar sesión</button>
                            </li>
                        </ul>
                    </s:div>
                </s:div>
            </nav>
        </s:div>
        <s:div id="content">
            <!-- Sidebar  -->
            <br>
            <br>
            <br>
            <s:div id="myCarousel" cssClass="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <s:div cssClass="carousel-inner">
                    <s:div cssClass="carousel-item active">
                        <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
                            <rect width="100%" height="100%" fill="#777"/>
                        </svg>
                        <s:div cssClass="container">
                            <s:div cssClass="carousel-caption text-left">
                                <h3>Lengua de Señas Mexicana</h3>
                                <p><a class="btn btn-sm btn-primary" href="#" role="button">Aprender más</a></p>
                            </s:div>
                        </s:div>
                    </s:div>
                    <s:div cssClass="carousel-item">
                        <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
                            <rect width="100%" height="100%" fill="#777"/>
                        </svg>
                        <s:div cssClass="container">
                            <s:div cssClass="carousel-caption text-left">
                                <h3>Continuar aprendizaje</h3>
                                <p><a class="btn btn-sm btn-primary" href="#" role="button">Ir</a></p>
                            </s:div>
                        </s:div>
                    </s:div>
                    <s:div cssClass="carousel-item">
                        <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img">
                            <rect width="100%" height="100%" fill="#777"/>
                        </svg>
                        <s:div cssClass="container">
                            <s:div cssClass="carousel-caption text-left">
                                <h3>Acerca de</h3>
                                <p><a class="btn btn-sm btn-primary" href="#" role="button">Ir</a></p>
                            </s:div>
                        </s:div>
                    </s:div>
                </s:div>
                <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#myCarousel" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </s:div>
            <s:div cssClass="line"></s:div>
            <s:div cssClass="container marketing">
                <!-- Three columns of text below the carousel -->
                <s:div cssClass="row">
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Abecedario</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de las letras del abecedario.</p>
                        <p><a class="btn btn-secondary" href="jsp/niveles/abecedario.jsp" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Números</h2>
                        <p>Nivel donde se podrá poner en práctica las señas los números naturales, así como los números ordinales.</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Colores</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de los diversos colores</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Alimentos</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de diversas palabras relacionadas con los alimentos</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Familia</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de los integrantes de una familia y palabras relacionadas con el concepto familia</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Animales</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de diferentes especies animales</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>Cuerpo humano</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de diferentes partes del cuerpo humano.</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    <s:div cssClass="col-lg-4 text-center">
                        <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: 140x140">
                            <title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#777"/>
                            <text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                        </svg>
                        <h2>República Mexicana</h2>
                        <p>Nivel donde se podrá poner en práctica las señas de los nombres de los diferentes estados de la república.</p>
                        <p><a class="btn btn-secondary" href="#" role="button">Ir &raquo;</a></p>
                    </s:div>
                    <!-- /.col-lg-4 -->
                    
                </s:div>
                <!-- /.row -->
                <!-- START THE FEATURETTES -->
                <!-- /END THE FEATURETTES -->
            </s:div>
            <!-- /.container -->
            <hr class="featurette-divider">
            <footer class="container text-center">
                <p>Flores Castro Rodrigo Pavel<br>
                    Rodriguez García Daniela<br>
                    Monroy García José Eduardo<br>
                </p>
                <p>M. en C. Rubén Peredo Valderrama<br>
                    M. en C. Gabriela de Jesús Lopéz Ruiz
                </p>
                <p>&copy; Instituto Politécnico Nacional. Escuela Superior de Cómputo &middot; <a href="#">Acerca de</a> &middot; <a href="#">Ayuda</a></p>
            </footer>
        </s:div>
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