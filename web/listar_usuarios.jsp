<%-- 
    Document   : listar_usuarios
    Created on : Jun 8, 2016, 10:01:44 PM
    Author     : leandro araneda
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<form action="servlet_usuarios" method="POST">
<div class="row">
        <div class="col-md-12">
        <h2>Alumnos</h2>
        <div class="table-responsive"> 
<table id="mytable" class="table table-bordred table-striped">
    <thead>
        <tr>
            <th><h4>Rut</h4></th>
            <th><h4>Nombre</h4></th>
            <th><h4>Apellido</h4></th>
            <th><h4>Curso</h4></th>
            <th colspan="3"><h4>Operaciones</h4></th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${lista}" var="fila">
            <tr>
                <td><h6><c:out value="${fila.per_rut}"/></h6></td>
                <td><h6><c:out value="${fila.per_nombre}"/></h6></td>
                <td><h6><c:out value="${fila.per_apellido}"/></h6></td>
                <td><h6><c:out value="${fila.cur_nombre}"/></h6></td>
                <td>
                    <a href="servlet_usuarios?p=8&ru=${fila.per_rut}">
                        <i class="glyphicon glyphicon-list-alt"></i>
                    </a>
                </td>
                <td>
                    <a href="servlet_usuarios?p=9&r=${fila.per_rut}">
                        <i class="glyphicon glyphicon-pencil"></i>
                    </a>
                </td>
                <td>
                    <a href="servlet_usuarios?p=5&rut=${fila.per_rut}">
                        <i class="glyphicon glyphicon-trash"></i>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
            </div>
        </div>
	</div>
</form>
    <!-- /.modal-content --> 
<jsp:include page="footer.jsp"/>
