<%-- 
    Document   : listar_prestamos_alum
    Created on : Jun 14, 2016, 1:09:15 PM
    Author     : leandro araneda
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"/>
<br/>
<br/>
<form action="servlet_usuarios" method="POST">
<div class="row">
        <div class="col-md-12">
            <c:forEach items="${listac}" var="fila">
        <h2>Préstamos <c:out value="${fila.per_nombre}"/> <c:out value="${fila.per_apellido}"/></h2>
        <div class="table-responsive"> 
<table id="mytable" class="table table-bordred table-striped">
    <thead>
        <tr>
            <th><h4>Libro</h4></th>
            <th><h4>Fecha y Hora</h4></th>
        </tr>
    </thead>
    <tbody>
        
            <tr>
                <td><h6><c:out value="${fila.lib_nombre}"/></h6></td>
                <td><h6><c:out value="${fila.fecha_prestamo}"/></h6></td>
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
