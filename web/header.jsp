<%-- 
    Document   : registrate
    Created on : May 26, 2016, 12:03:12 AM
    Author     : leandro araneda
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="favicon.ico">

    <title>Biblioteca</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <link href="css/bootstrap-theme.min.css" rel="stylesheet"/>
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/navbar-fixed-top.css" rel="stylesheet">
    <link href="css/box.css" rel="stylesheet">
    <link href="css/form.css" rel="stylesheet">
    <link href="css/login.css" rel="stylesheet">
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>
      <!-- Barra de Navegación -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
            <a class="navbar-brand" href="index.jsp"><h4>Biblioteca Colegio Cristiano Curicó</h4></a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <%
                if((String)session.getAttribute("nombre")!=null){
                   %>
          <ul class="nav navbar-nav">
              <li><a href="servlet_usuarios?p=12"><h5>Tus Préstamos</h5></a></li>  
          </ul>
                   <% } %>
            <%
                if((String)session.getAttribute("nombre2")!=null){
                   %>
          <ul class="nav navbar-nav">
              <li><a href="servlet_usuarios?p=4"><h5>Alumnos</h5></a></li>
              <li><a href="servlet_usuarios?p=11"><h5>Préstamos</h5></a></li>
          </ul>
                   <% } %>
          <ul class="nav navbar-right top-nav">  
                <li>
                   
                    <!-- Mostrar datos de usuario -->
                    
                    <font>
                    <% 
                        
                        if((String)session.getAttribute("nombre")!=null){
                         
                       out.println("<a href=servlet_usuarios?p=1>");
                            out.println("Hola "+
                            (String)session.getAttribute("nombre"));
                        out.println("</a>");
                        out.println("<button><a href=servlet_usuarios?p=2>Cerrar Sesión</a></button>");
                        }else{
                            if((String)session.getAttribute("nombre2")!=null){
                              out.println("<a href=servlet_usuarios?p=13>");
                              out.println("Hola "+
                             (String)session.getAttribute("nombre2"));
                             out.println("</a>");
                             out.println("<button><a href=servlet_usuarios?p=2>Cerrar Sesión</a></button>");  
                            }else{
                    %>
                    </font>
                  
                    <form action="servlet_usuarios?p=1" method="POST" id="signin" class="navbar-form pull-right form-horizontal" role="form">
                            <div class="input-group input-group-sm">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input id="user" type="text" class="form-control input-sm" name="user" value="" placeholder="Ingrese Rut" input pattern=".{12,}" required title="El rut debe tener 12 caracteres" maxlength="12"required>                                        
                            </div>

                            <div class="input-group input-group-sm">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                <input id="password" type="password" class="form-control input-sm" name="pass" value="" placeholder="Password">                                        
                            </div>

                            <button type="submit" class="btn btn-primary">Login</button>
                    </form>
                        <% } 
                     }%>
                </li>    
          </ul>  
        </div><!--/.nav-collapse -->
      </div>
    </nav>
      <!-- Fin Barra de Navegación -->
    <!-- container -->  
    
        <div class="container">